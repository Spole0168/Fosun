package com.fosun.data.service.model;

import java.util.List;

import com.fosun.data.service.model.vo.RepReasons;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel(value="CreditRiskRep")
public class CreditRiskRep {
	@ApiModelProperty(name="riskScore",value="风控评分")
	private String riskScore;
	@ApiModelProperty(name="finalRiskLevel",value="综合风险等级")
	private String finalRiskLevel;
	@ApiModelProperty(name="descion",value="审批意见")
	private String descion;
	@ApiModelProperty(name="approvalFlag",value="1-PENDING，0-不通过")
	private String approvalFlag;
	@ApiModelProperty(name="passRate",value="市场通过率")
	private String passRate;
	@ApiModelProperty(name="finalCreditLimit",value="建议额度（附加服务提供）")
	private String finalCreditLimit;
	@ApiModelProperty(name="finalInterest",value="建议定价（附加服务提供）")
	private String finalInterest;
	@ApiModelProperty(name="pdfData",value="包含数据依据的专业评估报告")
	private String pdfData;
	@ApiModelProperty(name="encodeName",value="影像系统中该PDF的存储位置")
	private String encodeName;
	@ApiModelProperty(name="riskPrice",value="风险定价")
	private String riskPrice;
	@ApiModelProperty(name="riskDiscount",value="风险折扣")
	private String riskDiscount;
	@ApiModelProperty(name="scoreCardLevel",value="评分卡分值")
	private String scoreCardLevel;
	@ApiModelProperty(name="policyRiskLevel",value="政策风险等级：H：禁止性；R：限制性；T:风险提示性；N：未命中")
	private String	policyRiskLevel;
	
	@ApiModelProperty(name="reasons",value="规则触发清单")
	private List<RepReasons> reasons;
	
	@ApiModelProperty(name="respCode",value="返回码")
	private String respCode;
	@ApiModelProperty(name="respMsg",value="返回信息")
	private String respMsg;
	
	private String middleResult;
	private String decison;
	//1-触发收费规则，0-没有触发收费规则(仅房抵贷显示)
	private String chargeFlag;
	//中断信息描述
	private String errorDesc;
	
	private List limitList;
	//量富原始报文
	private String srcResult;
	
	
	
	public String getSrcResult() {
		return srcResult;
	}
	public void setSrcResult(String srcResult) {
		this.srcResult = srcResult;
	}
	public String getChargeFlag() {
		return chargeFlag;
	}
	public void setChargeFlag(String chargeFlag) {
		this.chargeFlag = chargeFlag;
	}
	public String getErrorDesc() {
		return errorDesc;
	}
	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}
	public String getMiddleResult() {
		return middleResult;
	}
	public void setMiddleResult(String middleResult) {
		this.middleResult = middleResult;
	}
	public String getDecison() {
		return decison;
	}
	public void setDecison(String decison) {
		this.decison = decison;
	}
	public List getLimitList() {
		return limitList;
	}
	public void setLimitList(List limitList) {
		this.limitList = limitList;
	}
	public String getRiskScore() {
		return riskScore;
	}
	public void setRiskScore(String riskScore) {
		this.riskScore = riskScore;
	}
	public String getFinalRiskLevel() {
		return finalRiskLevel;
	}
	public void setFinalRiskLevel(String finalRiskLevel) {
		this.finalRiskLevel = finalRiskLevel;
	}
	
	public String getApprovalFlag() {
		return approvalFlag;
	}
	public void setApprovalFlag(String approvalFlag) {
		this.approvalFlag = approvalFlag;
	}
	public String getPassRate() {
		return passRate;
	}
	public void setPassRate(String passRate) {
		this.passRate = passRate;
	}
	public String getFinalCreditLimit() {
		return finalCreditLimit;
	}
	public void setFinalCreditLimit(String finalCreditLimit) {
		this.finalCreditLimit = finalCreditLimit;
	}
	public String getFinalInterest() {
		return finalInterest;
	}
	public void setFinalInterest(String finalInterest) {
		this.finalInterest = finalInterest;
	}
	public String getPdfData() {
		return pdfData;
	}
	public void setPdfData(String pdfData) {
		this.pdfData = pdfData;
	}
	public String getEncodeName() {
		return encodeName;
	}
	public void setEncodeName(String encodeName) {
		this.encodeName = encodeName;
	}
	public String getRiskPrice() {
		return riskPrice;
	}
	public void setRiskPrice(String riskPrice) {
		this.riskPrice = riskPrice;
	}
	public String getRiskDiscount() {
		return riskDiscount;
	}
	public void setRiskDiscount(String riskDiscount) {
		this.riskDiscount = riskDiscount;
	}
	public String getScoreCardLevel() {
		return scoreCardLevel;
	}
	public void setScoreCardLevel(String scoreCardLevel) {
		this.scoreCardLevel = scoreCardLevel;
	}
	public String getPolicyRiskLevel() {
		return policyRiskLevel;
	}
	public void setPolicyRiskLevel(String policyRiskLevel) {
		this.policyRiskLevel = policyRiskLevel;
	}
	public List<RepReasons> getReasons() {
		return reasons;
	}
	public void setReasons(List<RepReasons> reasons) {
		this.reasons = reasons;
	}
	public String getRespCode() {
		return respCode;
	}
	public void setRespCode(String respCode) {
		this.respCode = respCode;
	}
	public String getRespMsg() {
		return respMsg;
	}
	public void setRespMsg(String respMsg) {
		this.respMsg = respMsg;
	}
	public String getDescion() {
		return descion;
	}
	public void setDescion(String descion) {
		this.descion = descion;
	}
	
	
	
	
	
}
