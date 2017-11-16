package com.fosun.data.service.model.vo;

import java.util.List;

public class CreditBriefReport {
	
	private String CCUtilizationRate;			//信用卡额度使用率
	private String overdueTimesInL5Y;			//过去5年的逾期次数
	private String overdueMoreThan90DL5Y;		//过去5年90天以上逾期次数
	private String overdueAccountRate;			//有过逾期的账户占比
	private String creditRecordFlag;
	private String overdueSemiCCNumber;
	private String CLMOB;
	private String adverseGuaranteeNum;
	private String creditAccountNum;
	private String MOBNeverOverdueAccount;		//从未逾期账户最长账龄
	private String inqueryTimesL6M;				//过去6个月审批查询次数
	private String inqueryTimesL1M;
	private String CCMOB;						//申请人信用卡最长账龄
	private String overdueCCNumber;
	private String overdueLoanNumber;
	private String CCbalance;
	
	//有数贷 新增  2017年10月23日17:03:29
	private String utilizationRateOfCC;			//贷记卡额度使用率
	private List houseLoanRetunMs;			//房贷已还款月份
	private List houseLoanAmountM;			//房贷月还金额
	private List otherLoanAmountM;			//其他贷款月还金额
	private String monthlyDebts;				//月负债额
	private String allOverdueNum90D;			//发生过90天以上逾期账户数（信用卡+房贷+其他贷款）
	private String assetsDisposalNumS;			//资产处置信息笔数
	private String guaranteeRepayNumS;			//保证人代偿信息笔数

	
	
	
	
	public String getCCUtilizationRate() {
		return CCUtilizationRate;
	}
	public void setCCUtilizationRate(String cCUtilizationRate) {
		CCUtilizationRate = cCUtilizationRate;
	}
	public String getOverdueTimesInL5Y() {
		return overdueTimesInL5Y;
	}
	public void setOverdueTimesInL5Y(String overdueTimesInL5Y) {
		this.overdueTimesInL5Y = overdueTimesInL5Y;
	}
	public String getOverdueMoreThan90DL5Y() {
		return overdueMoreThan90DL5Y;
	}
	public void setOverdueMoreThan90DL5Y(String overdueMoreThan90DL5Y) {
		this.overdueMoreThan90DL5Y = overdueMoreThan90DL5Y;
	}
	public String getOverdueAccountRate() {
		return overdueAccountRate;
	}
	public void setOverdueAccountRate(String overdueAccountRate) {
		this.overdueAccountRate = overdueAccountRate;
	}
	public String getCreditRecordFlag() {
		return creditRecordFlag;
	}
	public void setCreditRecordFlag(String creditRecordFlag) {
		this.creditRecordFlag = creditRecordFlag;
	}
	public String getOverdueSemiCCNumber() {
		return overdueSemiCCNumber;
	}
	public void setOverdueSemiCCNumber(String overdueSemiCCNumber) {
		this.overdueSemiCCNumber = overdueSemiCCNumber;
	}
	public String getCLMOB() {
		return CLMOB;
	}
	public void setCLMOB(String cLMOB) {
		CLMOB = cLMOB;
	}
	public String getAdverseGuaranteeNum() {
		return adverseGuaranteeNum;
	}
	public void setAdverseGuaranteeNum(String adverseGuaranteeNum) {
		this.adverseGuaranteeNum = adverseGuaranteeNum;
	}
	public String getCreditAccountNum() {
		return creditAccountNum;
	}
	public void setCreditAccountNum(String creditAccountNum) {
		this.creditAccountNum = creditAccountNum;
	}
	public String getMOBNeverOverdueAccount() {
		return MOBNeverOverdueAccount;
	}
	public void setMOBNeverOverdueAccount(String mOBNeverOverdueAccount) {
		MOBNeverOverdueAccount = mOBNeverOverdueAccount;
	}
	public String getInqueryTimesL6M() {
		return inqueryTimesL6M;
	}
	public void setInqueryTimesL6M(String inqueryTimesL6M) {
		this.inqueryTimesL6M = inqueryTimesL6M;
	}
	public String getInqueryTimesL1M() {
		return inqueryTimesL1M;
	}
	public void setInqueryTimesL1M(String inqueryTimesL1M) {
		this.inqueryTimesL1M = inqueryTimesL1M;
	}
	public String getCCMOB() {
		return CCMOB;
	}
	public void setCCMOB(String cCMOB) {
		CCMOB = cCMOB;
	}
	public String getOverdueCCNumber() {
		return overdueCCNumber;
	}
	public void setOverdueCCNumber(String overdueCCNumber) {
		this.overdueCCNumber = overdueCCNumber;
	}
	public String getOverdueLoanNumber() {
		return overdueLoanNumber;
	}
	public void setOverdueLoanNumber(String overdueLoanNumber) {
		this.overdueLoanNumber = overdueLoanNumber;
	}
	public String getCCbalance() {
		return CCbalance;
	}
	public void setCCbalance(String cCbalance) {
		CCbalance = cCbalance;
	}
	public String getUtilizationRateOfCC() {
		return utilizationRateOfCC;
	}
	public void setUtilizationRateOfCC(String utilizationRateOfCC) {
		this.utilizationRateOfCC = utilizationRateOfCC;
	}
	public List getHouseLoanRetunMs() {
		return houseLoanRetunMs;
	}
	public void setHouseLoanRetunMs(List houseLoanRetunMs) {
		this.houseLoanRetunMs = houseLoanRetunMs;
	}
	public List getHouseLoanAmountM() {
		return houseLoanAmountM;
	}
	public void setHouseLoanAmountM(List houseLoanAmountM) {
		this.houseLoanAmountM = houseLoanAmountM;
	}
	public List getOtherLoanAmountM() {
		return otherLoanAmountM;
	}
	public void setOtherLoanAmountM(List otherLoanAmountM) {
		this.otherLoanAmountM = otherLoanAmountM;
	}
	public String getMonthlyDebts() {
		return monthlyDebts;
	}
	public void setMonthlyDebts(String monthlyDebts) {
		this.monthlyDebts = monthlyDebts;
	}
	public String getAllOverdueNum90D() {
		return allOverdueNum90D;
	}
	public void setAllOverdueNum90D(String allOverdueNum90D) {
		this.allOverdueNum90D = allOverdueNum90D;
	}
	public String getAssetsDisposalNumS() {
		return assetsDisposalNumS;
	}
	public void setAssetsDisposalNumS(String assetsDisposalNumS) {
		this.assetsDisposalNumS = assetsDisposalNumS;
	}
	public String getGuaranteeRepayNumS() {
		return guaranteeRepayNumS;
	}
	public void setGuaranteeRepayNumS(String guaranteeRepayNumS) {
		this.guaranteeRepayNumS = guaranteeRepayNumS;
	}
	
	
	
	
}
