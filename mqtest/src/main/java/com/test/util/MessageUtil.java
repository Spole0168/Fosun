/**
 * 
 */
package com.test.util;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fosun.channel.mq.model.MethodParamModel;
import com.fosun.channel.mq.model.ReqMessage;
import com.fosun.channel.mq.model.ReqMsgHeader;
import com.fosun.channel.mq.model.RspMessage;
import com.fosun.channel.mq.model.RspMessageHeader;
import com.fosun.component.Constant;
import com.fosun.component.base.exception.CommonException;
import com.fosun.component.base.util.BeanUtil;
import com.fosun.component.base.util.DateUtil;
import com.fosun.component.base.util.StringUtil;

/**
 * MQ消息处理工具类
 *
 * @author 	yunbo.wei
 * @date 	2017年2月28日
 * @Copyright 
 *
 * <pre>
 * =================Modify Record=================
 * Modifier			date				Content
 * yunbo.wei		2017年2月28日			新增
 *
 * </pre>
 */
public class MessageUtil {
	private static Logger logger = LoggerFactory.getLogger(MessageUtil.class);
	@Autowired
//    private ServiceMonitorUtil serviceMonitorUtil;
	
	/**
	 * 将对象转为JSON报文，目前MQ必须使用JSON格式进行传输
	 * @param messageObj
	 * @return
	 */
	public static String obj2Json(Object messageObj){
		if(messageObj != null){
			return JSON.toJSONString(messageObj);
		}else{
			return null;
		}
	}
	
	/**
	 * 将JSON报文转为请求参数对象返回
	 * @param jsonMsg
	 * @return
	 */
	public static ReqMessage reqJson2Obj(String jsonMsg){
		if(jsonMsg != null && !jsonMsg.equals("")){
			return JSONObject.parseObject(jsonMsg,ReqMessage.class);
		}else{
			return null;
		}
	}
	
	/**
	 * 将响应JSON报文转为对象返回
	 * @param jsonMsg
	 * @return
	 */
	public static RspMessage rspJson2Obj(String jsonMsg){
		if(jsonMsg != null && !jsonMsg.equals("")){
			return JSONObject.parseObject(jsonMsg,RspMessage.class);
		}else{
			return null;
		}
	}
	
	/**
	 * 校验消息必输项（这里的校验，只校验消息本身的必输，不涉及业务校验）
	 * @param jsonMessage
	 * @return
	 */
	public static boolean validMessage(ReqMessage jsonMessage){
		if(jsonMessage ==null){
			throw new CommonException("查询消息不能为空!");
		}else{
			ReqMsgHeader reqHeader = jsonMessage.getMsgHeader();
			if(reqHeader == null){
				throw new CommonException("报文头不能为空!");
			}else{
				if(StringUtil.isEmpty(reqHeader.getService())){
					throw new CommonException("报文头服务名不能为空!");
				}
				if(StringUtil.isEmpty(reqHeader.getFromSysCode())){
					throw new CommonException("报文头当前系统代码不能为空!");
				}
				if(StringUtil.isEmpty(reqHeader.getToSysCode())){
					throw new CommonException("报文头目标系统代码不能为空!");
				}
				if(StringUtil.isEmpty(reqHeader.getTransNo())){
					throw new CommonException("报文头交易码不能为空!");
				}
				if(reqHeader.getFromSysCode().equals(reqHeader.getToSysCode())){
					//如果 消息源系统 = 目标系统，异常
					throw new CommonException("不能查询自系统服务!");
				}
			}
		}
		return true;
	}
	
