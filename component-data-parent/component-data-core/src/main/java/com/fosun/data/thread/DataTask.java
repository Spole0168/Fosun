/**
 * 
 */
package com.fosun.data.thread;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;

/**
 * 
 *
 * @author 	abudula
 * @date 	2017年3月22日
 * @Copyright 
 *
 * <pre>
 * =================Modify Record=================
 * Modifier			date				Content
 * yunbo.wei		2017年3月22日			新增
 *
 * </pre>
 */
@Service("dataTask")
public class DataTask {
	
	@Autowired
	private ThreadPoolTaskExecutor taskExecutor;
	
	
	public void initTask(){
		
	}

}
