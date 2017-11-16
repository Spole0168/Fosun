package com.fosun.data.service.model.vo;

import io.swagger.annotations.ApiModelProperty;
/**
 * 
 * @author Spole
 *
 */
public class CreditLoanDemand {
	// 输入参数（贷款需求）
	@ApiModelProperty(required=true,name="loanLimit",value="贷款额度")
	private String loanLimit;
	@ApiModelProperty(required=true,name="loanTerms",value="贷款期限")
	private String loanTerms;
	@ApiModelProperty(name="downPaymentRatio",value="首付比例")
	private String downPaymentRatio;
	public String getLoanLimit() {
		return loanLimit;
	}
	public void setLoanLimit(String loanLimit) {
		this.loanLimit = loanLimit;
	}
	public String getLoanTerms() {
		return loanTerms;
	}
	public void setLoanTerms(String loanTerms) {
		this.loanTerms = loanTerms;
	}
	public String getDownPaymentRatio() {
		return downPaymentRatio;
	}
	public void setDownPaymentRatio(String downPaymentRatio) {
		this.downPaymentRatio = downPaymentRatio;
	}

	
}
