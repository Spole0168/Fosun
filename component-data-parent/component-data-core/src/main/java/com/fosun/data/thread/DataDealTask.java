/**
 * 
 */
package com.fosun.data.thread;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;

import com.fosun.data.dataTask.dao.DataFileApplyInfoDAO;
import com.fosun.data.dataTask.dao.DataTaskInfoDAO;
import com.fosun.data.dataTask.dao.DataTaskResultDAO;
import com.fosun.data.dataTask.dao.DataThirdRepInfoDAO;
import com.fosun.data.dataTask.dao.DataThirdReqInfoDAO;
import com.fosun.data.service.model.DataTaskReq;

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
@Service("dataDealTask")
public class DataDealTask {
	
	@Autowired
	private ThreadPoolTaskExecutor taskExecutor;
	
	@Autowired
	private DataThirdRepInfoDAO dataThirdRepInfoDAO;
	@Autowired
	private DataThirdReqInfoDAO dataThirdReqInfoDAO;
	@Autowired
	private DataTaskResultDAO dataTaskResultDAO;
	@Autowired
	private DataTaskInfoDAO dataTaskInfoDAO;
	@Autowired
	private DataFileApplyInfoDAO dataFileApplyInfoDAO;
	
	//启用线程，调用服务
	public void initTask(List<List<String>> list,DataTaskReq dataTaskReq){
		String taskType = dataTaskReq.getTaskType();
		if("1".equals(taskType)){
			BatJudgeFraudTask task = new BatJudgeFraudTask();
			task.setList(list);
			task.setDataTaskReq(dataTaskReq);
			
			task.setDataTaskInfoDAO(dataTaskInfoDAO);
			task.setDataFileApplyInfoDAO(dataFileApplyInfoDAO);
			task.setDataThirdRepInfoDAO(dataThirdRepInfoDAO);
			task.setDataThirdReqInfoDAO(dataThirdReqInfoDAO);
			task.setDataTaskResultDAO(dataTaskResultDAO);
			taskExecutor.execute(task);	
		}
		
	}

}
