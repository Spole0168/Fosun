package com.fosun.service.test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONObject;

import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.fosun.component.base.util.DateUtil;
import com.fosun.data.dataTask.dto.CreditReportDto;
import com.fosun.data.service.model.vo.CreditBriefReport;
import com.fosun.data.util.ConvertUtil;
import com.fosun.data.util.DataConstant;
import com.fosun.data.util.DataUtil;
import com.fosun.data.util.ExcelsUtils;


public class Test_Excel {
	//Junit 有数贷中间衍生变量测试
	@Test
	public void test_ComputerBreif(){
		try {
			CreditReportDto readDetailCreditReport = ExcelsUtils.readSampleCreditReport(new File("D://apps//ExcelTemplate//云风控征信报告输入字段 20171027.xlsx"));
//			System.out.println("readDetailCreditReport =\t"+JSON.toJSON(readDetailCreditReport));
			JSONObject transReportDto2Json = DataUtil.transReportDto2Json(readDetailCreditReport);
			System.out.println("overdueTimesInL5Y	=\t\t"+transReportDto2Json.get("overdueTimesInL5Y"));
			System.out.println("overdueMoreThan90DL5Y	=\t\t"+transReportDto2Json.get("overdueMoreThan90DL5Y"));
			System.out.println("overdueAccountRate	=\t\t"+transReportDto2Json.get("overdueAccountRate"));
			System.out.println("CCMOB				=\t\t"+transReportDto2Json.get("CCMOB"));
			System.out.println("MOBNeverOverdueAccount	=\t\t"+transReportDto2Json.get("MOBNeverOverdueAccount"));
			System.out.println("CCUtilizationRate	=\t\t"+transReportDto2Json.get("CCUtilizationRate"));
			System.out.println("inqueryTimesL6M	=\t\t"+transReportDto2Json.get("inqueryTimesL6M"));
			System.out.println("houseLoanRetunMs	=\t\t"+transReportDto2Json.get("houseLoanRetunMs"));
			System.out.println("houseLoanAmountM	=\t\t"+transReportDto2Json.get("houseLoanAmountM"));
			System.out.println("otherLoanAmountM	=\t\t"+transReportDto2Json.get("otherLoanAmountM"));
			System.out.println("monthlyDebts	=\t\t"+transReportDto2Json.get("monthlyDebts"));
			System.out.println("allOverdueNum90D	=\t\t"+transReportDto2Json.get("allOverdueNum90D"));
			System.out.println("overdueTimesInL5Y	=\t\t"+transReportDto2Json.get("overdueTimesInL5Y"));
			System.out.println("assetsDisposalNumS	=\t\t"+transReportDto2Json.get("assetsDisposalNumS"));
			System.out.println("guaranteeRepayNumS	=\t\t"+transReportDto2Json.get("guaranteeRepayNumS"));



		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void test_readDetailCreditReport(){
		try {
			String detailPath = "D://apps//ExcelTemplate//2017年8月15日Report_Detial.xlsx";
//			String detailPath = "D://apps//ExcelTemplate//2017年8月15日Report_Detial-Full.xlsx";
			CreditReportDto readDetailCreditReport = ExcelsUtils.readCreditReport(new File(detailPath),DataConstant.CREDIT_REPORT_TYPE_DETAIL_KEY);
			JSONObject transReportDto2Json = JSONObject.fromObject(readDetailCreditReport);
			System.out.println("CREDIT_REPORT_TYPE_DETAIL_KEY:");
			System.out.println();
			System.out.println(transReportDto2Json);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void test_readSampleCreditReport(){
		String briefPath = "D://apps//ExcelTemplate//2017年8月15日Report_Brief.xlsx";
//		String briefPath = "D://apps//ExcelTemplate//2017年8月15日Report_Brief-Full.xlsx";
		try {
			CreditReportDto readDetailCreditReport = ExcelsUtils.readCreditReport(new File(briefPath),DataConstant.CREDIT_REPORT_TYPE_BRIEF_KEY);
			JSONObject transReportDto2Json = JSONObject.fromObject(readDetailCreditReport);
			System.out.println("CREDIT_REPORT_TYPE_BRIEF_KEY:");
			System.out.println(transReportDto2Json);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void test_ComputerDetial(){
		try {
			CreditReportDto readDetailCreditReport = ExcelsUtils.readDetailCreditReport(new File("D://apps//ExcelTemplate//2017年8月15日Report_Detial.xlsx"));
			JSONObject transReportDto2Json = DataUtil.transReportDto2Json(readDetailCreditReport);
			System.out.println(transReportDto2Json);
												   
			System.out.println("过去24个月逾期的月份数                   monthsOfOverdueL24M =\t\t"+transReportDto2Json.get("monthsOfOverdueL24M"));
			System.out.println("过去12个月贷款最大逾期期数                   maxOverdueL12M =\t\t"+transReportDto2Json.get("maxOverdueL12M"));
			System.out.println("最近6个月有过逾期的账户占比  overdueAccountRateL6M =\t\t"+transReportDto2Json.get("overdueAccountRateL6M"));
			System.out.println("申请人信用卡最长账龄                  CCMOB		 =\t\t"+transReportDto2Json.get("CCMOB"));
			System.out.println("从未逾期账户距今最长账龄                  MOBNeverOverdueAccount =\t\t"+transReportDto2Json.get("MOBNeverOverdueAccount"));
			System.out.println("贷记卡额度使用率                  utilizationRateOfCC		  =\t\t"+transReportDto2Json.get("utilizationRateOfCC"));
			System.out.println("贷记卡上期账单还款率                  lastRepaymentRate  =\t\t"+transReportDto2Json.get("lastRepaymentRate"));
			System.out.println("最近6个月审批查询次数                  inqueryTimesL6M		  =\t\t"+transReportDto2Json.get("inqueryTimesL6M"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void test_Doble(){
		double a = 2323;
		String ss = ConvertUtil.transDouble2intStr(a);
		System.out.println(ss);
	}
	
}
