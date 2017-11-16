package com.fosun.data.thread;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import net.sf.json.JSONObject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fosun.component.base.exception.CommonException;
import com.fosun.component.base.util.BeanUtil;
import com.fosun.data.dataTask.dao.DataFileApplyInfoDAO;
import com.fosun.data.dataTask.dao.DataTaskInfoDAO;
import com.fosun.data.dataTask.dao.DataTaskResultDAO;
import com.fosun.data.dataTask.dao.DataThirdRepInfoDAO;
import com.fosun.data.dataTask.dao.DataThirdReqInfoDAO;
import com.fosun.data.dataTask.model.DataTaskInfo;
import com.fosun.data.dataTask.model.DataTaskInfoExample;
import com.fosun.data.dataTask.model.DataTaskInfoExample.Criteria;
import com.fosun.data.dataTask.model.DataTaskResult;
import com.fosun.data.dataTask.model.DataThirdRepInfo;
import com.fosun.data.dataTask.model.DataThirdReqInfo;
import com.fosun.data.service.model.DataTaskReq;
import com.fosun.data.util.DataConstant;
import com.fosun.data.util.DataUtil;
import com.fosun.data.util.ExcelsUtils;
import com.fosun.data.util.FileUploadUtils;
import com.fosun.data.util.PropertiesUtils;
import com.fosun.data.util.ServiceUtils;

public class BatJudgeFraudTask implements Runnable {
	Logger logger = LoggerFactory.getLogger(getClass());
	private List<List<String>> list;
	private DataThirdRepInfoDAO dataThirdRepInfoDAO;
	private DataThirdReqInfoDAO dataThirdReqInfoDAO;
	private DataTaskResultDAO dataTaskResultDAO;
	private DataTaskInfoDAO dataTaskInfoDAO;
	private DataFileApplyInfoDAO dataFileApplyInfoDAO;
	private DataTaskReq dataTaskReq;

	
	
	public BatJudgeFraudTask() {
		super();
	}

	public BatJudgeFraudTask(DataTaskReq dataTaskReq, List<List<String>> list,
			DataThirdRepInfoDAO dataThirdRepInfoDAO,
			DataThirdReqInfoDAO dataThirdReqInfoDAO,
			DataTaskResultDAO dataTaskResultDAO,
			DataTaskInfoDAO dataTaskInfoDAO,
			DataFileApplyInfoDAO dataFileApplyInfoDAO) {
		super();
		this.dataTaskReq = dataTaskReq;
		this.list = list;
		this.dataThirdRepInfoDAO = dataThirdRepInfoDAO;
		this.dataThirdReqInfoDAO = dataThirdReqInfoDAO;
		this.dataTaskResultDAO = dataTaskResultDAO;
		this.dataTaskInfoDAO = dataTaskInfoDAO;
		this.dataFileApplyInfoDAO = dataFileApplyInfoDAO;
	}
	
	
	

	public List<List<String>> getList() {
		return list;
	}

	public void setList(List<List<String>> list) {
		this.list = list;
	}

	public DataThirdRepInfoDAO getDataThirdRepInfoDAO() {
		return dataThirdRepInfoDAO;
	}

	public void setDataThirdRepInfoDAO(DataThirdRepInfoDAO dataThirdRepInfoDAO) {
		this.dataThirdRepInfoDAO = dataThirdRepInfoDAO;
	}

	public DataThirdReqInfoDAO getDataThirdReqInfoDAO() {
		return dataThirdReqInfoDAO;
	}

	public void setDataThirdReqInfoDAO(DataThirdReqInfoDAO dataThirdReqInfoDAO) {
		this.dataThirdReqInfoDAO = dataThirdReqInfoDAO;
	}

	public DataTaskResultDAO getDataTaskResultDAO() {
		return dataTaskResultDAO;
	}

	public void setDataTaskResultDAO(DataTaskResultDAO dataTaskResultDAO) {
		this.dataTaskResultDAO = dataTaskResultDAO;
	}

	public DataTaskInfoDAO getDataTaskInfoDAO() {
		return dataTaskInfoDAO;
	}

	public void setDataTaskInfoDAO(DataTaskInfoDAO dataTaskInfoDAO) {
		this.dataTaskInfoDAO = dataTaskInfoDAO;
	}

	public DataFileApplyInfoDAO getDataFileApplyInfoDAO() {
		return dataFileApplyInfoDAO;
	}

