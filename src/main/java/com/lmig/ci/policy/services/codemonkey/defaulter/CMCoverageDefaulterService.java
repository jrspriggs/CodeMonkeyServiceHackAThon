package com.lmig.ci.policy.services.codemonkey.defaulter;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lmig.ci.policy.services.codemonkey.vo.defulter.coverages.CoverageDefault;
import com.lmig.ci.policy.services.codemonkey.vo.defulter.coverages.Criteria;

public class CMCoverageDefaulterService {
	
	public String getDefaultedCoverages(String request) {
		try {
			Criteria tokenResponse = new ObjectMapper().readValue(request, Criteria.class); 
		
			//do stuff
			
			List<CoverageDefault> defaults = new ArrayList<CoverageDefault>();
			CoverageDefault default1 = new CoverageDefault();
			default1.setCoverageCode("ABC");
			default1.setDefaultValue("1111");
			defaults.add(default1);
			CoverageDefault default2 = new CoverageDefault();
			default2.setCoverageCode("XYZ");
			default2.setDefaultValue("2222");
			defaults.add(default2);
			CoverageDefault default3 = new CoverageDefault();
			default3.setCoverageCode("MOUSE");
			default3.setDefaultValue("3333");
			defaults.add(default3);
			
			return new ObjectMapper().writeValueAsString(defaults); 
		}
		catch (Exception e) {
			throw new RuntimeException("Caught exception: " + e.getClass().getName() + " " + e.getMessage(),e);
		}
	}

}
