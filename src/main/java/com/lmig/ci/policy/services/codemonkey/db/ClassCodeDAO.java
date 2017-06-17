package com.lmig.ci.policy.services.codemonkey.db;

import java.util.ArrayList;
import java.util.List;

import com.lmig.ci.policy.services.codemonkey.vo.ClassCode;
/*
 * Queries the REF_DATA.E_COMM_REC table using the following criteria:
 * SELECT * FROM REF_DATA.E_COMM_REC WHERE sys_active = 'Y' and risk_st_ab = 'IN' and product_type_cd = '001' and policy_type_cd = '05' 
 * and sic_cd in ('8742', '7371') and end_written_dt > '2017-06-17' and written_dt <=  '2017-06-17'
 * 
 * SELECT * FROM REF_DATA.E_DISPLAY_WORDING WHERE sys_active = 'Y' and display_text_id = '209032' 
 * 
 * The display_text_id value is actually from the first select
 */
public class ClassCodeDAO {
	
	public List<ClassCode> getClassCodesBySicCode(String state, String sicCode) {
		return getClassCode(state, sicCode);
	}
	
	private List<ClassCode> getClassCode(String state, String sicCode) {
		List<ClassCode> classCodes = new ArrayList<ClassCode>();
	
		if (sicCode.equals("8742")) {
			ClassCode classCode = new ClassCode();
			classCode.setRiskStateAb(state);
			classCode.setPolicyTypeCd("05");
			classCode.setProductTypeCd("001");
			classCode.setInternalCd("58610");
			classCode.setSeqNo("1");
			classCode.setWrittenDate("2017-03-01");
			classCode.setEndDate("9999-12-31");
			classCode.setRatingId("4235");
			classCode.setTextId("209032");
			classCode.setClassCd("82271");
			classCode.setProgramId("68");
			classCode.setReplacementId("0");
			classCode.setGlInternalCd("070334");
			classCode.setGlClsCd("1677");
			classCode.setSicCd("8742");
			classCode.setDefaultLimit("0");
			classCode.setTivLimit("0");
			classCode.setPremBasisTxt("0");
			classCode.setInclProducts("Y");
			classCode.setDisplayTextId("209032");
			classCode.setRoleCdBusGrpCd("B");
			classCode.setPkgTypeId("00.00");
			classCode.setClassMessageId("0");
			classCode.setDescription("Office: Business Management Consulting");
			classCodes.add(classCode);
		}
		
		if (sicCode.equals("5461")) {
			ClassCode classCode = new ClassCode();
			classCode.setRiskStateAb(state);
			classCode.setPolicyTypeCd("05");
			classCode.setProductTypeCd("001");
			classCode.setInternalCd("50609");
			classCode.setSeqNo("1");
			classCode.setWrittenDate("2017-03-01");
			classCode.setEndDate("9999-12-31");
			classCode.setRatingId("5506");
			classCode.setTextId("209089");
			classCode.setClassCd("888551");
			classCode.setProgramId("64");
			classCode.setReplacementId("0");
			classCode.setGlInternalCd("002816");
			classCode.setGlClsCd("10100");
			classCode.setSicCd("5461");
			classCode.setDefaultLimit("0");
			classCode.setTivLimit("0");
			classCode.setPremBasisTxt("0");
			classCode.setInclProducts("Y");
			classCode.setDisplayTextId("209089");
			classCode.setRoleCdBusGrpCd("B");
			classCode.setPkgTypeId("00.00");
			classCode.setClassMessageId("0");
			classCode.setDescription("Bakeries - Baking on Premises - Retail");
			classCodes.add(classCode);
		}

		return classCodes;
	}

}
