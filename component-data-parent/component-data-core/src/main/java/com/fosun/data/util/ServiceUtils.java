package com.fosun.data.util;

import java.io.IOException;

import net.sf.json.JSONObject;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServiceUtils {
	static Logger logger = LoggerFactory.getLogger(ServiceUtils.class);

	public static String getCreditService(String url, JSONObject jsonParam)
			throws  Exception{
		logger.info("getCreditService(String url, JSONObject jsonParam)params ="+url+"\t"+jsonParam);
		if (null == url || url.length() == 0 || null == jsonParam
				|| jsonParam.isEmpty()) {
			logger.error("getCreditService :参数有误");
		}
		HttpPost httpPost = new HttpPost(url);
		CloseableHttpClient client = HttpClients.createDefault();
		String respContent = null;
		logger.info("getCreditService(String url, JSONObject jsonParam)params ="+url+"\t"+jsonParam);
		// json方式 设置参数
		StringEntity entity = new StringEntity(jsonParam.toString(), "utf-8");// 解决中文乱码问题
		entity.setContentEncoding("UTF-8");
		entity.setContentType("application/json");
		httpPost.setEntity(entity);
		// 设置请求和传输超时时间\t
		RequestConfig requestConfig = RequestConfig.custom()
				.setSocketTimeout(90 * 1000).setConnectTimeout(90 * 1000).build();
		httpPost.setConfig(requestConfig);

		try {
			HttpResponse resp = client.execute(httpPost);
			if (resp.getStatusLine().getStatusCode() == 200) {
				HttpEntity he = resp.getEntity();
				respContent = EntityUtils.toString(he, "UTF-8");
			}
		} catch (ClientProtocolException e) {
			logger.error("getCreditService :ClientProtocolException"+e);
			e.printStackTrace();
		} catch (ParseException e) {
			logger.error("getCreditService :ParseException "+e);
			e.printStackTrace();
		} catch (IOException e) {
			logger.error("getCreditService :IOException "+e);
			e.printStackTrace();
		}finally{
			if(null!=client ){
				client.close();
				client = null;
			}
		}
		logger.info("getCreditService(String url, JSONObject jsonParam) result ="+respContent);
		return respContent;
	}

}
