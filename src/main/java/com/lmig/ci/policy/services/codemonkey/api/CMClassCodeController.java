package com.lmig.ci.policy.services.codemonkey.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lmig.ci.policy.services.codemonkey.classCode.CMClassCodeService;
import com.lmig.ci.policy.services.codemonkey.vo.Classifications;



/**
 * @author n0116146
 *
 */
@RestController
public class CMClassCodeController {
	private static final Logger LOGGER = LoggerFactory.getLogger(CMClassCodeController.class);
    private static final String APPLICATION_JSON = "application/json";
    
    /**
     * Receives a list of sic and naics codes
     * 
     * @param sic
     * @param naics
     * @return a list of classifications
     */
    @RequestMapping(value = "v1/classification", produces = { APPLICATION_JSON }, consumes = { APPLICATION_JSON }, method = RequestMethod.POST)
    public ResponseEntity<String> getClassifications(@RequestBody String classCodeSearch) {
    	
        LOGGER.info("Entering getClassCodes method.");
        try {
        	CMClassCodeService service = new CMClassCodeService();
        	Classifications classifications = service.getClassifications(classCodeSearch);
        	
            return ResponseEntity.status(HttpStatus.OK).body(getClassificationJson(classifications));
        } catch (Exception e) {
            LOGGER.error("Exception returned from CMClassCodeController getClassifications service: " + e.getMessage(), e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Exception: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }
    }
    
	public String getClassificationJson(Classifications classifications) {
//		StringBuilder sb = new StringBuilder();
//		sb.append("{\"classifications\": {");
//		for (ClassCode classCode : this.classCodes) {
//			sb.append(classCode.getJson());
//		}
//		sb.append("}}");
//		return sb.toString();
		try {
			return new ObjectMapper().writeValueAsString(classifications); 
		}catch (Exception e) {
			throw new RuntimeException("Caught exception: " + e.getClass().getName() + " " + e.getMessage(),e);
		}

	}
}
