package com.fosun.paymng.utils;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

public class SmsUtil {
	// 短信发送接口
//	private static String Url = "";
//	private static String userName = "";
//	private static String password = "";
	private static String SMS_URL = "";
	private static String SMS_SN = "";
	private static String SMS_PASSWORD = "";
	private static String SMS_KEY = "";

	public static boolean SendSms(String moblie, String content) {
		HttpClient client = new HttpClient();
		PostMethod method = new PostMethod(SMS_URL);
		content += SMS_KEY;
		client.getParams().setContentCharset("GBK");
		method.setRequestHeader("ContentType", "application/x-www-form-urlencoded;charset=UTF-8");
		String password = SMS_SN + SMS_PASSWORD;
		NameValuePair[] data = {
				new NameValuePair("Sn",SMS_SN),
				new NameValuePair("Pwd",password),
				new NameValuePair("Moblie",moblie),
				new NameValuePair("Content",content),
				new NameValuePair("Ext",""),
				new NameValuePair("stime",""),
				new NameValuePair("Rrid",""),
		};
		method.setRequestBody(data);
		try {
			client.executeMethod(method);
			String SubmitResult = method.getResponseBodyAsString();
			Document doc = DocumentHelper.parseText(SubmitResult);
			Element root = doc.getRootElement();
			String rrid = root.getTextTrim();
			String error = cheekError(rrid);
			if (error == null) {
				return true;
			} else {
				return false;
			}
		} catch (HttpException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		return true;
	}

	private static String cheekError(String rrid) {
		String error =null;
		Map<String, String> map =new HashMap<String, String>();
		map.put("-2", "账号/密码不正确");
		map.put("-4", "余额不足");
		map.put("-5", "数据格式错误");
		map.put("-6", "参数错误");
		map.put("-7", "权限受限");
		map.put("-8", "流量控制错误");
		map.put("-9", "扩展码权限错误");
		map.put("10", "");
		map.put("11", "");
		map.put("12", "");
		map.put("14", "");
		map.put("17", "");
		map.put("19", "");
		map.put("20", "");
		map.put("22", "");
		map.put("23", "");
		map.put("601", "");
		map.put("602", "");
		map.put("603", "");
		map.put("604", "");
		map.put("605", "");
		map.put("606", "");
		map.put("607", "");
		map.put("608", "");
		map.put("609", "");
		map.put("610", "");
		map.put("611", "");
		map.put("623", "");
		map.put("624", "");
		if (map.containsKey(rrid)) {
			error = map.get(rrid);
		}
		return error;
	}
	
	
}
