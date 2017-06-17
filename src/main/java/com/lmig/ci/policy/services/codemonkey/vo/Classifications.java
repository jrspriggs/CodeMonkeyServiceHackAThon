package com.lmig.ci.policy.services.codemonkey.vo;

import java.util.ArrayList;
import java.util.List;

public class Classifications {
	private List<ClassCode> classCodes;
	
	public Classifications() {
		this.classCodes = new ArrayList<ClassCode>();
	}

	public List<ClassCode> getClassCodes() {
		return classCodes;
	}

	public void setClassCodes(List<ClassCode> classCodes) {
		this.classCodes = classCodes;
	}
	
	public void addClassCodes(List<ClassCode> classCodes) {
		this.classCodes.addAll(classCodes);
	}
	
	public String getJson() {
		StringBuilder sb = new StringBuilder();
		sb.append("{\"classifications\": {");
		for (ClassCode classCode : this.classCodes) {
			sb.append(classCode.getJson());
		}
		sb.append("}}");
		return sb.toString();
	}
}
