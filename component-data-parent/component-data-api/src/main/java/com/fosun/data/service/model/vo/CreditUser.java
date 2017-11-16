package com.fosun.data.service.model.vo;

import io.swagger.annotations.ApiModelProperty;

/**
 * 输入参数（用户信息）
 * @author Spole
 *
 */
public class CreditUser {
	@ApiModelProperty(required=true,name="orderCode",value="外部订单编号")
	private String orderCode;
	@ApiModelProperty(required=true,name="education",value="学历")
	private String education;
	@ApiModelProperty(required=true,name="name",value="用户姓名")
	private String name;
	@ApiModelProperty(required=true,name="marriage",value="婚姻状况")
	private String marriage;
	@ApiModelProperty(required=true,name="identity",value="身份证号码")
	private String identity;
	@ApiModelProperty(required=true,name="residentStatus",value="居住情况")
	private String residentStatus;
	@ApiModelProperty(required=true,name="mobile",value="手机号码")
	private String mobile;
	@ApiModelProperty(required=true,name="profession",value="职业")
	private String profession;
	@ApiModelProperty(required=true,name="cardNo",value="银行卡号/信用卡号")
	private String cardNo;
	@ApiModelProperty(required=true,name="cardNos",value="银行卡号/信用卡号")
	private String cardNos;
	@ApiModelProperty(required=true,name="city",value="居住城市")
	private String city;
	@ApiModelProperty(required=true,name="gender",value="性别")
	private String gender;
	@ApiModelProperty(required=true,name="age",value="年龄")
	private String age;
	
	@ApiModelProperty(name="CCFlag",value="是否有信用卡")
	private String CCFlag;
	@ApiModelProperty(name="photo",value="被核对者照片")
	private String photo;
	
	
	public String getOrderCode() {
		return orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getName() {
		return name;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMarriage() {
		return marriage;
	}
	public void setMarriage(String marriage) {
		this.marriage = marriage;
	}
	public String getIdentity() {
		return identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}
	public String getResidentStatus() {
		return residentStatus;
	}
	public void setResidentStatus(String residentStatus) {
		this.residentStatus = residentStatus;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getCardNos() {
		return cardNos;
	}
	public void setCardNos(String cardNos) {
		this.cardNos = cardNos;
	}
	public String getCCFlag() {
		return CCFlag;
	}
	public void setCCFlag(String cCFlag) {
		CCFlag = cCFlag;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	

}
