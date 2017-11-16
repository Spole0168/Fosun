package com.fosun.data.service.impl;

import java.util.Calendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.antgroup.zmxy.openplatform.api.DefaultZhimaClient;
import com.antgroup.zmxy.openplatform.api.ZhimaApiException;
import com.antgroup.zmxy.openplatform.api.request.ZhimaCreditAntifraudRiskListRequest;
import com.antgroup.zmxy.openplatform.api.request.ZhimaCreditAntifraudScoreGetRequest;
import com.antgroup.zmxy.openplatform.api.request.ZhimaCreditAntifraudVerifyRequest;
import com.antgroup.zmxy.openplatform.api.response.ZhimaCreditAntifraudRiskListResponse;
import com.antgroup.zmxy.openplatform.api.response.ZhimaCreditAntifraudScoreGetResponse;
import com.antgroup.zmxy.openplatform.api.response.ZhimaCreditAntifraudVerifyResponse;
import com.fosun.data.service.ZMXYService;
import com.fosun.data.service.model.ZMXYReq;
import com.fosun.data.util.PropertiesUtils;

@Service("ZMXYService")
public class ZMXYServiceImpl implements ZMXYService {
	
	//芝麻开放平台地址
    private String gatewayUrl     = PropertiesUtils.getPropertiesValue("zmxy.gatewayUrl");
    //商户应用 Id
    private String appId          = PropertiesUtils.getPropertiesValue("zmxy.appId");
    //商户 RSA 私钥
    private String privateKey     = PropertiesUtils.getPropertiesValue("zmxy.privateKey");
    //芝麻 RSA 公钥
    private String zhimaPublicKey = PropertiesUtils.getPropertiesValue("zmxy.zhimaPublicKey");
    
	
	Logger logger = LoggerFactory.getLogger(getClass());

	@Override
	public JSONObject zmxyCreditAntifraudRiskList(ZMXYReq ZMXYReq) {
	   ZhimaCreditAntifraudRiskListRequest req = new ZhimaCreditAntifraudRiskListRequest();
	   JSONObject json = null;
	   req.setChannel("apppc");//通道
	   req.setPlatform("zmop");//平台
	   req.setProductCode(ZMXYReq.getProductCode());// 必要参数  产品码
	   req.setTransactionId(getRandom());// 必要参数  商户请求唯一标志
	   req.setCertType("IDENTITY_CARD");// 必要参数 证件类型
	   req.setCertNo(ZMXYReq.getCertNo());// 必要参数  证件号码
	   req.setName(ZMXYReq.getName());// 必要参数  姓名
	   req.setMobile(ZMXYReq.getMobile());// 手机号
	   req.setEmail(ZMXYReq.getEmail());// 电子邮箱
	   req.setBankCard(ZMXYReq.getBankCard());// 银行卡号 
	   req.setAddress(ZMXYReq.getAddress());//  地址信息
	   req.setIp(ZMXYReq.getIp());// ip地址
	   req.setMac(ZMXYReq.getMac());// 物理地址
	   req.setWifimac(ZMXYReq.getWifimac());// wifi物理地址
	   req.setImei(ZMXYReq.getImei());// 国际移动设备标志
	   DefaultZhimaClient client = new DefaultZhimaClient(gatewayUrl, appId, privateKey, zhimaPublicKey);
	   try {
		   ZhimaCreditAntifraudRiskListResponse response =(ZhimaCreditAntifraudRiskListResponse)client.execute(req);
	       		json = JSONObject.parseObject(response.getBody());
	        } catch (ZhimaApiException e) {
	            e.printStackTrace();
	        }

		return json;
	}

