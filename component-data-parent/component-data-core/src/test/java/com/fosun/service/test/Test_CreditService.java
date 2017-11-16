package com.fosun.service.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;
import com.fosun.component.base.util.BeanUtil;
import com.fosun.data.dataTask.dto.CreditReportDto;
import com.fosun.data.dataTask.model.DataThirdRepInfo;
import com.fosun.data.dataTask.model.DataThirdReqInfo;
import com.fosun.data.service.model.CreditRiskRep;
import com.fosun.data.service.model.DataTaskRep;
import com.fosun.data.service.model.vo.CreditEarnings;
import com.fosun.data.service.model.vo.CreditLoanDemand;
import com.fosun.data.service.model.vo.CreditNoEarnings;
import com.fosun.data.service.model.vo.CreditSignedInfo;
import com.fosun.data.service.model.vo.CreditUser;
import com.fosun.data.service.model.vo.YouShuLoanInfo;
import com.fosun.data.util.DataConstant;
import com.fosun.data.util.DataUtil;
import com.fosun.data.util.ExcelsUtils;
import com.fosun.data.util.FileUploadUtils;
import com.fosun.data.util.PropertiesUtils;
import com.fosun.data.util.ServiceUtils;

public class Test_CreditService {
	Logger logger = LoggerFactory.getLogger(getClass());
	
