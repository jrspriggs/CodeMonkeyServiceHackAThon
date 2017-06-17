package com.lmig.ci.policy.services.codemonkey.api.defaulter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lmig.ci.policy.services.codemonkey.defaulter.CMCoverageDefaulterService;

/**
 * @author n0172213
 *
 */
@RestController
public class CMDefaulterServiceController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CMDefaulterServiceController.class);
    private static final String APPLICATION_JSON = "application/json";

    private final CMCoverageDefaulterService service; 

	@Autowired 
	public CMDefaulterServiceController(CMCoverageDefaulterService service) { 
		this.service = service; 
	} 

    @RequestMapping(value = "/v1/defaulter/coverages", consumes = { APPLICATION_JSON }, produces = { APPLICATION_JSON }, method = RequestMethod.POST)
    public ResponseEntity<String> defaultCoverages(@RequestBody String request) {

        LOGGER.info("Entering defaultCoverages method.");
        try {
        	String defaults = service.getDefaultedCoverages(request);
        	
            return ResponseEntity.status(HttpStatus.OK).body(defaults);
        } catch (Exception e) {
            LOGGER.error("Exception returned from WSRB defaultCoverages service: " + e.getMessage(), e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Exception: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }
    }
}