	public void setDataFileApplyInfoDAO(DataFileApplyInfoDAO dataFileApplyInfoDAO) {
		this.dataFileApplyInfoDAO = dataFileApplyInfoDAO;
	}

	public DataTaskReq getDataTaskReq() {
		return dataTaskReq;
	}

	public void setDataTaskReq(DataTaskReq dataTaskReq) {
		this.dataTaskReq = dataTaskReq;
	}

	@Override
	public void run() {
		DataTaskInfo dti = new DataTaskInfo();
		String outFileId = "";
		try {
			outFileId = invokeThirdSevice();
		} catch (CommonException e) {
			logger.error("任务失败 - 任务号taskId=" + dataTaskReq.getTaskId());
			dti.setStatus(DataConstant.TASK_STATUS_ERROR); // 任务异常
			dti.setMemo(e.getErrorMessage());
		}
		// 最后更新数据库：input_fid ---task_id---status : 处理结果----result_fid
		dti.setOutFileId(outFileId);
		if (null != outFileId && outFileId.length() > 0) {
			dti.setStatus(DataConstant.TASK_STATUS_DONE);
		}
		DataTaskInfoExample example = new DataTaskInfoExample();
		Criteria criteria = example.createCriteria();
		criteria.andTaskIdEqualTo(dataTaskReq.getTaskId());
		dti.setUpdatetimedDt(new Date());
		dataTaskInfoDAO.updateByExampleSelective(dti, example);
		//删除临时目录下的文件
		List<String> fnlist = new ArrayList<String>();
		fnlist.add(dataTaskReq.getInFileId()+"."+ExcelsUtils.xlsx);//原始文件
		fnlist.add(dataTaskReq.getTaskId()+"."+ExcelsUtils.xlsx);//结果文件
		FileUploadUtils.delFiles(fnlist);
	}

