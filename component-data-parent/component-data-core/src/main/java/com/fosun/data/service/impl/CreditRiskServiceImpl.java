package com.fosun.data.service.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import net.sf.json.JSONObject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.fosun.component.base.exception.CommonException;
import com.fosun.component.base.util.BeanUtil;
import com.fosun.data.dataTask.dao.DataCreditBriefOutlineInfoDAO;
import com.fosun.data.dataTask.dao.DataCreditBriefTransactionInfoDAO;
import com.fosun.data.dataTask.dao.DataCreditDatilOutlineInfoDAO;
import com.fosun.data.dataTask.dao.DataCreditDatilTransactionInfoDAO;
import com.fosun.data.dataTask.dao.DataCreditPublicInfoDAO;
import com.fosun.data.dataTask.dao.DataCreditQueryInfoDAO;
import com.fosun.data.dataTask.dao.DataCreditReportInfoDAO;
import com.fosun.data.dataTask.dao.DataThirdRepInfoDAO;
import com.fosun.data.dataTask.dao.DataThirdReqInfoDAO;
import com.fosun.data.dataTask.dto.CreditReportDto;
import com.fosun.data.dataTask.model.DataCreditBriefOutlineInfo;
import com.fosun.data.dataTask.model.DataCreditBriefTransactionInfo;
import com.fosun.data.dataTask.model.DataCreditDatilOutlineInfo;
import com.fosun.data.dataTask.model.DataCreditDatilTransactionInfo;
import com.fosun.data.dataTask.model.DataCreditPublicInfo;
import com.fosun.data.dataTask.model.DataCreditQueryInfo;
import com.fosun.data.dataTask.model.DataCreditReportInfo;
import com.fosun.data.dataTask.model.DataThirdRepInfo;
import com.fosun.data.dataTask.model.DataThirdReqInfo;
import com.fosun.data.service.CreditRiskService;
import com.fosun.data.service.model.CreditRiskRep;
import com.fosun.data.service.model.CreditRiskReq;
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
@Service("creditRiskService")
public class CreditRiskServiceImpl implements CreditRiskService {
	Logger logger = LoggerFactory.getLogger(getClass());
	@Autowired
	private DataThirdRepInfoDAO dataThirdRepInfoDAO;
	@Autowired
	private DataThirdReqInfoDAO dataThirdReqInfoDAO;
	@Autowired
	private DataCreditReportInfoDAO dataCreditReportInfoDAO;
	@Autowired
	private DataCreditBriefOutlineInfoDAO dataCreditBriefOutlineInfoDAO;
	@Autowired
	private DataCreditDatilOutlineInfoDAO dataCreditDatilOutlineInfoDAO;
	@Autowired
	private DataCreditBriefTransactionInfoDAO dataCreditBriefTransactionInfoDAO;
	@Autowired
	private DataCreditDatilTransactionInfoDAO dataCreditDatilTransactionInfoDAO;
	@Autowired
	private DataCreditPublicInfoDAO dataCreditPublicInfoDAO;
	@Autowired
	private DataCreditQueryInfoDAO dataCreditQueryInfoDAO;
	
	
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
	public DataCreditReportInfoDAO getDataCreditReportInfoDAO() {
		return dataCreditReportInfoDAO;
	}
	public void setDataCreditReportInfoDAO(
			DataCreditReportInfoDAO dataCreditReportInfoDAO) {
		this.dataCreditReportInfoDAO = dataCreditReportInfoDAO;
	}
	public DataCreditBriefOutlineInfoDAO getDataCreditBriefOutlineInfoDAO() {
		return dataCreditBriefOutlineInfoDAO;
	}
	public void setDataCreditBriefOutlineInfoDAO(
			DataCreditBriefOutlineInfoDAO dataCreditBriefOutlineInfoDAO) {
		this.dataCreditBriefOutlineInfoDAO = dataCreditBriefOutlineInfoDAO;
	}
	public DataCreditDatilOutlineInfoDAO getDataCreditDatilOutlineInfoDAO() {
		return dataCreditDatilOutlineInfoDAO;
	}
	public void setDataCreditDatilOutlineInfoDAO(
			DataCreditDatilOutlineInfoDAO dataCreditDatilOutlineInfoDAO) {
		this.dataCreditDatilOutlineInfoDAO = dataCreditDatilOutlineInfoDAO;
	}
	public DataCreditBriefTransactionInfoDAO getDataCreditBriefTransactionInfoDAO() {
		return dataCreditBriefTransactionInfoDAO;
	}
	public void setDataCreditBriefTransactionInfoDAO(
			DataCreditBriefTransactionInfoDAO dataCreditBriefTransactionInfoDAO) {
		this.dataCreditBriefTransactionInfoDAO = dataCreditBriefTransactionInfoDAO;
	}
	public DataCreditDatilTransactionInfoDAO getDataCreditDatilTransactionInfoDAO() {
		return dataCreditDatilTransactionInfoDAO;
	}
	public void setDataCreditDatilTransactionInfoDAO(
			DataCreditDatilTransactionInfoDAO dataCreditDatilTransactionInfoDAO) {
		this.dataCreditDatilTransactionInfoDAO = dataCreditDatilTransactionInfoDAO;
	}
	public DataCreditPublicInfoDAO getDataCreditPublicInfoDAO() {
		return dataCreditPublicInfoDAO;
	}
	public void setDataCreditPublicInfoDAO(
			DataCreditPublicInfoDAO dataCreditPublicInfoDAO) {
		this.dataCreditPublicInfoDAO = dataCreditPublicInfoDAO;
	}
	public DataCreditQueryInfoDAO getDataCreditQueryInfoDAO() {
		return dataCreditQueryInfoDAO;
	}
	public void setDataCreditQueryInfoDAO(
			DataCreditQueryInfoDAO dataCreditQueryInfoDAO) {
		this.dataCreditQueryInfoDAO = dataCreditQueryInfoDAO;
	}
	
