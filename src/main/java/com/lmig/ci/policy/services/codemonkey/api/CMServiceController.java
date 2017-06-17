/**
 * 
 */
package com.lmig.ci.policy.services.codemonkey.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lmig.ci.policy.services.codemonkey.dnb.DNBServiceManager;


/**
 * @author n0172213
 *
 */
@RestController
public class CMServiceController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CMServiceController.class);
    private static final String APPLICATION_JSON = "application/json";

    @Autowired
    private DNBServiceManager dnbServiceManager;
    
    @RequestMapping(value = "/v1/search/{req}", produces = { APPLICATION_JSON }, method = RequestMethod.GET)
    public ResponseEntity<String> search(@PathVariable String req) {

        LOGGER.info("Entering searchAddress method.");
        try {
            //String response = "{request: " + req + "}";
            String response = dnbServiceManager.search(req);
            return ResponseEntity.status(HttpStatus.OK).body(response);
        } catch (Exception e) {
            LOGGER.error("Exception returned from WSRB searchAddress service: " + e.getMessage(), e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Exception: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }
    }
    
    @RequestMapping(value = "/v1/details/{req}", produces = { APPLICATION_JSON }, method = RequestMethod.GET)
    public ResponseEntity<String> details(@PathVariable String req) {

        LOGGER.info("Entering searchAddress method.");
        try {
            //String response = "{request: " + req + "}";
            String response = dnbServiceManager.details(req);
            return ResponseEntity.status(HttpStatus.OK).body(response);
        } catch (Exception e) {
            LOGGER.error("Exception returned from WSRB searchAddress service: " + e.getMessage(), e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Exception: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }
    }
}
