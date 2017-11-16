package com.fosun.data.dataTask.dto;

import java.util.List;

import com.fosun.data.dataTask.model.DataCreditBriefOutlineInfo;
import com.fosun.data.dataTask.model.DataCreditBriefTransactionInfo;
import com.fosun.data.dataTask.model.DataCreditDatilOutlineInfo;
import com.fosun.data.dataTask.model.DataCreditDatilTransactionInfo;
import com.fosun.data.dataTask.model.DataCreditPublicInfo;
import com.fosun.data.dataTask.model.DataCreditQueryInfo;
import com.fosun.data.dataTask.model.DataCreditReportInfo;

public class CreditReportDto {
	//报告类型
	private String creditReportType;
	//报告  头部
	private DataCreditReportInfo dataCreditReportInfo;

	//报告 简版 信息概要
	private DataCreditBriefOutlineInfo dataCreditBriefOutlineInfo;
	//报告  详版信息概要
	private DataCreditDatilOutlineInfo dataCreditDatilOutlineInfo;
	
	//报告  信贷交易信息明细 -信用卡
	private List<DataCreditBriefTransactionInfo> briefCreditCardTransList;
	//报告  信贷交易信息明细 -房贷
	private List<DataCreditBriefTransactionInfo> briefHouseLoanTransList;
	//报告  信贷交易信息明细 -其他贷款
	private List<DataCreditBriefTransactionInfo> briefOtherLoanTransList;
	
	//报告  信贷交易信息明细 -贷款
	private List<DataCreditDatilTransactionInfo> datilLoanTransList;
	//报告  信贷交易信息明细 -贷记卡
	private List<DataCreditDatilTransactionInfo> datilCreditCardTransList;

	//报告  公共记录
	private DataCreditPublicInfo dataCreditPublicInfo;
	//报告  查询记录
	private List<DataCreditQueryInfo> queryList;
	
	public String getCreditReportType() {
		return creditReportType;
	}
	public void setCreditReportType(String creditReportType) {
		this.creditReportType = creditReportType;
	}
	public DataCreditReportInfo getDataCreditReportInfo() {
		return dataCreditReportInfo;
	}
	public void setDataCreditReportInfo(DataCreditReportInfo dataCreditReportInfo) {
		this.dataCreditReportInfo = dataCreditReportInfo;
	}
	public DataCreditBriefOutlineInfo getDataCreditBriefOutlineInfo() {
		return dataCreditBriefOutlineInfo;
	}
	public void setDataCreditBriefOutlineInfo(
			DataCreditBriefOutlineInfo dataCreditBriefOutlineInfo) {
		this.dataCreditBriefOutlineInfo = dataCreditBriefOutlineInfo;
	}
	public DataCreditDatilOutlineInfo getDataCreditDatilOutlineInfo() {
		return dataCreditDatilOutlineInfo;
	}
	public void setDataCreditDatilOutlineInfo(
			DataCreditDatilOutlineInfo dataCreditDatilOutlineInfo) {
		this.dataCreditDatilOutlineInfo = dataCreditDatilOutlineInfo;
	}
	public List<DataCreditBriefTransactionInfo> getBriefCreditCardTransList() {
		return briefCreditCardTransList;
	}
	public void setBriefCreditCardTransList(
			List<DataCreditBriefTransactionInfo> briefCreditCardTransList) {
		this.briefCreditCardTransList = briefCreditCardTransList;
	}
	public List<DataCreditBriefTransactionInfo> getBriefHouseLoanTransList() {
		return briefHouseLoanTransList;
	}
	public void setBriefHouseLoanTransList(
			List<DataCreditBriefTransactionInfo> briefHouseLoanTransList) {
		this.briefHouseLoanTransList = briefHouseLoanTransList;
	}
	public List<DataCreditBriefTransactionInfo> getBriefOtherLoanTransList() {
		return briefOtherLoanTransList;
	}
	public void setBriefOtherLoanTransList(
			List<DataCreditBriefTransactionInfo> briefOtherLoanTransList) {
		this.briefOtherLoanTransList = briefOtherLoanTransList;
	}
	public List<DataCreditDatilTransactionInfo> getDatilLoanTransList() {
		return datilLoanTransList;
	}
	public void setDatilLoanTransList(
			List<DataCreditDatilTransactionInfo> datilLoanTransList) {
		this.datilLoanTransList = datilLoanTransList;
	}
	public List<DataCreditDatilTransactionInfo> getDatilCreditCardTransList() {
		return datilCreditCardTransList;
	}
	public void setDatilCreditCardTransList(
			List<DataCreditDatilTransactionInfo> datilCreditCardTransList) {
		this.datilCreditCardTransList = datilCreditCardTransList;
	}
	public DataCreditPublicInfo getDataCreditPublicInfo() {
		return dataCreditPublicInfo;
	}
	public void setDataCreditPublicInfo(DataCreditPublicInfo dataCreditPublicInfo) {
		this.dataCreditPublicInfo = dataCreditPublicInfo;
	}
	public List<DataCreditQueryInfo> getQueryList() {
		return queryList;
	}
	public void setQueryList(List<DataCreditQueryInfo> queryList) {
		this.queryList = queryList;
	}
	@Override
	public String toString() {
		return "CreditReportDto ["
				+ "  \n creditReportType=" + creditReportType
				+ ", \n dataCreditReportInfo=" + dataCreditReportInfo
				+ ", \n dataCreditBriefOutlineInfo=" + dataCreditBriefOutlineInfo
				+ ", \n dataCreditDatilOutlineInfo=" + dataCreditDatilOutlineInfo
				+ ", \n briefCreditCardTransList=" + (null!= briefCreditCardTransList?briefCreditCardTransList.size():null)
				+ ", \n briefHouseLoanTransList=" + (null!= briefHouseLoanTransList?briefHouseLoanTransList.size():null)
				+ ", \n briefOtherLoanTransList=" + (null!= briefOtherLoanTransList?briefOtherLoanTransList.size():null)
				+ ", \n datilLoanTransList=" + (null!= datilLoanTransList?datilLoanTransList.size():null)
				+ ", \n datilCreditCardTransList=" + (null!= datilCreditCardTransList?datilCreditCardTransList.size():null)
				+ ", \n dataCreditPublicInfo=" + dataCreditPublicInfo
				+ ", \n queryList=" + (null!= queryList?queryList.size():null) + "]";
	}
}