	@Transactional
	public CreditRiskRep riskRating(CreditRiskReq creditRiskReq){
		logger.info("riskRating(CreditRiskReq creditRiskReq)="+creditRiskReq);
		CreditRiskRep rep = new CreditRiskRep();
		CreditReportDto creditReport = null;
		//解析征信报告并入库
		try {
			creditReport = parseCreditReportFile(creditRiskReq);
		} catch (CommonException e) {
			logger.error("parseCreditReportFile(creditRiskReq)"+e.getMessage());
			rep.setRespCode(e.getErrorCode());
			rep.setRespMsg(e.getErrorMessage());
			return rep;
		}	
		//调用风险评估。
		//1.获取请求的参数生成接口需要的部分json
		String reportType = creditRiskReq.getCreditReportType();
		CreditSignedInfo creditSignedInfo = creditRiskReq.getCreditSignedInfo();
		CreditUser creditUser = creditRiskReq.getCreditUser();
		CreditLoanDemand creditLoanDemand = creditRiskReq.getCreditLoanDemand();
		CreditEarnings creditEarnings = creditRiskReq.getCreditEarnings();
		CreditNoEarnings creditNoEarnings = creditRiskReq.getCreditNoEarnings();
		YouShuLoanInfo ysLoan = creditRiskReq.getYouShuLoanInfo();
		creditSignedInfo.setApiToken("AS001");
		creditSignedInfo.setBizUk(creditReport.getDataCreditReportInfo().getCreditReportId());
		creditSignedInfo.setRequestCode("auditor_api");
		creditSignedInfo.setInvokerName("DataService");
		
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
		logger.info("DataUtil.transReportDto2Json(creditReport) Begin:="+creditReport);
		JSONObject reportJson = DataUtil.transReportDto2Json(creditReport);
		logger.info("DataUtil.transReportDto2Json(creditReport) end:="+reportJson);
		reqJson = DataUtil.union2Json(reqJson, reportJson);
		
		String uri = PropertiesUtils.getPropertiesValue("creditFraudJudageUri");//配置文件中获取	
		String result = "";
		DataThirdReqInfo reqInfo = new DataThirdReqInfo();
		DataThirdRepInfo repInfo = new DataThirdRepInfo();
		reqInfo.setReqParamMobile(creditRiskReq.getCreditUser().getMobile());
		reqInfo.setReqSysName("量富征信");
//		reqInfo.setTaskId("");
		reqInfo.setTaskType("riskRating");
		reqInfo.setReqParamInterfaceName(uri);
		reqInfo.setReqNo(creditReport.getDataCreditReportInfo().getCreditReportId());
		reqInfo.setReqDt(new Date());
		reqInfo.setReqParamName(creditReport.getDataCreditReportInfo().getCreditPersonName());
		reqInfo.setReqParamIdentity(creditReport.getDataCreditReportInfo().getCreditPersonIdNum());
		reqInfo.setVersion(0);
		reqInfo.setCreatedDt(new Date());
		BeanUtil.copyProperties(reqInfo,repInfo);
		reqInfo.setReqParamContent(reqJson.toString());
		logger.info("reqInfo insert"+reqInfo);
		try {
			dataThirdReqInfoDAO.insertSelective(reqInfo);
		} catch (Exception e1) {
			logger.error("dataThirdReqInfoDAO.insertSelective(reqInfo)"+e1);
		}
		try {
			result = ServiceUtils.getCreditService(uri,reqJson);
		} catch (Exception e) {
			logger.error(e.getMessage());
			repInfo.setRepResultContent("异常信息" + e.getMessage());
			rep.setRespCode("999999");
			rep.setRespMsg(e.getMessage());
		}
		if(null!=result&&result.length()>0){
			repInfo.setRepResultContent(result);
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
		repInfo.setRepDt(new Date());
		repInfo.setId(null);
		logger.info("repInfo insert ="+repInfo);
		try {
			dataThirdRepInfoDAO.insertSelective(repInfo);
		} catch (Exception e) {
			logger.error("dataThirdRepInfoDAO.insertSelective(repInfo)"+e);
		}
		return rep;
	}
	/**
	 * 
	 * <p> description :  解析征信报告并入库
	 * <p> author   : Spole
	 * <p> date 	: 2017年6月6日
	 * <p> methodName ：parseCreditReportFile
	 * <p> paramters  : @param creditRiskReq
	 * <p> paramters  : @return
	 * <p> paramters  : @throws CommonException
	 * <p> return	: CreditReportDto
	 * <p>
	 * <p>
	 */
	private CreditReportDto parseCreditReportFile(CreditRiskReq creditRiskReq) throws CommonException {
		String fid = creditRiskReq.getInFileId();
		String reportType = creditRiskReq.getCreditReportType();
		logger.info("DataUtil.downExcelFile(fid) fid="+fid);
		String tempFile = DataUtil.downExcelFile(fid);
		logger.info("CreditFile-tempFile="+tempFile);
		CreditReportDto detailCreditReport = null;
		List<String> fnlist = new ArrayList<String>();
		fnlist.add(tempFile);//原始文件
		File file = new File(tempFile);
		try {
			detailCreditReport = ExcelsUtils.readCreditReport(file,reportType);
		} catch (Exception e) {
			logger.error("ExcelsUtils.readCreditReport(file,reportType)="+e);
			FileUploadUtils.delFiles(fnlist);
			throw new CommonException("999999", "解析文件异常");
		}
		logger.info("ExcelsUtils.readCreditReport(file,reportType)"+detailCreditReport);
		try {
			//入库- 	       判断简版 详版
			//入库-     征信报告    头部    
			DataCreditReportInfo dataCreditReportInfo = detailCreditReport.getDataCreditReportInfo();
			dataCreditReportInfo.setCreatedDt(new Date());
			dataCreditReportInfo.setCreatedBy(DataConstant.CREATER);
			dataCreditReportInfo.setVersion(0);
			dataCreditReportInfo.setFlag("0");
			dataCreditReportInfoDAO.insertSelective(dataCreditReportInfo);
			//入库-     征信报告    公共记录 信息入库
			DataCreditPublicInfo dataCreditPublicInfo = detailCreditReport.getDataCreditPublicInfo();
			BeanUtil.copyProperties(dataCreditReportInfo,dataCreditPublicInfo);
			dataCreditPublicInfoDAO.insertSelective(dataCreditPublicInfo);
			//入库-     征信报告   查询记录 信息入库
			List<DataCreditQueryInfo> queryList = detailCreditReport.getQueryList();
			if(null!=queryList&&queryList.size()>0){
				for(DataCreditQueryInfo qurey : queryList){
					BeanUtil.copyProperties(dataCreditReportInfo,qurey);
					dataCreditQueryInfoDAO.insertSelective(qurey);
				}
			}
			if(DataConstant.CREDIT_REPORT_TYPE_BRIEF_KEY.equals(reportType)){
				//入库-     征信报告    信息概要 
				DataCreditBriefOutlineInfo dataCreditBriefOutlineInfo = detailCreditReport.getDataCreditBriefOutlineInfo();
				BeanUtil.copyProperties( dataCreditReportInfo,dataCreditBriefOutlineInfo);
				dataCreditBriefOutlineInfoDAO.insertSelective(dataCreditBriefOutlineInfo);
				//入库-     征信报告   信贷交易信息明细  
				List<DataCreditBriefTransactionInfo> briefCreditCardTransList = detailCreditReport.getBriefCreditCardTransList();
				List<DataCreditBriefTransactionInfo> briefHouseLoanTransList = detailCreditReport.getBriefHouseLoanTransList();
				List<DataCreditBriefTransactionInfo> briefOtherLoanTransList = detailCreditReport.getBriefOtherLoanTransList();
				List<DataCreditBriefTransactionInfo> transList = new ArrayList<DataCreditBriefTransactionInfo>();
				transList.addAll(briefCreditCardTransList);
				transList.addAll(briefHouseLoanTransList);
				transList.addAll(briefOtherLoanTransList);
				if(transList.size()>0){
					for(DataCreditBriefTransactionInfo trans : transList){
						BeanUtil.copyProperties( dataCreditReportInfo,trans);
						dataCreditBriefTransactionInfoDAO.insertSelective(trans);
					}
				}
				
			}else if(DataConstant.CREDIT_REPORT_TYPE_DETAIL_KEY.equals(reportType)){
				//入库-     征信报告    信息概要 
				DataCreditDatilOutlineInfo dataCreditDatilOutlineInfo = detailCreditReport.getDataCreditDatilOutlineInfo();
				BeanUtil.copyProperties( dataCreditReportInfo,dataCreditDatilOutlineInfo);
				dataCreditDatilOutlineInfoDAO.insertSelective(dataCreditDatilOutlineInfo);
				//入库-     征信报告   信贷交易信息明细  
				List<DataCreditDatilTransactionInfo> transList = new ArrayList<DataCreditDatilTransactionInfo>();
				List<DataCreditDatilTransactionInfo> datilCreditCardTransList = detailCreditReport.getDatilCreditCardTransList();
				List<DataCreditDatilTransactionInfo> datilLoanTransList = detailCreditReport.getDatilLoanTransList();
				transList.addAll(datilCreditCardTransList);
				transList.addAll(datilLoanTransList);
				if(transList.size()>0){
					for(DataCreditDatilTransactionInfo trans : transList){
						BeanUtil.copyProperties( dataCreditReportInfo,trans);
						dataCreditDatilTransactionInfoDAO.insertSelective(trans);
					}
				}
				
			}
		} catch (Exception e) {
			logger.error("征信文件入库="+e);
		}
		logger.info("detailCreditReport insert finish");
		return detailCreditReport;
	}

}
