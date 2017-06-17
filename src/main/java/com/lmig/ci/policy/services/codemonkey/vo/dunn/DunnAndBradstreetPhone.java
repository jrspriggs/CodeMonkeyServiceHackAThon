package com.lmig.ci.policy.services.codemonkey.vo.dunn;

import java.util.ArrayList;
import java.util.List;

public class DunnAndBradstreetPhone {
	public List<DunnAndBradstreetPhoneNumber> phoneNumber;
	public List<DunnAndBradstreetFaxNumber> faxNumber; 
	
	public DunnAndBradstreetPhone() {
		this.phoneNumber = new ArrayList<DunnAndBradstreetPhoneNumber>();
		this.faxNumber = new ArrayList<DunnAndBradstreetFaxNumber>();
	}

	public List<DunnAndBradstreetPhoneNumber> getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(List<DunnAndBradstreetPhoneNumber> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public List<DunnAndBradstreetFaxNumber> getFaxNumber() {
		return faxNumber;
	}

	public void setFaxNumber(List<DunnAndBradstreetFaxNumber> faxNumber) {
		this.faxNumber = faxNumber;
	}
}
