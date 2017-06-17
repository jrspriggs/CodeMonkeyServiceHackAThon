package com.lmig.ci.policy.services.codemonkey.vo;

import java.util.List;

public class ClassCodeSearch {
	private String state;
	private List<String> naicsCodes;
	private List<String> sicCodes;
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public List<String> getNaicsCodes() {
		return naicsCodes;
	}
	public void setNaicsCodes(List<String> naicsCodes) {
		this.naicsCodes = naicsCodes;
	}
	public List<String> getSicCodes() {
		return sicCodes;
	}
	public void setSicCodes(List<String> sicCodes) {
		this.sicCodes = sicCodes;
	}
}