	/**
	 * 从客户端拿到请求报文后，调用业务系统服务类进行处理，处理完成后拼装响应报文并返回
	 * @param jsonStr
	 * @return
	 */
	public static RspMessage executeService(ReqMessage jsonMessage){
		if(jsonMessage != null){
			RspMessage rspMessage = null;
			try {
				ReqMsgHeader msgHeader = jsonMessage.getMsgHeader();
				Map<String, Object> paramMap = jsonMessage.getParamMap();	//参数JSON
				paramMap.put("interfaceTransNo", msgHeader.getTransNo()); //内置交易No.
				//初始化消息，设置响应报文
				rspMessage = initRspMessage(msgHeader);
				String servcie = msgHeader.getService();
				//获取beanId
				String beanId = servcie.substring(0,servcie.lastIndexOf("."));
				//获取方法名
				String methodName = servcie.substring(servcie.lastIndexOf(".")+1);
				//获取服务对象
				Object obj = ApplicationUtil.getBean(beanId);
				//获取对应服务方法参数信息
				List<MethodParamModel> methodParamModelList = ReflectionUtils.getMethodParamInfo(obj, methodName);
				//方法参数值数组
				Object[] params = null;
				Class[] paramClassArray = null;
				if(methodParamModelList != null){
					//根据类型进行转换
					params = new Object[methodParamModelList.size()]; //初始化
					paramClassArray = new Class[methodParamModelList.size()]; //初始化
					for(int i=0;i<methodParamModelList.size();i++){
						//获取参数对象
						MethodParamModel methodParamModel = methodParamModelList.get(i);
						String paramName = methodParamModel.getParamName();	//方法参数名称
						Class clz = methodParamModel.getParamClz();	//参数类型
						Object param = paramMap.get(paramName);
						if(param == null){
							logger.warn("param "+param+"is null");
						}else{
							//转换报文类型-方法需要的类型
							param = changeParamMapByMethod(param,methodParamModel);
						}
						params[i] = param; //获取对象的值
						paramClassArray[i]= clz;
					}
				}
				logger.info("==ServiceId:"+obj.getClass().getName()+",方法名:"+methodName+",参数类型:"+paramClassArray);
				//获取方法
				Method addMethod = ReflectionUtils.getMethod(obj, methodName, paramClassArray);
				if(addMethod == null){
					throw new CommonException("E0001","服务接口不存在，请检查参数类型、个数、名称是否正确!");
				}
				Object rtnObj =  addMethod.invoke(obj, params);
				Map<String,Object> rspBody = new HashMap<String,Object>();
				rspBody.put("rtnMap", rtnObj);
				rspMessage.setRspBody(rspBody);
			}catch (CommonException e) {
				//重设报文头
				RspMessageHeader rspHeader = rspMessage.getRspMessageHeader();
				rspHeader.setStatus(Constant.TRANS_STATUS_FAIL);
				rspHeader.setErrorCode(e.getErrorCode());
				rspHeader.setErrorMsg(e.getErrorMessage());
				logger.error(e.getErrorMessage(),e);
			}catch (Exception e) {
				//重设报文头
				RspMessageHeader rspHeader = rspMessage.getRspMessageHeader();
				rspHeader.setStatus(Constant.TRANS_STATUS_FAIL);
				rspHeader.setErrorCode("E0001");	//通用异常码
				if(e.getCause()!= null && StringUtil.isNotEmpty(e.getCause().getMessage())){
					//获取服务方法内部抛出的异常原因
					logger.error(e.getCause().getMessage(),e.getCause());
					rspHeader.setErrorMsg(e.getCause().getMessage());
				}else{
					rspHeader.setErrorMsg("服务处理异常!");
					logger.error("服务处理异常",e);
				}
			}
			return rspMessage;
		}
		return null;
	}
	
