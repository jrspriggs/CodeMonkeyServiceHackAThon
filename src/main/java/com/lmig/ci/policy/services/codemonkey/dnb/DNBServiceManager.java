/**
 * 
 */
package com.lmig.ci.policy.services.codemonkey.dnb;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lmig.ci.policy.services.codemonkey.classCode.ClassCodeClient;
import com.lmig.ci.policy.services.codemonkey.db.ClassCodeDAO;
import com.lmig.ci.policy.services.codemonkey.vo.ClassCode;
import com.lmig.ci.policy.services.codemonkey.vo.ClassCodeSearch;
import com.lmig.ci.policy.services.codemonkey.vo.Classifications;
import com.lmig.ci.policy.services.codemonkey.vo.PrimaryClassCode;

/**
 * @author n0172213
 *
 */
@Component
public class DNBServiceManager {
	
    private static final Logger LOGGER = LoggerFactory.getLogger(DNBServiceManager.class);

    @Autowired
    private DNBClient dnbClient;
    
    @Autowired
    private ClassCodeClient classCodeClient;
    
	public String search(String req) {

        String request = buildSearchRequest(req);
        String response = dnbClient.search(request);
        return buildSearchResponse(response);
		
	}
	
	String buildSearchRequest(String req) {
		StringTokenizer st = new StringTokenizer(req, " ");
		StringBuilder sb = new StringBuilder();
		while (st.hasMoreTokens()) {
			sb.append(st.nextToken());
		}
		return sb.toString();
	}
	
	String buildSearchResponse(String response) {

		return response;
	}
    
	public String details(String req) {

        String request = buildDetailsRequest(req);
        String response = dnbClient.details(request);
        String classCodeReq = buildClassCodeRequest(response);
        String classCodes = classCodeClient.classification(classCodeReq);
        LOGGER.error("classCodeReq: " + classCodeReq + " classCodeResponse: " + classCodes);
        return buildDetailsResponse(response, classCodes);
		
	}
	
	String buildDetailsRequest(String req) {
		return req;
	}
	
	String buildClassCodeRequest(String response) {
		
		ClassCodeSearch classCodeSearch = new ClassCodeSearch();
        JSONObject jsonObject = new JSONObject(response);
        

        JSONObject locations = jsonObject.getJSONObject("locations");
        JSONArray location = locations.getJSONArray("location");
        JSONObject firstLocation = location.getJSONObject(0);
        classCodeSearch.setState(firstLocation.getString("state"));
		
		List<String> naicsList = new ArrayList<String>();
        JSONObject industries = jsonObject.getJSONObject("industries");
        JSONObject allNAICS = industries.getJSONObject("allNAICS");
        JSONArray items = allNAICS.getJSONArray("item");
        for (int i = 0; i < items.length(); i++) {
            JSONObject item = items.getJSONObject(i);            
            if (item.has("naics")) {
            	naicsList.add(item.getString("naics"));
            }
        }
        classCodeSearch.setNaicsCodes(naicsList);

		List<String> sicList = new ArrayList<String>();
        JSONObject allUSSIC = industries.getJSONObject("allUSSIC");
        items = allUSSIC.getJSONArray("item");
        for (int i = 0; i < items.length(); i++) {
            JSONObject item = items.getJSONObject(i);            
            if (item.has("ussic")) {
            	sicList.add(item.getString("ussic"));
            }
        }
        classCodeSearch.setSicCodes(sicList);
        try {
			return new ObjectMapper().writeValueAsString(classCodeSearch); 
		}catch (Exception e) {
			throw new RuntimeException("Caught exception: " + e.getClass().getName() + " " + e.getMessage(),e);
		}
	}
	
	String buildDetailsResponse(String response, String classCodes) {

		PrimaryClassCode primaryClassCode = new PrimaryClassCode();
		Classifications classifications = null;
		primaryClassCode.setClassCode("00000");
		primaryClassCode.setClassCodeDesc("unknown");
		try {

	        JSONObject jsonObject = new JSONObject(classCodes);
	        if (jsonObject.has("classCodes") && !jsonObject.isNull("classCodes")) {
	        	JSONArray classCodeArray = jsonObject.getJSONArray("classCodes");
	        	if (classCodeArray.length() > 0 && !classCodeArray.isNull(0)) {
	        		JSONObject firstClassCode = classCodeArray.getJSONObject(0);
	        		if (firstClassCode.has("glInternalCd") && !firstClassCode.isNull("glInternalCd")) {
	        			primaryClassCode.setClassCode(firstClassCode.getString("glInternalCd"));
	        		}
	        		if (firstClassCode.has("description") && !firstClassCode.isNull("description")) {
	        			primaryClassCode.setClassCodeDesc(firstClassCode.getString("description"));
	        		}
	        	}
	        }
			String primaryClassCodeJson = new ObjectMapper().writeValueAsString(primaryClassCode);
			int p = response.lastIndexOf('}');
			
			StringBuilder sb = new StringBuilder(response.substring(0, p));
			sb.append(", \"primaryClassCode\": ");
			sb.append(primaryClassCodeJson);
			sb.append(" }");
			LOGGER.error("Details Response: " + sb.toString());
			return sb.toString();
		} catch (Exception e) {
			throw new RuntimeException("Caught exception: " + e.getClass().getName() + " " + e.getMessage(),e);
		}
	}
}
