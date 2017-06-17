package com.lmig.ci.policy.services.codemonkey.vo.dunn;

public class DunnAndBradstreetOfficial {
	public DunnAndBradstreetPerson person;
	public DunnAndBradstreetConnectMail connectMail;
	public String coOfficialId;
	public DunnAndBradstreetLatestPosition latestPosition;
	public DunnAndBradstreetLatestSalary latestSalary;
	
	public DunnAndBradstreetPerson getPerson() {
		return person;
	}
	public void setPerson(DunnAndBradstreetPerson person) {
		this.person = person;
	}
	public DunnAndBradstreetConnectMail getConnectMail() {
		return connectMail;
	}
	public void setConnectMail(DunnAndBradstreetConnectMail connectMail) {
		this.connectMail = connectMail;
	}
	public String getCoOfficialId() {
		return coOfficialId;
	}
	public void setCoOfficialId(String coOfficialId) {
		this.coOfficialId = coOfficialId;
	}
	public DunnAndBradstreetLatestPosition getLatestPosition() {
		return latestPosition;
	}
	public void setLatestPosition(DunnAndBradstreetLatestPosition latestPosition) {
		this.latestPosition = latestPosition;
	}
	public DunnAndBradstreetLatestSalary getLatestSalary() {
		return latestSalary;
	}
	public void setLatestSalary(DunnAndBradstreetLatestSalary latestSalary) {
		this.latestSalary = latestSalary;
	}
}
