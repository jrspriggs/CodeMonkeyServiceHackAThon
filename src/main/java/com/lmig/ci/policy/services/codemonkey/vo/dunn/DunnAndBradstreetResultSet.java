package com.lmig.ci.policy.services.codemonkey.vo.dunn;

import java.util.ArrayList;
import java.util.List;

public class DunnAndBradstreetResultSet {
	private String lastHit;
	private String totalHits;
	private String hits;
	private List<DunnAndBradstreetHit> hit;
	private String firstHit;
	
	public DunnAndBradstreetResultSet() {
		this.hit = new ArrayList<DunnAndBradstreetHit>();
	}

	public String getLastHit() {
		return lastHit;
	}

	public void setLastHit(String lastHit) {
		this.lastHit = lastHit;
	}

	public String getTotalHits() {
		return totalHits;
	}

	public void setTotalHits(String totalHits) {
		this.totalHits = totalHits;
	}

	public String getHits() {
		return hits;
	}

	public void setHits(String hits) {
		this.hits = hits;
	}

	public List<DunnAndBradstreetHit> getHit() {
		return hit;
	}

	public void setHit(List<DunnAndBradstreetHit> hit) {
		this.hit = hit;
	}

	public String getFirstHit() {
		return firstHit;
	}

	public void setFirstHit(String firstHit) {
		this.firstHit = firstHit;
	}
}
