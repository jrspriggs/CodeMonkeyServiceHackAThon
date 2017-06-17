/**
 * 
 */
package com.lmig.ci.policy.services.codemonkey.api;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.lmig.ci.policy.services.codemonkey.dnb.DNBServiceManager;

/**
 * @author n0172213
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class CMServiceControllerTest {

    @Autowired
    private DNBServiceManager dnbServiceManager;
    
    @InjectMocks
    private CMServiceController cmServiceController;
    
	@Test
	public void test() {
		ResponseEntity<String> result = cmServiceController.search("Fusion Alliance");
		
		System.out.println(result.getBody());
	}

}
