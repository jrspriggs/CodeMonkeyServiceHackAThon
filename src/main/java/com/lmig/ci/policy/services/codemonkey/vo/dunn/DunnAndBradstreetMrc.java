package com.lmig.ci.policy.services.codemonkey.vo.dunn;

import java.util.ArrayList;
import java.util.List;

public class DunnAndBradstreetMrc {
	public List<String> mrcId;
	
	public DunnAndBradstreetMrc() {
		this.mrcId = new ArrayList<String>();
	}

	public List<String> getMrcId() {
		return mrcId;
	}

	public void setMrcId(List<String> mrcId) {
		this.mrcId = mrcId;
	}
}
