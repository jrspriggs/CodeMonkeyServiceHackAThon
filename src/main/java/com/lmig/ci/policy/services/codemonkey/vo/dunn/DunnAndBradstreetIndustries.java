package com.lmig.ci.policy.services.codemonkey.vo.dunn;

import java.util.ArrayList;
import java.util.List;

public class DunnAndBradstreetIndustries {
	public String primaryDnBIC;
	public String primaryUKSIC;
	public List<DunnAndBradstreetNaicsItem> allNAICS;
	public List<DunnAndBradstreetUsSicItem> allUSSIC;
	public String lineOfBusiness;
	public String primaryNAICS;
	public List<DunnAndBradstreetUkSicItem> allUKSIC;
	public List<DunnAndBradstreetDnBicItem> allDnBIC;
	public String primaryUSSIC;
	
	public DunnAndBradstreetIndustries() {
		this.allNAICS = new ArrayList<DunnAndBradstreetNaicsItem>();
		this.allUSSIC = new ArrayList<DunnAndBradstreetUsSicItem>();
		this.allUKSIC = new ArrayList<DunnAndBradstreetUkSicItem>();
		this.allDnBIC = new ArrayList<DunnAndBradstreetDnBicItem>();
	}

	public String getPrimaryDnBIC() {
		return primaryDnBIC;
	}

	public void setPrimaryDnBIC(String primaryDnBIC) {
		this.primaryDnBIC = primaryDnBIC;
	}

	public String getPrimaryUKSIC() {
		return primaryUKSIC;
	}

	public void setPrimaryUKSIC(String primaryUKSIC) {
		this.primaryUKSIC = primaryUKSIC;
	}

	public List<DunnAndBradstreetNaicsItem> getAllNAICS() {
		return allNAICS;
	}

	public void setAllNAICS(List<DunnAndBradstreetNaicsItem> allNAICS) {
		this.allNAICS = allNAICS;
	}

	public List<DunnAndBradstreetUsSicItem> getAllUSSIC() {
		return allUSSIC;
	}

	public void setAllUSSIC(List<DunnAndBradstreetUsSicItem> allUSSIC) {
		this.allUSSIC = allUSSIC;
	}

	public String getLineOfBusiness() {
		return lineOfBusiness;
	}

	public void setLineOfBusiness(String lineOfBusiness) {
		this.lineOfBusiness = lineOfBusiness;
	}

	public String getPrimaryNAICS() {
		return primaryNAICS;
	}

	public void setPrimaryNAICS(String primaryNAICS) {
		this.primaryNAICS = primaryNAICS;
	}

	public List<DunnAndBradstreetUkSicItem> getAllUKSIC() {
		return allUKSIC;
	}

	public void setAllUKSIC(List<DunnAndBradstreetUkSicItem> allUKSIC) {
		this.allUKSIC = allUKSIC;
	}

	public List<DunnAndBradstreetDnBicItem> getAllDnBIC() {
		return allDnBIC;
	}

	public void setAllDnBIC(List<DunnAndBradstreetDnBicItem> allDnBIC) {
		this.allDnBIC = allDnBIC;
	}

	public String getPrimaryUSSIC() {
		return primaryUSSIC;
	}

	public void setPrimaryUSSIC(String primaryUSSIC) {
		this.primaryUSSIC = primaryUSSIC;
	}
}
