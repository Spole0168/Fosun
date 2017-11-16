package com.fosun.data.service.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


@ApiModel(value="ZMXYReq")
public class ZMXYReq {
	@ApiModelProperty(name="channel",value="通道")
	private String channel;
	@ApiModelProperty(name="platform",value="平台")
	private String platform;
	@ApiModelProperty(name="productCode",value="产品码")
	private String productCode;
	@ApiModelProperty(name="transactionId",value="商户请求的唯一标志")
	private String transactionId;
	@ApiModelProperty(name="certNo",value="证件号")
	private String certNo;
	@ApiModelProperty(name="certType",value="证件类型")
	private String certType;
	@ApiModelProperty(name="name",value="姓名")
	private String name;
	@ApiModelProperty(name="mobile",value="手机号码")
	private String mobile;
	@ApiModelProperty(name="email",value="电子邮箱")
	private String email;
	@ApiModelProperty(name="bankCard",value="银行卡号")
	private String bankCard;
	@ApiModelProperty(name="address",value="地址信息")
	private String address;
	@ApiModelProperty(name="ip",value="ip地址")
	private String ip;
	@ApiModelProperty(name="mac",value="物理地址")
	private String	mac;
	@ApiModelProperty(name="wifimac",value="wifi的物理地址")
	private String wifimac;
	@ApiModelProperty(name="imei",value="国际移动设备标志")
	private String imei;
	
	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getCertNo() {
		return certNo;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return certType;
	}

	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBankCard() {
		return bankCard;
	}

	public void setBankCard(String bankCard) {
		this.bankCard = bankCard;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getMac() {
		return mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public String getWifimac() {
		return wifimac;
	}

	public void setWifimac(String wifimac) {
		this.wifimac = wifimac;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	@Override
	public String toString() {
		return "ZMXYReq [channel=" + channel + ", platform="
				+ platform + ", productCode=" + productCode + ", transactionId="
				+ transactionId + ", certNo=" + certNo
				+ ", certType=" + certType + ", name="
				+ name + ", mobile=" + mobile + ", email="
				+ email + ", bankCard=" + bankCard + ", address="
				+ address + ", ip=" + ip
				+ ", mac=" + mac + ", wifimac="
				+ wifimac + ", imei=" + imei + "]";
	}
	
}
