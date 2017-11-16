/**
 * 
 */
package com.fosun.data.service.impl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fosun.component.base.exception.CommonException;
import com.fosun.component.base.util.BeanUtil;
import com.fosun.data.dataTask.dao.DataFileApplyInfoDAO;
import com.fosun.data.dataTask.dao.DataTaskInfoDAO;
import com.fosun.data.dataTask.dao.DataThirdRepInfoDAO;
import com.fosun.data.dataTask.dao.DataThirdReqInfoDAO;
import com.fosun.data.dataTask.model.DataFileApplyInfo;
import com.fosun.data.dataTask.model.DataTaskInfo;
import com.fosun.data.dataTask.model.DataTaskInfoExample;
import com.fosun.data.dataTask.model.DataThirdRepInfo;
import com.fosun.data.dataTask.model.DataThirdReqInfo;
import com.fosun.data.dataTask.model.DataTaskInfoExample.Criteria;
import com.fosun.data.service.DataTaskService;
import com.fosun.data.service.model.CreditRiskRep;
import com.fosun.data.service.model.DataTaskInfoVo;
import com.fosun.data.service.model.DataTaskRep;
import com.fosun.data.service.model.DataTaskReq;
import com.fosun.data.thread.DataDealTask;
import com.fosun.data.util.DataConstant;
import com.fosun.data.util.DataUtil;
import com.fosun.data.util.ExcelsUtils;
import com.fosun.data.util.FileUploadUtils;
import com.fosun.data.util.MerchantSwitch;
import com.fosun.data.util.PropertiesUtils;
import com.fosun.data.util.ServiceUtils;

/**
 * 
 *
 * @author 	abudula
 * @date 	2017年5月6日
 * @Copyright 
 *
 * <pre>
 * =================Modify Record=================
 * Modifier			date				Content
 * yunbo.wei		2017年5月6日			新增
 *
 * </pre>
 */
@Service("dataTaskService")
public class DataTaskServiceImpl implements DataTaskService {

	Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private DataFileApplyInfoDAO dataFileApplyInfoDAO;
	@Autowired
	private DataTaskInfoDAO dataTaskInfoDAO;
	@Autowired
	private DataThirdRepInfoDAO dataThirdRepInfoDAO;
	@Autowired
	private DataThirdReqInfoDAO dataThirdReqInfoDAO;
	
	@Autowired
	private DataDealTask dataDealTask;
	
	
	@Transactional
	public DataTaskRep genDataTask(DataTaskReq dataTaskReq) {
		logger.info("genDataTask(DataTaskReq dataTaskReq)="+dataTaskReq);
		DataTaskRep rep = new DataTaskRep();
		if(null==dataTaskReq||
			null==dataTaskReq.getTaskType()||dataTaskReq.getTaskType().length()==0){
			rep.setRespCode("100003");
			rep.setRespMsg("taskType 参数有错误 任务类型不能为空");
			return rep;
		}
		String taskType = dataTaskReq.getTaskType();
		String taskId = null;
		switch(taskType){
		 	case  "1" :
				try {
					taskId = parseExcelFile(dataTaskReq);
				} catch (CommonException e) {
					logger.error("parseExcelFile(dataTaskReq) e="+e.getMessage());
					rep.setRespCode(e.getErrorCode());
					rep.setRespMsg(e.getErrorMessage());
					return rep;
				}
		 		break;
		 	case  "2" :

		 		
		 		break;
		 	case  "3" :
		 		
		 		break;
		 	default:
		 		logger.debug("taskType 参数有错误，taskType="+taskType);
		}
		rep.setRespCode("000000");
		rep.setRespMsg("任务处理中");
		rep.setTaskId(taskId);
		return rep;
	}








