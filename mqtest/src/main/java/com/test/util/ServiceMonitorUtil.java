/**
 * 
 */
package com.test.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fosun.channel.mq.model.ReqMessage;
import com.fosun.channel.mq.model.ReqMsgHeader;
import com.fosun.channel.mq.model.RspMessage;
import com.fosun.component.base.exception.CommonException;
import com.fosun.component.base.util.DateUtil;
import com.fosun.component.base.util.PropertyConfigure;
import com.fosun.component.base.util.StringUtil;
import com.fosun.interf.monitor.service.MessageMonitorLogService;
import com.fosun.interf.monitor.service.ServicePubService;
import com.fosun.monitor.model.InterfaceServicePub;
import com.fosun.monitor.model.InterfaceSysCodeInfo;
import com.fosun.monitor.model.MessageMonitorLog;

/**
 * 渠道层、服务发布、查询、缓存 服务工具类
 *
 * @author 	yunbo.wei
 * @date 	2017年3月2日
 * @Copyright 
 *
 * <pre>
 * =================Modify Record=================
 * Modifier			date				Content
 * yunbo.wei		2017年3月2日			新增
 *
 * </pre>
 */
@Component
public class ServiceMonitorUtil {
	private static Logger logger = LoggerFactory.getLogger(ServiceMonitorUtil.class);
	
	@Autowired
	private ServicePubService servicePubService;
	@Autowired
	private MessageMonitorLogService messageMonitorLogService;
	/**
	 * 获取当前系统需要监控的队列名称
	 * jms中使用
	 * @return 监控队列
	 */
	public String getSysQueue(){
		//获取系统码
		InterfaceSysCodeInfo sSysCodeInfo = servicePubService.getSysCodeInfoByCode(getMySysCode());
		if(sSysCodeInfo != null){
			return sSysCodeInfo.getReqQueue();
		}
		throw new CommonException("找不到当前系统监控队列名称!");
	}
	
	/**
	 * 根据服务ID获取服务目的地队列名称
	 * @param serviceId
	 * @return
	 */
	public InterfaceSysCodeInfo getDestinationQueueByServiceId(String serviceId){
		//TODO 这里暂时直接查表，后续放到cache中
		InterfaceSysCodeInfo sysCodeInfo = servicePubService.getSysCodeInfoByServiceId(serviceId);
		return sysCodeInfo;
	}
	
	/**
	 * 根据服务ID获取DMZ层对外服务要请求的HTTP地址
	 * @param serviceId
	 * @return
	 */
	public String getDmzOutUrl(String serviceId){
		//TODO 这里暂时直接查表，后续放到cache中
		//获取发布的服务信息
		InterfaceServicePub InterfaceServicePub = servicePubService.getServicePubByServiceId(serviceId);
		if(InterfaceServicePub != null){
			return InterfaceServicePub.getDmzOutUrl();
		}
		return null;
	}
	
	/**
	 * 获取本系统系统代码
	 * @return
	 */
	public String getMySysCode(){
		return PropertyConfigure.getProperty("sysCode"); //config.properties中配置的系统名
	}
	
	/**
	 * 获取本系统返回队列
	 * @return
	 */
	public String getMySysRspQueue(){
		//获取系统码
		InterfaceSysCodeInfo sSysCodeInfo = servicePubService.getSysCodeInfoByCode(getMySysCode());
		if(sSysCodeInfo != null){
			return sSysCodeInfo.getRspQueue();
		}
		throw new CommonException("找不到当前系统返回队列名称!");
	}
	
	/**
	 * 重新填充部分报文头信息
	 * @return
	 */
	public ReqMessage fillReqMessage(ReqMessage reqMsg){
		if(reqMsg != null && reqMsg.getMsgHeader() != null && StringUtil.isNotEmpty(reqMsg.getMsgHeader().getService())){
			//如果关键字段不为空，才进行其他字段的填充
			ReqMsgHeader header = reqMsg.getMsgHeader();
			String serviceId = header.getService();	//服务名
			String sysCode = getMySysCode();	//当前系统
			if(StringUtil.isEmpty(sysCode)){
				throw new CommonException("本系统代码不能为空!");
			}
			//服务
			InterfaceServicePub servicePub = servicePubService.getServicePubByServiceId(serviceId);
			if(servicePub == null){
				throw new CommonException("服务名称:"+serviceId+"，没有注册发布!");
			}
			header.setFromSysCode(sysCode); //设置当前系统
			header.setToSysCode(servicePub.getSysCode()); //目标系统
			header.setTimestamp(DateUtil.getCurrentTime2()); //时间戳
//			header.setTransNo(SystemUtil.getBusiSerialNo(sysCode));	//交易码
		}
		return reqMsg;
	}
	
	/**
	 * 记录请求报文信息
	 * @param reqMessage
	 */
	public void recordReqMsgLog(ReqMessage reqMessage){
		if(reqMessage != null && reqMessage.getMsgHeader() != null){
			try {
				MessageMonitorLog record = new MessageMonitorLog();
				record.setRecordSysCode(getMySysCode()); //记录系统
				record.setFromSysCode(reqMessage.getMsgHeader().getFromSysCode()); //消息来源
				record.setToSysCode(reqMessage.getMsgHeader().getToSysCode()); //目标系统
				record.setTransNo(reqMessage.getMsgHeader().getTransNo()); //交易码
				record.setCreateTime(DateUtil.getCurrentTime3()); //时间戳
				record.setMessage(formatMessage(MessageUtil.obj2Json(reqMessage)));  //JSON报文
				//落地
				messageMonitorLogService.saveMessage(record);
			} catch (Exception e) {
				//不会因为记日志失败影响业务交易
				logger.error("日志记录异常",e);
			}
		}
	}
	
	/**
	 * 记录响应报文信息
	 * @param rspMessage
	 */
	public void recordRspMsgLog(RspMessage rspMessage){
		if(rspMessage != null && rspMessage.getRspMessageHeader() != null){
			try {
				MessageMonitorLog record = new MessageMonitorLog();
				record.setRecordSysCode(getMySysCode()); //记录系统
				record.setFromSysCode(rspMessage.getRspMessageHeader().getFromSysCode()); //消息来源
				record.setToSysCode(rspMessage.getRspMessageHeader().getToSysCode()); //目标系统
				record.setTransNo(rspMessage.getRspMessageHeader().getTransNo()); //交易码
				record.setCreateTime(DateUtil.getCurrentTime3()); //时间戳
				record.setMessage(formatMessage(MessageUtil.obj2Json(rspMessage)));  //JSON报文
				//落地
				messageMonitorLogService.saveMessage(record);
			} catch (Exception e) {
				//不会因为记日志失败影响业务交易
				logger.error("日志记录异常",e);
			}
		}
	}
	
	/**
	 * 因为数据库字段长度有限，所以如果超过字段长度，就截取处理
	 * @param jsonStr
	 * @return
	 */
	private String formatMessage(String jsonStr){
		if(StringUtil.isNotEmpty(jsonStr)){
			if(jsonStr.length() > 2000){
				jsonStr = jsonStr.substring(0, 2000);
			}
		}
		return jsonStr;
	}
}
