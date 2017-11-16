package com.fosun.data.service.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fosun.data.service.model.vo.*;

@ApiModel(value="CreditRiskReq")
public class CreditRiskReq {
	
	
	@ApiModelProperty(required=true,name="inFileId",value="征信报告在影像系统的id")
	private String inFileId;
	
	@ApiModelProperty(required=true,name="creditReportType",value="征信报告类型  0-简版；1-详版")
	private String creditReportType;
	
	@ApiModelProperty(required=true,name="creditSignedInfo",value="标记类信息")
	private CreditSignedInfo creditSignedInfo;
	
	@ApiModelProperty(required=true,name="creditUser",value="用户信息")
	private CreditUser creditUser;
	
	@ApiModelProperty(required=true,name="creditLoanDemand",value="贷款需求")
	private CreditLoanDemand creditLoanDemand;
	
	@ApiModelProperty(name="creditAdditionalInfo",value="附加信息")
	private CreditAdditionalInfo creditAdditionalInfo;
	@ApiModelProperty(name="creditSupplementInfo",value="补充信息")
	private CreditSupplementInfo creditSupplementInfo;
	
	@ApiModelProperty(name="creditBriefReport",value="简版征信信息")
	private CreditBriefReport creditBriefReport;
	
	@ApiModelProperty(name="creditDetailReport",value="详版征信信息")
	private CreditDetailReport creditDetailReport;
	
	@ApiModelProperty(name="creditEarnings",value="有财报信息")
	private CreditEarnings creditEarnings;
	
	@ApiModelProperty(name="creditNoEarnings",value="无财报信息")
	private CreditNoEarnings creditNoEarnings;
	
	@ApiModelProperty(name="creditPwdReport",value="密码版征信信息")
	private CreditPwdReport creditPwdReport;
	
	@ApiModelProperty(name="houseLoanInfo",value="房抵贷信息")
	private HouseLoanInfo houseLoanInfo;
	
	@ApiModelProperty(name="medicalGang",value="密码版征信信息")
	private MedicalGang medicalGang;
	
	@ApiModelProperty(name="youShuLoanInfo",value="有数贷")
	private YouShuLoanInfo  youShuLoanInfo;
		

	
	public String getInFileId() {
		return inFileId;
	}

	public void setInFileId(String inFileId) {
		this.inFileId = inFileId;
	}

	public String getCreditReportType() {
		return creditReportType;
	}

	public void setCreditReportType(String creditReportType) {
		this.creditReportType = creditReportType;
	}

	public CreditUser getCreditUser() {
		return creditUser;
	}

	public void setCreditUser(CreditUser creditUser) {
		this.creditUser = creditUser;
	}

	public CreditLoanDemand getCreditLoanDemand() {
		return creditLoanDemand;
	}

	public void setCreditLoanDemand(CreditLoanDemand creditLoanDemand) {
		this.creditLoanDemand = creditLoanDemand;
	}

	public CreditBriefReport getCreditBriefReport() {
		return creditBriefReport;
	}

	public void setCreditBriefReport(CreditBriefReport creditBriefReport) {
		this.creditBriefReport = creditBriefReport;
	}

	public CreditDetailReport getCreditDetailReport() {
		return creditDetailReport;
	}

	public void setCreditDetailReport(CreditDetailReport creditDetailReport) {
		this.creditDetailReport = creditDetailReport;
	}

	public CreditEarnings getCreditEarnings() {
		return creditEarnings;
	}

	public void setCreditEarnings(CreditEarnings creditEarnings) {
		this.creditEarnings = creditEarnings;
	}

	public CreditNoEarnings getCreditNoEarnings() {
		return creditNoEarnings;
	}

	public void setCreditNoEarnings(CreditNoEarnings creditNoEarnings) {
		this.creditNoEarnings = creditNoEarnings;
	}

	public CreditPwdReport getCreditPwdReport() {
		return creditPwdReport;
	}

	public void setCreditPwdReport(CreditPwdReport creditPwdReport) {
		this.creditPwdReport = creditPwdReport;
	}

	public CreditAdditionalInfo getCreditAdditionalInfo() {
		return creditAdditionalInfo;
	}

	public void setCreditAdditionalInfo(CreditAdditionalInfo creditAdditionalInfo) {
		this.creditAdditionalInfo = creditAdditionalInfo;
	}

	public CreditSupplementInfo getCreditSupplementInfo() {
		return creditSupplementInfo;
	}

	public void setCreditSupplementInfo(CreditSupplementInfo creditSupplementInfo) {
		this.creditSupplementInfo = creditSupplementInfo;
	}

	public CreditSignedInfo getCreditSignedInfo() {
		return creditSignedInfo;
	}

	public void setCreditSignedInfo(CreditSignedInfo creditSignedInfo) {
		this.creditSignedInfo = creditSignedInfo;
	}

	public HouseLoanInfo getHouseLoanInfo() {
		return houseLoanInfo;
	}

	public void setHouseLoanInfo(HouseLoanInfo houseLoanInfo) {
		this.houseLoanInfo = houseLoanInfo;
	}

	public MedicalGang getMedicalGang() {
		return medicalGang;
	}

	public void setMedicalGang(MedicalGang medicalGang) {
		this.medicalGang = medicalGang;
	}

	public YouShuLoanInfo getYouShuLoanInfo() {
		return youShuLoanInfo;
	}

	public void setYouShuLoanInfo(YouShuLoanInfo youShuLoanInfo) {
		this.youShuLoanInfo = youShuLoanInfo;
	}


		
	
	
	
	
	
	
	
}
