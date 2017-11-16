package com.fosun.data.service.model.vo;

import io.swagger.annotations.ApiModelProperty;

public class YouShuLoanInfo {
	@ApiModelProperty(required=true,name="productTerms",value="产品期限")
	private String productTerms;			//产品期限 例如12、24、36
	@ApiModelProperty(required=true,name="custChannel",value="获客渠道 ")
	private String custChannel;				//获客渠道 	数字字典：	CP：CP渠道 SP：SP渠道
	public String getProductTerms() {
		return productTerms;
	}
	public void setProductTerms(String productTerms) {
		this.productTerms = productTerms;
	}
	public String getCustChannel() {
		return custChannel;
	}
	public void setCustChannel(String custChannel) {
		this.custChannel = custChannel;
	}

}
