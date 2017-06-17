package com.lmig.ci.policy.services.codemonkey.vo.dunn;

import java.util.ArrayList;
import java.util.List;

public class DunnAndBradstreetKeyNumbersHistory {
	public String quarterlyKeyNumbersHistory;
	public List<DunnAndBradstreetKeyNumbers> annualKeyNumbersHistory;
	
	public DunnAndBradstreetKeyNumbersHistory() {
		this.annualKeyNumbersHistory = new ArrayList<DunnAndBradstreetKeyNumbers>();
	}
}