	private String parseExcelFile(DataTaskReq dataTaskReq) throws CommonException {
		String fid = dataTaskReq.getInFileId();
		logger.info("DataUtil.downExcelFile(fid) fid="+fid);
		String tempFile = DataUtil.downExcelFile(fid);
		logger.info("Apply File-tempFile="+tempFile);
		List<String> fnlist = new ArrayList<String>();
		fnlist.add(tempFile);//原始文件
		//c.判断该input_fid 在数据服务系统中是否存在，若存在，抛出异常。否则 继续
		DataTaskInfoExample example = new DataTaskInfoExample();
		Criteria criteria = example.createCriteria();
		criteria.andInFileIdEqualTo(fid);
		int countByExample = dataTaskInfoDAO.countByExample(example);
		if(0!=countByExample){
			//抛出该改文件已经解析过
			logger.error("该文件 在数据服务中已经解析过了 dataTaskReq="+dataTaskReq);
			//删除临时目录下的文件
			FileUploadUtils.delFiles(fnlist);
			throw new CommonException("200001", "输入的文件id 在数据服务中已经解析过了");
		}
		//解析文件，把文件数据放入list中
		List<List<String>> excelList = null;
		try {
			excelList = ExcelsUtils.readExcel(new File(tempFile));
		} catch (Exception e) {
			logger.error("DataUtil.readExcel  e="+e);
			//删除临时目录下的文件
			FileUploadUtils.delFiles(fnlist);
			throw new CommonException("999999", "解析文件异常");
		}
		//b.判断文件数据内容是否为空。若为空，抛出异常。否则 继续
		if(null==excelList || excelList.size()<3){
			//抛出文件内容异常
			logger.error("该文件 内容为空  excelList="+excelList);
			//删除临时目录下的文件
			FileUploadUtils.delFiles(fnlist);
			throw new CommonException("200002", "输入的文件id 文件是空文件");
		}
		String taskId = DataUtil.getUuid();
		dataTaskReq.setTaskId(taskId);
		//表头增加一列 
		List<String> tableRowName = excelList.get(1);
		tableRowName.add("状态");
		tableRowName.add("备注");
		excelList.set(1, tableRowName);
		//原始数据入库
		for(int i =2;i<excelList.size();i++){
			DataFileApplyInfo dataFileApplyInfo = new DataFileApplyInfo();
			String excelContent = DataUtil.transList2String(excelList.get(i), DataConstant.EXCEL_CELL_SEPARATOR);
			dataFileApplyInfo.setExcelContent(excelContent);
			dataFileApplyInfo.setTaskId(taskId);
			dataFileApplyInfo.setInFileId(dataTaskReq.getInFileId());
			dataFileApplyInfo.setFlag("0");
			dataFileApplyInfo.setVersion(0);
			dataFileApplyInfo.setCreatedDt(new Date());
			dataFileApplyInfoDAO.insertSelective(dataFileApplyInfo);
		}
		//任务入库
		DataTaskInfo dt = new DataTaskInfo();
		dt.setTaskId(taskId);
		dt.setTaskType(dataTaskReq.getTaskType());
		dt.setInFileId(dataTaskReq.getInFileId());
		dt.setStatus(DataConstant.TASK_STATUS_DOING);//1-处理中
		dt.setVersion(0);
		dt.setFlag("0");
		dt.setCreatedBy(DataConstant.CREATER);
		dt.setCreatedDt(new Date());
		dataTaskInfoDAO.insert(dt);
		dataDealTask.initTask(excelList,dataTaskReq);
		return taskId;
	}








	@Override
	public DataTaskRep queryDataTask(DataTaskReq dataTaskReq) {
		DataTaskRep rep = new DataTaskRep();
		List<DataTaskInfoVo> repList = new ArrayList<DataTaskInfoVo>();
		List<String> taskIdList = dataTaskReq.getTaskIdList();
		if(null==taskIdList || taskIdList.size()==0){
			rep.setRespCode("100001");
			rep.setRespMsg("查询失败-参数为空");
			return rep;
		}
		for(String taskId : taskIdList){
			if(null==taskId||taskId.length()==0){
				continue;
			}
			DataTaskInfoVo dti = new DataTaskInfoVo();
			dti.setTaskId(taskId);
			DataTaskInfoExample example = new DataTaskInfoExample();
			Criteria criteria = example.createCriteria();
			criteria.andTaskIdEqualTo(taskId);
			List<DataTaskInfo> resList = dataTaskInfoDAO.selectByExample(example);
			DataTaskInfo dataTaskInfo = null;
			if(null!=resList&&resList.size()>0){
				dataTaskInfo = resList.get(0);
				dti.setOutFileId(dataTaskInfo.getOutFileId());
				dti.setInFileId(dataTaskInfo.getInFileId());
				dti.setStatus(dataTaskInfo.getStatus());
				dti.setTaskType(dataTaskInfo.getTaskType());
			}else {
				//不存在该任务信息
				dti.setStatus(DataConstant.TASK_NOT_IN_DATASERVICE);
			}
			repList.add(dti);
		}
		rep.setRepList(repList);
		rep.setRespCode("000000");
		rep.setRespMsg("查询完成");
		return rep;
	}