	@Override
	public JSONObject zmxyCreditAntifraudVerify(ZMXYReq ZMXYReq) {
		ZhimaCreditAntifraudVerifyRequest req = new ZhimaCreditAntifraudVerifyRequest();
		JSONObject json = null;
		req.setChannel("apppc");//通道
		req.setPlatform("zmop");//平台
		req.setProductCode(ZMXYReq.getProductCode());// 必要参数  产品码
		req.setTransactionId(getRandom());// 必要参数  商户请求唯一标志
		req.setCertType("IDENTITY_CARD");// 必要参数 证件类型
		req.setCertNo(ZMXYReq.getCertNo());// 必要参数  证件号码
		req.setName(ZMXYReq.getName());// 必要参数  姓名
		req.setMobile(ZMXYReq.getMobile());// 手机号
		req.setEmail(ZMXYReq.getEmail());// 电子邮箱
		req.setBankCard(ZMXYReq.getBankCard());// 银行卡号 
		req.setAddress(ZMXYReq.getAddress());//  地址信息
		req.setIp(ZMXYReq.getIp());// ip地址
		req.setMac(ZMXYReq.getMac());// 物理地址
		req.setWifimac(ZMXYReq.getWifimac());// wifi物理地址
		req.setImei(ZMXYReq.getImei());// 国际移动设备标志
		DefaultZhimaClient client = new DefaultZhimaClient(gatewayUrl, appId, privateKey, zhimaPublicKey);
		try {
			ZhimaCreditAntifraudVerifyResponse response = (ZhimaCreditAntifraudVerifyResponse)client.execute(req);
		       	json = JSONObject.parseObject(response.getBody());
		    } catch (ZhimaApiException e) {
		        e.printStackTrace();
		   }

		return json;
	}

	@Override
	public JSONObject zmxyCreditAntifraudScore(ZMXYReq ZMXYReq) {
		ZhimaCreditAntifraudScoreGetRequest req = new ZhimaCreditAntifraudScoreGetRequest();
		JSONObject json = null;  
		req.setChannel("apppc");//通道
		req.setPlatform("zmop");//平台
		req.setProductCode(ZMXYReq.getProductCode());// 必要参数  产品码
		req.setTransactionId(getRandom());// 必要参数  商户请求唯一标志
		req.setCertType("IDENTITY_CARD");// 必要参数 证件类型
		req.setCertNo(ZMXYReq.getCertNo());// 必要参数  证件号码
		req.setName(ZMXYReq.getName());// 必要参数  姓名
		req.setMobile(ZMXYReq.getMobile());// 手机号
		req.setEmail(ZMXYReq.getEmail());// 电子邮箱
		req.setBankCard(ZMXYReq.getBankCard());// 银行卡号 
		req.setAddress(ZMXYReq.getAddress());//  地址信息
		req.setIp(ZMXYReq.getIp());// ip地址
		req.setMac(ZMXYReq.getMac());// 物理地址
		req.setWifimac(ZMXYReq.getWifimac());// wifi物理地址
		req.setImei(ZMXYReq.getImei());// 国际移动设备标志
		DefaultZhimaClient client = new DefaultZhimaClient(gatewayUrl, appId, privateKey, zhimaPublicKey);
		try {
			ZhimaCreditAntifraudScoreGetResponse response = (ZhimaCreditAntifraudScoreGetResponse)client.execute(req);
		       	json = JSONObject.parseObject(response.getBody()); 
		    } catch (ZhimaApiException e) {
		        e.printStackTrace();
		    }
		
		return json;
	}
	
	private String getRandom(){
		Calendar calendar = Calendar.getInstance();  
		StringBuffer strB = new StringBuffer();
	       int year = calendar.get(Calendar.YEAR);  
	       int month = calendar.get(Calendar.MONTH) + 1;  
	       int day = calendar.get(Calendar.DAY_OF_MONTH);
	       int hour = calendar.get(Calendar.HOUR_OF_DAY);
	       int minute = calendar.get(Calendar.MINUTE);  
	       int second = calendar.get(Calendar.SECOND);
	       int millisecond = calendar.get(Calendar.MILLISECOND);
	       strB.append(year).append(month).append(day)
	       		.append(hour).append(minute)
	       		.append(second).append(millisecond)
	       		.append(Calendar.getInstance().getTimeInMillis());
	   return strB.toString();
	}

}
