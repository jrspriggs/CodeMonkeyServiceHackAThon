/**
 * 
 */
package com.lmig.ci.policy.services.codemonkey.dnb;

import static org.springframework.http.MediaType.APPLICATION_JSON;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.nio.charset.Charset;
import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


/**
 * @author n0172213
 *
 */
@Component
public class CoverageClient {

	//private static final Logger LOGGER = LoggerFactory.getLogger(CoverageClient.class);
	
	private final String COVERAGE_ENDPOINT = "http://localhost:8080/v1/defaulter/coverages";
	
	public String coverage(String request) {
	    return post(COVERAGE_ENDPOINT, request);
	}

	String post(String endPoint, String request) {
	
	    HttpHeaders requestHeaders = new HttpHeaders();
	    requestHeaders.setContentType(APPLICATION_JSON);
	    requestHeaders.setAccept(Arrays.asList(APPLICATION_JSON));
	    requestHeaders.setAcceptCharset(Arrays.asList(Charset.forName("UTF-8")));
	    HttpEntity<String> requestEntity = new HttpEntity<String>(request, requestHeaders);
	    ResponseEntity<String> response = new RestTemplate().exchange(endPoint, HttpMethod.POST, requestEntity, String.class);
	    return response.getBody();
	}
}