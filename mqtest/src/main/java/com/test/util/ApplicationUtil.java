/**
 * 
 */
package com.test.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

/**
 * 动态获取spring bean 对象
 *
 * @author 	yunbo.wei
 * @date 	2017年3月1日
 * @Copyright 
 *
 * <pre>
 * =================Modify Record=================
 * Modifier			date				Content
 * yunbo.wei		2017年3月1日			新增
 *
 * </pre>
 */
@Service
public class ApplicationUtil implements ApplicationContextAware{
	private static ApplicationContext applicationContext;
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		ApplicationUtil.applicationContext = applicationContext;
	}
	public static Object getBean(String name){
	    return applicationContext.getBean(name);
	}
	
}
