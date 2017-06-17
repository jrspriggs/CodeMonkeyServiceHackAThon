/**
 * 
 */
package com.lmig.ci.policy.services.codemonkey.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author n0172213
 *
 */
@RestController
public class CMServiceController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CMServiceController.class);
    private static final String APPLICATION_JSON = "application/json";
    
    @RequestMapping(value = "/v1/search", produces = { APPLICATION_JSON }, method = RequestMethod.GET)
    public ResponseEntity<String> searchAddress() {

        LOGGER.info("Entering searchAddress method.");
        try {
            String addressResponse = "{json: response}";
            return ResponseEntity.status(HttpStatus.OK).body(addressResponse);
        } catch (Exception e) {
            LOGGER.error("Exception returned from WSRB searchAddress service: " + e.getMessage(), e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Exception: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }
    }
}
