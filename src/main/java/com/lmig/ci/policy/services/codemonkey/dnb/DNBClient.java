/**
 * 
 */
package com.lmig.ci.policy.services.codemonkey.dnb;

import java.net.InetSocketAddress;
import java.net.Proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;



/**
 * @author n0172213
 *
 */
@Component
public class DNBClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(DNBClient.class);
    
	private final String DNB_SEARCH_ENDPOINT = "http://api.dnbdirectapps.com/dev/DnBAPI-17/rest/search/company";
	private final String DNB_DETAILS_ENDPOINT = "http://api.dnbdirectapps.com/dev/DnBAPI-17/rest/company";

	public String search(String request) {
        return get(DNB_SEARCH_ENDPOINT, request);
	}

	public String details(String request) {
        return get(DNB_DETAILS_ENDPOINT, request);
	}

    String get(String endPoint, String request) {

        HttpHeaders requestHeaders = new HttpHeaders();
        //requestHeaders.setAccept(Arrays.asList(acceptType));
        //requestHeaders.setAcceptCharset(Arrays.asList(Charset.forName("UTF-8")));
        requestHeaders.set("API-KEY", "5uedy9ufmkf9n4b6djttkd6d");
        requestHeaders.set("username", "fusionCodeMonkey");
        requestHeaders.set("password", "Leroy1234");
        String url = endPoint + "/" + request; 

        LOGGER.debug("url: [" + url + "]");
        LOGGER.error("url: [" + url + "]");

        HttpEntity<String> entity = new HttpEntity<String>("parameters", requestHeaders);
        ResponseEntity<String> response = getRestTemplate().exchange(url, HttpMethod.GET, entity, String.class);
    	          
        LOGGER.info("Successful webservice call - endPoint: " + endPoint + " request: " + request + " HTTP Status: " + response.getStatusCode().toString() + " Response body: " + response.getBody());
        return response.getBody();
    }
    
    RestTemplate getRestTemplate() {

        SimpleClientHttpRequestFactory clientHttpRequestFactory = new SimpleClientHttpRequestFactory();
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("www-proxy.lmig.com", 80));
        clientHttpRequestFactory.setProxy(proxy);
        return new RestTemplate(clientHttpRequestFactory);
    }
}
