package com.fosun.data.service.model.vo;

import io.swagger.annotations.ApiModelProperty;

public class CreditSignedInfo {
	@ApiModelProperty(required=true,name="reportFlag",value="报告类型")
	private String reportFlag;
	@ApiModelProperty(required=true,name="productType",value="产品类型")
	private String productType;
	@ApiModelProperty(required=true,name="requestCode",value="报告类型")
	private String requestCode;
	
	@ApiModelProperty(name="passwordFlag",value="简版征信报告密码标记")
	private String passwordFlag;
	@ApiModelProperty(name="invokerName",value="根据不同场景方填写(应用的名字)")
	private String invokerName;
	@ApiModelProperty(name="bizUk",value="外部订单号(uuid随机数或订单流水)")
	private String bizUk;
	@ApiModelProperty(name="apiToken",value="根据不同场景方填写(AS001)")
	private String	apiToken;
	
	
	public String getReportFlag() {
		return reportFlag;
	}
	public void setReportFlag(String reportFlag) {
		this.reportFlag = reportFlag;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getPasswordFlag() {
		return passwordFlag;
	}
	public void setPasswordFlag(String passwordFlag) {
		this.passwordFlag = passwordFlag;
	}
	public String getRequestCode() {
		return requestCode;
	}
	public void setRequestCode(String requestCode) {
		this.requestCode = requestCode;
	}
	public String getInvokerName() {
		return invokerName;
	}
	public void setInvokerName(String invokerName) {
		this.invokerName = invokerName;
	}
	public String getBizUk() {
		return bizUk;
	}
	public void setBizUk(String bizUk) {
		this.bizUk = bizUk;
	}
	public String getApiToken() {
		return apiToken;
	}
	public void setApiToken(String apiToken) {
		this.apiToken = apiToken;
	}
	
	
	
}
