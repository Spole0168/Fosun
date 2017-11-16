package com.fosun.data.util;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class PropertiesUtils {
	static Logger logger = LoggerFactory.getLogger(PropertiesUtils.class);
	/**
	 * @description 获取配置文件属性
	 * @param param
	 * @return
	 * @author htrad0021
	 * @date 2016-11-25
	 */
	public static String getPropertiesValue(String param) {
		String property = null;
		InputStream in = null;
		Properties prop = new Properties();
		try {
			in = new BufferedInputStream(new FileInputStream(
					"/apps/config/data-app/config.properties"));
			prop.load(in);
			property = prop.getProperty(param);
		} catch (IOException e) {
		}
		return property;
	}

}
