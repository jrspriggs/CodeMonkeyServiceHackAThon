package com.lmig.ci.policy.services.codemonkey.classCode;

import com.lmig.ci.policy.services.codemonkey.db.ClassCodeDAO;
import com.lmig.ci.policy.services.codemonkey.vo.ClassCodeSearch;
import com.lmig.ci.policy.services.codemonkey.vo.Classifications;

/*
 * Get all classifications for the given search criteria
 */
public class CMClassCodeService {
	public Classifications getClassifications(ClassCodeSearch classCodeSearch) {

		Classifications classifications = new Classifications();
		
		ClassCodeDAO dao = new ClassCodeDAO();
		
		// get a list of sic codes (first 4 characters) from the search criteria
		for (String sicCode : classCodeSearch.getShortSicCodes()) {
			// Call the DB to retrieve the classification information if found
			classifications.addClassCodes(dao.getClassCodesBySicCode(classCodeSearch.getState(), sicCode));
		}

		return classifications;
	}
}
