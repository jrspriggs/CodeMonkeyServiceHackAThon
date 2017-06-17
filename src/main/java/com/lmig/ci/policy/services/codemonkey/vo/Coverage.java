package com.lmig.ci.policy.services.codemonkey.vo;

public class Coverage {

	private String name;
	private String selected;
	private String value;
	private String type; // O = optional S = standard
	private String premiumAmount;

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getSelected() {
		return selected;
	}
	
	public void setSelected(String selected) {
		this.selected = selected;
	}

	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}

	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}

	public String getPremiumAmount() {
		return premiumAmount;
	}
	
	public void setPremiumAmount(String premiumAmount) {
		this.premiumAmount = premiumAmount;
	}

}