	/**
	 * 在执行方法时根据方法类型进行部分类型的转换
	 * 因为中间经过json报文转换，所以部分类型无法直接转换
	 * 比如:BigDecimal / DATE 等
	 * @param paramMap
	 * @param methodParamModelList
	 * @return
	 */
	private static Object changeParamMapByMethod(Object param,MethodParamModel methodParamModel){
		if(param == null) return null;
		Class paramClass = methodParamModel.getParamClz();	//参数类型
		if("java.lang.String".equals(paramClass.getName())){
			//可能是jsonArray
			return param.toString();
		}
		if(!paramClass.getName().equals(param.getClass().getName())){
			//如果Map中数据类型同方法类型不一致，这里试着进行转换
			if(param != null){
				/**1、常规类型转换**/
				if(paramClass.getName().equals("int") || paramClass.getName().equals(Integer.class.getName())){
					//如果是BigDecimal，那么重新将Map中数据转换下
					return new Integer(param.toString());
				}
				if(paramClass.getName().equals("long") || paramClass.getName().equals(Long.class.getName())){
					//如果是BigDecimal，那么重新将Map中数据转换下
					return new Long(param.toString());
				}
				if(paramClass.getName().equals("double") || paramClass.getName().equals(Double.class.getName())){
					//如果是BigDecimal，那么重新将Map中数据转换下
					return new Double(param.toString());
				}
				if(paramClass.getName().equals("boolean") || paramClass.getName().equals(Boolean.class.getName())){
					//如果是BigDecimal，那么重新将Map中数据转换下
					return new Boolean(param.toString());
				}
				
				/**2、复杂类型转换**/
				if(paramClass.getName().equals(BigDecimal.class.getName())){
					//如果是BigDecimal，那么重新将Map中数据转换下
					return new BigDecimal(param.toString());
				}
				if(paramClass.getName().equals(Date.class.getName())){
					//如果是Date，那么重新将Map中数据转换下
					try {
						return new SimpleDateFormat("yyyyMMdd").parse(param.toString());
					} catch (ParseException e) {
						e.printStackTrace();
						throw new CommonException("日期类型参数转换异常,要求格式:yyyyMMdd，参数："+param.toString());
					}
				}
				if(paramClass.getName().equals(Timestamp.class.getName())){
					//如果是Timestamp，那么重新将Map中数据转换下
					try {
						return new SimpleDateFormat("yyyyMMddHHmmss").parse(param.toString());
					} catch (ParseException e) {
						e.printStackTrace();
						throw new CommonException("日期类型参数转换异常,要求格式:yyyyMMddHHmmss，参数："+param.toString());
					}
				}
				if(paramClass.equals(java.util.List.class)){
					try {
						if(param != null){
							ParameterizedType pt = methodParamModel.getPt(); //获取泛型
							if(param instanceof List){
								try {
									if(pt == null) return param; 
									Type [] params = pt.getActualTypeArguments();
									if ((params[0] instanceof Class)) {
										Class genericClazz = (Class)params[0]; //【4】 得到泛型里的class类型对象。
										if(genericClazz.getName().startsWith("com.")){
											//转list
											return BeanUtil.map2List((List<Map>)param, genericClazz);
										}else{
											//其他单类型，如String,int,Double等等
											//默认仍然为value，可以直接返回
											return param;
										}
									}else{
										logger.error("暂不支持list泛型套泛型类型");
										throw new CommonException("暂不支持list泛型套泛型类型");
									}
								} catch (ClassCastException e) {
									throw new CommonException("List 参数转换异常");
								}
							}else{
								throw new CommonException("List 参数转换异常");
							}
						}
					} catch (Exception e) {
						e.printStackTrace();
						throw new CommonException("List参数转换异常，参数："+param.toString());
					}
				}
				//其他类型试着用map2Bean进行处理，包括map/list/object
//				if(paramClass.getName().startsWith("com.") && param instanceof Map){
					//如果是业务对象,那么进行map2Bean的转换
					return BeanUtil.map2Bean((Map)param, paramClass);
//				}
			}
		}
		return param;
	}

	
	/**
	 * 初始化返回消息
	 * @param msgHeader
	 * @return
	 */
	public static RspMessage initRspMessage(ReqMsgHeader msgHeader){
		RspMessage rspMessage = new RspMessage();
		//初始化消息报文头
		RspMessageHeader rspMessageHeader = new RspMessageHeader();
		rspMessageHeader.setStatus(Constant.TRANS_STATUS_SUCCUSS); //默认交易成功 
		rspMessageHeader.setFromSysCode(msgHeader.getToSysCode()); //设置消息去向
		rspMessageHeader.setToSysCode(msgHeader.getFromSysCode());
		rspMessageHeader.setTransNo(msgHeader.getTransNo()); //交易码
		rspMessageHeader.setTimestamp(DateUtil.getCurrentTime2()); //时间戳
		rspMessage.setRspMessageHeader(rspMessageHeader);
		return rspMessage;
	}
	
	/**
	 * 校验目标系统是否需要加密
	 * 因为某些系统，比如支付系统已经做过加密，就无需再次加密处理
	 * 先简单处理，暂时按系统码来确定是否要加密
	 * @param sysCode
	 * @return
	 */
	public static boolean isNeedEncrypt(String sysCode){
		if("PAY".equals(sysCode)){
			return false;
		}
		return true;
	}
	
	
	public static void main(String[] args) {
//		String ss ="[{\"bankType\":\"CCB\",\"payCardno\":\"6217001210033942200\"}]";
		String ss ="{\"form\":[{\"bankType\":\"CCB\",\"payCardno\":\"6217001210033942200\"}]} ";
		Map<String, Object> responseMap = JSON.parseObject(ss, Map.class);
		System.out.println(11);
	}
		
}
