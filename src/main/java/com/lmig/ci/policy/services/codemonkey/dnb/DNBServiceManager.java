/**
 * 
 */
package com.lmig.ci.policy.services.codemonkey.dnb;

import java.util.StringTokenizer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author n0172213
 *
 */
@Component
public class DNBServiceManager {

    @Autowired
    private DNBClient dnbClient;
    
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
        return buildDetailsResponse(response);
		
	}
	
	String buildDetailsRequest(String req) {
		return req;
	}
	
	String buildDetailsResponse(String response) {

		return response;
	}
}
