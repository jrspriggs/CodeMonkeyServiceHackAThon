package com.lmig.ci.policy.services.codemonkey.classCode;

import com.lmig.ci.policy.services.codemonkey.db.ClassCodeDAO;
import com.lmig.ci.policy.services.codemonkey.vo.ClassCode;
import com.lmig.ci.policy.services.codemonkey.vo.ClassCodeSearch;
import com.lmig.ci.policy.services.codemonkey.vo.Classifications;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

/*
 * Get all classifications for the given search criteria
 */
public class CMClassCodeService {
	public Classifications getClassifications(String request) {
		Classifications classifications = new Classifications();
		try {
		ClassCodeSearch classCodeSearch = new ObjectMapper().readValue(request, ClassCodeSearch.class);
				
		ClassCodeDAO dao = new ClassCodeDAO();
		
		// get a list of sic codes (first 4 characters) from the search criteria
		for (String sicCode : getShortSicCodes(classCodeSearch.getSicCodes())) {
			// Call the DB to retrieve the classification information if found
			List<ClassCode> dbClassCodes = dao.getClassCodesBySicCode(classCodeSearch.getState(), sicCode);
			addClassCodes(classifications, dbClassCodes);
		}
		}catch (Exception e) {
			throw new RuntimeException("Caught exception: " + e.getClass().getName() + " " + e.getMessage(),e);
		}

		return classifications;
	}
	
	public List<String> getShortSicCodes(List<String> sicCodes) {
		List<String> shortSicCodes = new ArrayList<String>();
		for (String sicCode : sicCodes) {	
			if (sicCode.length() > 4) {
				shortSicCodes.add(sicCode.substring(0,4));
			} else {
				shortSicCodes.add(sicCode);
			}
		}
		return shortSicCodes;
	}
	
	public void addClassCodes(Classifications classifications, List<ClassCode> classCodes) {
		List<ClassCode> newClassCodeList = classifications.getClassCodes();
		newClassCodeList.addAll(classCodes);
		System.out.println("***Cheryl - newClassCodeList = " + newClassCodeList.toString());
		classifications.setClassCodes(newClassCodeList);
	}
}
