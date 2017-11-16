package com.fosun.data.service.model.vo;

public class RepReasons {
	private String  ruleName;
	private String  categoryName;
	private String  chargeable;
	
	public String getRuleName() {
		return ruleName;
	}
	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	public String getChargeable() {
		return chargeable;
	}
	public void setChargeable(String chargeable) {
		this.chargeable = chargeable;
	}
	public RepReasons() {
		super();
	}
	@Override
	public String toString() {
		return "RepReasons [ruleName=" + ruleName + ", categoryName="
				+ categoryName + ", chargeable=" + chargeable + "]";
	}
	
	
}