	@Override
	@Transactional
	public DataTaskRep queryMerchant(String merchant,String bizUk) {
		logger.info("queryMerchant(String merchant,String bizUk) merchant="+merchant+"| bizUk="+bizUk);
		DataTaskRep rep = new DataTaskRep();
		if(null==merchant||merchant.trim().length()==0){
			rep.setRespCode("999999");
			rep.setRespMsg("参数 merchant 不允许为空");
			return rep;
		}
		rep.setRespCode("000000");
		rep.setRespMsg("查询成功");
		String uri = PropertiesUtils.getPropertiesValue("creditFraudJudageUri");//配置文件中获取	
		String result = "";
		String ssRes = "";
		JSONObject reqJson = new JSONObject();
		reqJson.put("apiToken","YLZC001");						    
		reqJson.put("reportFlag","1");							    
		reqJson.put("requestCode","auditor_api");				    
		reqJson.put("invokerName","数据服务平台");						    
		reqJson.put("productType","15");	
		
		reqJson.put("merchantId",merchant);	    
		reqJson.put("bizUk",bizUk);
		
		DataThirdReqInfo reqInfo = new DataThirdReqInfo();
		DataThirdRepInfo repInfo = new DataThirdRepInfo();
		reqInfo.setReqParamInterfaceName(uri);
		reqInfo.setTaskId(bizUk);
		reqInfo.setReqNo(bizUk);
		reqInfo.setTaskType("queryMerchant");
		reqInfo.setReqDt(new Date());
		reqInfo.setVersion(0);
		reqInfo.setCreatedDt(new Date());
		BeanUtil.copyProperties(reqInfo,repInfo);
		reqInfo.setReqParamContent(reqJson.toString());
		logger.info("reqInfo insert"+reqInfo);
		try {
			dataThirdReqInfoDAO.insertSelective(reqInfo);
		} catch (Exception e1) {
		}
		List<String> fnlist = new ArrayList<String>();
		try {
			result = ServiceUtils.getCreditService(uri,reqJson);
		} catch (Exception e) {
			logger.error(e.getMessage());
			repInfo.setRepResultContent("量富系统-服务异常-异常信息" + e.getMessage());
			rep.setRespCode("999999");
			rep.setRespMsg(e.getMessage());
			return rep;
		}
		if(null==result||result.trim().length()==0){
			rep.setRespCode("999999");
			rep.setRespMsg("量富系统-服务异常，返回结果为null");
			return rep;
		}else if(null!=result&&result.length()>0){
			repInfo.setRepResultContent(result);
			//解析响应结果
			JSONObject res = JSONObject.fromObject(result);
			String resType = (String) res.get("type");
			if("success".equals(resType)){
				JSONObject data =  (JSONObject) res.get("data");
				ssRes = (String) data.get("ylzcSHData");
				//TODO 写入结果文件上传影像系统
				String fliePath = null;
				try {
					//第一次写入表头
					//临时路径
					String tempPath = PropertiesUtils.getPropertiesValue("temp_path");
					fliePath =  tempPath+merchant+"_"+DataUtil.getUuid()+"."+ExcelsUtils.xlsx;
					System.out.println(fliePath);
					List<List<String>> ll = new ArrayList<List<String>>();
					List<String> headerList = new ArrayList<>();
					List<String> clList = null;
					ll.add(new ArrayList<String>());
					headerList.add("编号");
					headerList.add("中文名称");
					headerList.add("值");
					ll.add(headerList);
					List<Map<String, String>> mapListJson = new ArrayList<Map<String, String>>();
					try {
						JSONArray resJson = JSONArray.fromObject(ssRes);
						mapListJson = (List)resJson;
					} catch (Exception e) {
						rep.setRespCode("999999");
						rep.setRespMsg(ssRes);
						return rep;
					}
					
					for (int i = 0; i < mapListJson.size(); i++) {
			            Map<String,String> obj=mapListJson.get(i);
			            for(Entry<String, String> entry : obj.entrySet()){
							clList = new ArrayList<>();
							clList.add(entry.getKey());
							clList.add(MerchantSwitch.getDictValue(entry.getKey()));
							clList.add(entry.getValue());
							ll.add(clList);
			            }
			        }
					fnlist.add(fliePath);//原始文件
					ExcelsUtils.createExcel(ll,fliePath,2);
					//写入数据
					ExcelsUtils.writeExcel(ll, fliePath);
				} catch (IOException e1) {
					logger.error("结果信息写入失败" + e1);
					rep.setRespCode("999999");
					rep.setRespMsg("结果信息写入失败");
					FileUploadUtils.delFiles(fnlist);
					return rep;
				}
				// 调用影像系统结果文件上传至系统，返回一个result_fid;
				String outFileId = null;
				try {
					File file = new File(fliePath);
					String uurl = PropertiesUtils.getPropertiesValue("storekeeper_api_sftp_upload");
					outFileId = FileUploadUtils.uploadFileSftp(file,uurl);
				} catch (Exception e) {
					logger.error("结果文件上传文件失败" + e);
					rep.setRespCode("999999");
					rep.setRespMsg("结果文件上传文件失败");
					FileUploadUtils.delFiles(fnlist);
					return rep;
				}
				rep.setOutFileId(outFileId);
				rep.setRespCode("000000");
				rep.setRespMsg("交易成功");
				FileUploadUtils.delFiles(fnlist);
			}else if(!"success".equals(resType)){
				Object reason =   res.get("data");
				logger.info("reason"+reason);
				rep.setRespCode("999999");
				rep.setRespMsg("交易失败 resaon:"+reason);
			}
		}
		repInfo.setRepDt(new Date());
		repInfo.setId(null);
		logger.info("repInfo insert ="+repInfo);
		try {
			dataThirdRepInfoDAO.insertSelective(repInfo);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return rep;
	}

}