	@Test
	public  void test_FraulService() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("bizUk", DataUtil.getUuid());
		map.put("apiToken", "DS001");
		map.put("identity", "140701197507135172");
		map.put("name", "李明");
		map.put("mobile", "18500000013");
		map.put("reportFlag", "0");
		map.put("productType", "12");//12
		map.put("requestCode", "auditor_api");
		map.put("invokerName", "数据服务系统");
		JSONObject reqMap = JSONObject.fromObject(map);
		try {
			String zpUrl = PropertiesUtils.getPropertiesValue("creditFraudJudageUri");
			System.out.println(zpUrl);
			String creditService = ServiceUtils.getCreditService(zpUrl,reqMap);
			System.out.println("httpPostWithJSON="+creditService);
			String  approveflag = DataConstant.FRAUD_RESULT_ERROR;
			String  reasons = null;
			if (null != creditService && creditService.length() > 0) {
				JSONObject jsonObject = JSONObject.fromObject(creditService);
				String type = jsonObject.getString("type");
				if("success".equals(type)){
					JSONObject dataJson = jsonObject.getJSONObject("data");
					approveflag= dataJson.getString("approveflag");
					if(!DataConstant.IS_NOT_FRAUD_INFO.equals(approveflag)){
						approveflag = "0";
					}
					reasons = dataJson.getString("reasons");
				}else if("failure".equals(type)){
					reasons = jsonObject.getString("data");
				}
			}
			System.out.println("approveflag="+approveflag);
			System.out.println("reasons="+reasons);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void test_CreditRateService() {
		CreditRiskRep rep = new CreditRiskRep();
		
		
		String reportType = "1";////报告类型：0-简版；1-详版
		File file = new File("D://apps//ExcelTemplate//2017年8月15日Report_Detial.xlsx");
		
		//读取征信报告信息
		CreditReportDto creditReport = null;
			try {
				creditReport = ExcelsUtils.readCreditReport(file,reportType);
			} catch (Exception e1) {
				
			}
		//调用风险评估。
		//1.获取请求的参数生成接口需要的部分json
		CreditSignedInfo creditSignedInfo = new CreditSignedInfo();
		creditSignedInfo.setApiToken("AS001");
		creditSignedInfo.setBizUk(DataUtil.getUuid());
		creditSignedInfo.setRequestCode("auditor_api");
		creditSignedInfo.setInvokerName("DataService");
			creditSignedInfo.setReportFlag("1");
			creditSignedInfo.setProductType("13");
//		if(DataConstant.CREDIT_REPORT_TYPE_BRIEF_KEY.equals(reportType)){
//		}else if(DataConstant.CREDIT_REPORT_TYPE_DETAIL_KEY.equals(reportType)){
//			creditSignedInfo.setReportFlag("1");
//			creditSignedInfo.setProductType("0");
//		}
		CreditUser creditUser = new CreditUser();
		creditUser.setOrderCode("BBBBBBBBBBB1111");
		creditUser.setName("吴俊伟");
		creditUser.setMobile("13818346956");
		creditUser.setCity("shanghai");
		creditUser.setIdentity("110102196706112399");
		creditUser.setEducation("1");
		creditUser.setMarriage("0");
		creditUser.setProfession("1");
		creditUser.setResidentStatus("0");
		creditUser.setCardNo("6228480402564890018");
		creditUser.setCardNos("6228480402564890018");
		
		CreditLoanDemand creditLoanDemand = new CreditLoanDemand();
		creditLoanDemand.setLoanLimit("50000");
		creditLoanDemand.setLoanTerms("12");
		
		CreditEarnings creditEarnings = null;
		CreditNoEarnings creditNoEarnings = null;
		
		JSONObject jsonSign = JSONObject.fromObject(creditSignedInfo);//
		JSONObject jsonUser = JSONObject.fromObject(creditUser);
		JSONObject jsonLoan = JSONObject.fromObject(creditLoanDemand);
		JSONObject reqJson = DataUtil.union2Json(jsonUser, jsonLoan);
		JSONObject jsonEarnings = null;
		JSONObject jsonNo = null;
		if(null!=creditEarnings){
			jsonEarnings = JSONObject.fromObject(creditEarnings);
			reqJson = DataUtil.union2Json(reqJson, jsonEarnings);
		}
		if(null!=creditNoEarnings){
			jsonNo = JSONObject.fromObject(creditNoEarnings);
			reqJson = DataUtil.union2Json(reqJson, jsonNo);
		}
		reqJson = DataUtil.union2Json(reqJson, jsonSign);
		//根据CreditReportDto 生成所需要的如参数json
		JSONObject reportJson = DataUtil.transReportDto2Json(creditReport);
		reqJson = DataUtil.union2Json(reqJson, reportJson);
		
		String uri = PropertiesUtils.getPropertiesValue("creditFraudJudageUri");//配置文件中获取	
		
		String result = "";
		System.out.println();
		System.out.println();
		System.out.println("reqJson==="+reqJson);
		System.out.println();
		System.out.println();
		try {
			result = ServiceUtils.getCreditService(uri,reqJson);
		} catch (Exception e) {
			logger.error(e.getMessage());
			rep.setRespCode("999999");
			rep.setRespMsg(e.getMessage());
		}
		System.out.println();
		System.out.println();
		System.out.println(result);
		System.out.println();
		System.out.println();
		if(null!=result&&result.length()>0){
			//解析响应结果
			com.alibaba.fastjson.JSONObject res = JSON.parseObject(result);
			String resType = (String) res.get("type");
			if("success".equals(resType)){
				com.alibaba.fastjson.JSONObject data =  (com.alibaba.fastjson.JSONObject) res.get("data");
				try {
					rep = JSON.toJavaObject(data, CreditRiskRep.class);
				} catch (Exception e) {
				}
				rep.setRespCode("000000");
				rep.setRespMsg("交易成功");
			}
			if(!"success".equals(resType)){
				Object reason =   res.get("data");
				rep.setRespCode("999999");
				rep.setRespMsg("交易失败 resaon:"+reason);
			}
			rep.setSrcResult(result);
		}
		System.out.println("JSON.toJSONString(rep1)"+JSON.toJSONString(rep));
	}


	@Test
	public void test_Merchant(){
		String merchant = "102310054110987";
		String bizUk = "102310054110987";
		logger.info("queryMerchant(String merchant,String bizUk) merchant="+merchant+"| bizUk="+bizUk);
		DataTaskRep rep = new DataTaskRep();
		rep.setRespCode("000000");
		rep.setRespMsg("查询成功");
		String uri = PropertiesUtils.getPropertiesValue("creditFraudJudageUri");//配置文件中获取	
		String result = "";
		String ssRes = "";
		String reqNo = bizUk; 
		JSONObject reqJson = new JSONObject();
		reqJson.put("apiToken","YLZC001");						    
		reqJson.put("productType","15");	
		reqJson.put("reportFlag","1");							    
		reqJson.put("requestCode","auditor_api");				    
		reqJson.put("invokerName","数据服务平台");						    
		
		reqJson.put("merchantId",merchant);	    
		reqJson.put("bizUk",reqNo);
		
		DataThirdReqInfo reqInfo = new DataThirdReqInfo();
		DataThirdRepInfo repInfo = new DataThirdRepInfo();
		reqInfo.setReqParamInterfaceName(uri);
		reqInfo.setReqNo(reqNo);
		reqInfo.setReqDt(new Date());
		reqInfo.setVersion(0);
		reqInfo.setCreatedDt(new Date());
		BeanUtil.copyProperties(reqInfo,repInfo);
		reqInfo.setReqParamContent(reqJson.toString());
		logger.info("reqInfo insert"+reqInfo);
		try {
			result = ServiceUtils.getCreditService(uri,reqJson);
		} catch (Exception e) {
			logger.error(e.getMessage());
			repInfo.setRepResultContent("异常信息" + e.getMessage());
			rep.setRespCode("999999");
			rep.setRespMsg(e.getMessage());
//			return rep;
		}
		if(null==result||result.trim().length()==0){
			rep.setRespCode("999999");
			rep.setRespMsg("服务异常");
		}else if(null!=result&&result.length()>0){
			repInfo.setRepResultContent(result);
			//解析响应结果
			JSONObject res = JSONObject.fromObject(result);
			String resType = (String) res.get("type");
			if("success".equals(resType)){
				JSONObject data =  (JSONObject) res.get("data");
				ssRes = (String) data.get("ylzcSHData");
				rep.setRespCode("000000");
				rep.setRespMsg("交易成功");
			}else if(!"success".equals(resType)){
				Object reason =   res.get("data");
				rep.setRespCode("999999");
				rep.setRespMsg("交易失败 resaon:"+reason);
			}
		}
		repInfo.setRepDt(new Date());
		repInfo.setId(null);
		logger.info("repInfo insert ="+repInfo);
//		try {
//			dataThirdRepInfoDAO.insertSelective(repInfo);
//		} catch (Exception e) {
//		}
		//TODO 写入结果文件上传影像系统
		// 根据结果表生成结果文件
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
			headerList.add("值");
			ll.add(headerList);
			JSONArray resJson = JSONArray.fromObject(ssRes);
			List<Map<String,String>> mapListJson = (List)resJson;
			
			for (int i = 0; i < mapListJson.size(); i++) {
	            Map<String,String> obj=mapListJson.get(i);
	            for(Entry<String, String> entry : obj.entrySet()){
					clList = new ArrayList<>();
					clList.add(entry.getKey());
					clList.add(entry.getValue());
					ll.add(clList);
	            }
	        }
			
			ExcelsUtils.createExcel(ll,fliePath,2);
			//写入数据
			ExcelsUtils.writeExcel(ll, fliePath);
		} catch (IOException e1) {
			logger.error("结果信息写入失败" + e1);
			rep.setRespCode("999999");
			rep.setRespMsg("结果信息写入失败");
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
		}
		rep.setOutFileId(outFileId);
		System.out.println("JSON.toJSONString(rep1)"+JSON.toJSONString(rep));
	}
	@Test
	public void test_CreditRateService_YSloan() {
		CreditRiskRep rep = new CreditRiskRep();
		
		String reportType = "0";////报告类型：0-简版；1-详版
		File file = new File("D://apps//ExcelTemplate//1018Brief.xlsx");
//		File file = new File("D://apps//ExcelTemplate//Z3JvdXAxL00wMC8wMC82Ri9DcVlLSFZuNWJfbUFGbnRWQUFDR0dYckRXQWc4OC54bHN4.xlsx");
		
		//读取征信报告信息
		CreditReportDto creditReport = null;
			try {
				creditReport = ExcelsUtils.readCreditReport(file,reportType);
			} catch (Exception e1) {
				
			}
		//调用风险评估。
		//1.获取请求的参数生成接口需要的部分json
		CreditSignedInfo creditSignedInfo = new CreditSignedInfo();
		creditSignedInfo.setApiToken("AS001");
		creditSignedInfo.setBizUk(DataUtil.getUuid());
		creditSignedInfo.setRequestCode("auditor_api");
		creditSignedInfo.setInvokerName("DataService");
			creditSignedInfo.setReportFlag("0");//有数贷 0
			creditSignedInfo.setProductType("17");
		CreditUser creditUser = new CreditUser();
		creditUser.setOrderCode("BBBBBBBBBBB1111");
		creditUser.setName("吴俊伟");
		creditUser.setMobile("18640509580");
		creditUser.setCity("shanghai");
		creditUser.setIdentity("110102196706112399");
//		creditUser.setEducation("1");
		creditUser.setMarriage("0");
		creditUser.setProfession("1");
//		creditUser.setResidentStatus("0");
		creditUser.setCardNo("6228480402564890018");
		creditUser.setCardNos("6228480402564890018");
		
		CreditLoanDemand creditLoanDemand = new CreditLoanDemand();
//		creditLoanDemand.setLoanLimit("50000");
//		creditLoanDemand.setLoanTerms("12");
//		
		CreditEarnings creditEarnings = null;
		CreditNoEarnings creditNoEarnings = null;
		YouShuLoanInfo ysLoan = new YouShuLoanInfo();
		ysLoan.setCustChannel("CP");
		ysLoan.setProductTerms("3");
		JSONObject jsonSign = JSONObject.fromObject(creditSignedInfo);//
		JSONObject jsonUser = JSONObject.fromObject(creditUser);
		JSONObject jsonLoan = JSONObject.fromObject(creditLoanDemand);
		JSONObject reqJson = DataUtil.union2Json(jsonUser, jsonLoan);
		JSONObject jsonEarnings = null;
		JSONObject jsonNo = null;
		
		if(null!=creditEarnings){
			jsonEarnings = JSONObject.fromObject(creditEarnings);
			reqJson = DataUtil.union2Json(reqJson, jsonEarnings);
		}
		if(null!=creditNoEarnings){
			jsonNo = JSONObject.fromObject(creditNoEarnings);
			reqJson = DataUtil.union2Json(reqJson, jsonNo);
		}
		//有数贷 参数处理
		if(null!=ysLoan){
			jsonNo = JSONObject.fromObject(ysLoan);
			reqJson = DataUtil.union2Json(reqJson, jsonNo);
		}
		reqJson = DataUtil.union2Json(reqJson, jsonSign);
		//根据CreditReportDto 生成所需要的如参数json
		JSONObject reportJson = DataUtil.transReportDto2Json(creditReport);
		reqJson = DataUtil.union2Json(reqJson, reportJson);
		
		String uri = PropertiesUtils.getPropertiesValue("creditFraudJudageUri");//配置文件中获取	
		
		String result = "";
		System.out.println();
		System.out.println();
		System.out.println("reqJson==="+reqJson);
		System.out.println();
		System.out.println();
		try {
			result = ServiceUtils.getCreditService(uri,reqJson);
		} catch (Exception e) {
			logger.error(e.getMessage());
			rep.setRespCode("999999");
			rep.setRespMsg(e.getMessage());
		}
		System.out.println();
		System.out.println();
		System.out.println(result);
		System.out.println();
		System.out.println();
		
		if(null!=result&&result.length()>0){
			//解析响应结果
			com.alibaba.fastjson.JSONObject res = JSON.parseObject(result);
			String resType = (String) res.get("type");
			if("success".equals(resType)){
				com.alibaba.fastjson.JSONObject data =  (com.alibaba.fastjson.JSONObject) res.get("data");
				try {
//					rep = (CreditRiskRep) JSONObject.toBean(data,CreditRiskRep.class);
					rep = JSON.toJavaObject(data, CreditRiskRep.class);
				} catch (Exception e) {
				}
				rep.setRespCode("000000");
				rep.setRespMsg("交易成功");
			}
			if(!"success".equals(resType)){
				Object reason =   res.get("data");
				rep.setRespCode("999999");
				rep.setRespMsg("交易失败 resaon:"+reason);
			}
			rep.setSrcResult(result);
		}
		System.out.println("rep.getReasons()"+rep.getReasons());
		System.out.println("JSON.toJSONString(rep1)"+JSON.toJSONString(rep));
//		System.out.println("RISK::rep.toString()="+rep.toString());
		System.out.println("RISK::rep.getSrcResult()="+rep.getSrcResult());
	}
	
	
	
}