	private String invokeThirdSevice() throws CommonException {
		if (null != list && list.size() > 0) {
			for (int i = 2;i<list.size();i++) {
				// 逐条遍历list数据调用征信反欺诈接口，把该数据结果写入list中。捕获
				// 请求参数json 信息入库
				List<String> dataList = list.get(i);
				if(null == dataList||dataList.size()<16){
					continue;
				}
				DataThirdReqInfo reqInfo = new DataThirdReqInfo();
				reqInfo.setTaskType(dataTaskReq.getTaskType());
				reqInfo.setTaskId(dataTaskReq.getTaskId());
				String reqNo = DataUtil.getUuid();
				reqInfo.setReqNo(reqNo);
				reqInfo.setReqSysName("征信系统");
				reqInfo.setReqDt(new Date());
				String name = dataList.get(10).trim();
				String identity = dataList.get(18).trim();
				String mobile = dataList.get(15).trim();
				if(
						null==name||name.length()==0||
						null==identity||identity.length()==0||
						null==mobile||mobile.length()==0
						){
					logger.debug("姓名 身份证 和电话 内容不全");
					
				}
				reqInfo.setReqParamName(name);
				reqInfo.setReqParamIdentity(identity);
				reqInfo.setReqParamMobile(mobile);
				reqInfo.setVersion(0);
				reqInfo.setCreatedDt(new Date());
//				reqInfo.setUpdatetimedDt(new Date());
				reqInfo.setId(null);
				String uri = PropertiesUtils.getPropertiesValue("creditFraudJudageUri");
				reqInfo.setReqParamInterfaceName(uri);
				HashMap<String, String> map = new HashMap<String, String>();
				map.put("bizUk", reqNo);
				map.put("name", name);
				map.put("identity", identity);
				map.put("mobile", mobile);
				map.put("apiToken", "DS001");
				map.put("reportFlag", "0");
				map.put("productType", "12");
				map.put("requestCode", "auditor_api");
				map.put("invokerName", "数据服务系统");

				JSONObject reqMap = JSONObject.fromObject(map);
				reqInfo.setReqParamContent(reqMap.toString());
				dataThirdReqInfoDAO.insertSelective(reqInfo);
				String creditService = null;
				// 响应结果json 入库
				DataThirdRepInfo repInfo = new DataThirdRepInfo();
				BeanUtil.copyProperties(reqInfo,repInfo);
				DataTaskResult dataTaskResult = new DataTaskResult();
				BeanUtil.copyProperties(dataTaskResult, dataTaskReq);
				logger.info("ServiceUtils.getCreditService(uri, reqMap) 参数："+reqMap);
				// 调用接口
				try {
					creditService = ServiceUtils.getCreditService(uri, reqMap);
				} catch (Exception ee) {
					logger.error("ServiceUtils.getCreditService(uri, reqMap) 异常="+ee);
					int length = ee.getMessage().length() > 301 ? 300 : ee
							.getMessage().length();
					repInfo.setRepResultContent("异常信息" + ee.getMessage());
					dataTaskResult.setMemo("异常信息"	+ ee.getMessage().substring(0, length));
					dataTaskResult.setIsFraud(DataConstant.FRAUD_RESULT_ERROR);
					dataList.add("异常");
					dataList.add("异常"+ee.getMessage());
				}
				logger.info("ServiceUtils.getCreditService(uri, reqMap) 结果："+creditService);
				String excelContent = "";
				String  approveflag = DataConstant.FRAUD_RESULT_ERROR;
				String  resMemo = "";
				if(null == creditService ){
					String sm = "异常";
					dataList.add(sm);
					if(resMemo.length()>0){
						dataList.add(resMemo);
					}
				}
				if (null != creditService && creditService.length() > 0 && null == repInfo.getRepResultContent()) {//&& null == repInfo.getRepResultContent() && repInfo.getRepResultContent().length()>0
					repInfo.setRepResultContent(creditService);
					JSONObject jsonObject = JSONObject.fromObject(creditService);
					String type = jsonObject.getString("type");
					if("success".equals(type)){
						JSONObject dataJson = jsonObject.getJSONObject("data");
						approveflag= dataJson.getString("approvalFlag");
						if(!DataConstant.IS_NOT_FRAUD_INFO.equals(approveflag)){
							approveflag = "0";
						}
						String  reasons = dataJson.getString("reasons");
						repInfo.setRepApproveFlag(approveflag);
						dataTaskResult.setIsFraud(approveflag);// 欺诈信息 0-不通过 （欺诈）
						dataTaskResult.setMemo(reasons);
					}else if("failure".equals(type)){
						String  reasons = jsonObject.getString("data");
						repInfo.setRepApproveFlag(approveflag);
						dataTaskResult.setIsFraud(approveflag);// 欺诈信息 0-不通过 （欺诈）// 1-通过 正常数据
						int length = reasons.length() > 900 ? 900 : reasons.length();
						dataTaskResult.setMemo("错误信息-"+ reasons.substring(0, length));
						resMemo = reasons;
					}
					String sm = "";
					if(DataConstant.IS_FRAUD_INFO.equals(approveflag)){
						sm = "欺诈";
					}else if(DataConstant.IS_NOT_FRAUD_INFO.equals(approveflag)){
						sm = "正常";
					}else{
						sm = "异常";
					}
					dataList.add(sm);
					if(resMemo.length()>0){
						dataList.add(resMemo);
					}
				}//end if
				list.set(i, dataList);
				repInfo.setRepDt(new Date());
				repInfo.setId(null);
				dataThirdRepInfoDAO.insertSelective(repInfo);
				// 在结果文件表中插入一条数据
				excelContent = DataUtil.transList2String(dataList, DataConstant.EXCEL_CELL_SEPARATOR);
				dataTaskResult.setId(null);
				dataTaskResult.setExcelContent(excelContent);
				dataTaskResult.setCreatedDt(new Date());
				dataTaskResult.setReqNo(reqNo);
				dataTaskResult.setIsFraud(approveflag);
				dataTaskResultDAO.insertSelective(dataTaskResult);

			}
		}
		// 根据结果表生成结果文件
		String fliePath = null;
		try {
			//第一次写入表头
			//临时路径
			String tempPath = PropertiesUtils.getPropertiesValue("temp_path");
			fliePath =  tempPath+dataTaskReq.getTaskId()+"."+ExcelsUtils.xlsx;
			ExcelsUtils.createExcel(list,fliePath,2);
			//写入数据
			ExcelsUtils.writeExcel(list, fliePath);
		} catch (IOException e1) {
			logger.error("解析数据写入文件失败" + e1);
			throw new CommonException("300002", "解析数据写入文件失败");
		}
		// 调用影像系统结果文件上传至系统，返回一个result_fid;
		String outFileId = null;
		try {
			File file = new File(fliePath);
			String uurl = PropertiesUtils.getPropertiesValue("storekeeper_api_sftp_upload");
			outFileId = FileUploadUtils.uploadFileSftp(file,uurl);
		} catch (Exception e) {
			logger.error("上传文件失败" + e);
			throw new CommonException("300001", "上传文件失败");
		}
		return outFileId;
	}

}
