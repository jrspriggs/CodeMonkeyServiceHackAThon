package com.lmig.ci.policy.services.codemonkey.defaulter;

import java.util.ArrayList;
import java.util.List;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.ObjectFilter;
import org.kie.api.runtime.rule.FactHandle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lmig.ci.policy.services.codemonkey.vo.Coverage;
import com.lmig.ci.policy.services.codemonkey.vo.defulter.coverages.Criteria;

@Service
public class CMCoverageDefaulterService {
 
	private final KieContainer kieContainer; 
    private static final Logger LOGGER = LoggerFactory.getLogger(CMCoverageDefaulterService.class);

	@Autowired 
	public CMCoverageDefaulterService(KieContainer kieContainer) { 
		LOGGER.info("Initialising a new coverage defaulter session."); 
		this.kieContainer = kieContainer; 
	} 

	public String getDefaultedCoverages(String request) {
		try {
			Criteria criteria = new ObjectMapper().readValue(request, Criteria.class); 
		
			//do stuff
			List<Coverage> coverages = getCoverages(criteria);
			
			return new ObjectMapper().writeValueAsString(coverages); 
		}
		catch (Exception e) {
			throw new RuntimeException("Caught exception: " + e.getClass().getName() + " " + e.getMessage(),e);
		}
	}

    /** 
     * Create a new session, insert a coverage criteria and fire rules to 
     * determine what coverages apply. 
     */ 
    private List<Coverage> getCoverages(Criteria criteria) { 
        KieSession kieSession = kieContainer.newKieSession("CoverageDefaultSession"); 
        kieSession.insert(criteria); 
        kieSession.fireAllRules(); 
        List<Coverage> coverages = findCoverages(kieSession); 
        kieSession.dispose(); 
        return coverages; 
    } 
    
	/** 
	 * Search the {@link KieSession} for Coverage objects. 
	 */ 
	private List<Coverage> findCoverages(KieSession kieSession) { 
		// Find all Coverage objects. 
		ObjectFilter coverageFilter = new ObjectFilter() { 
			@Override 
			public boolean accept(Object object) { 
				if (Coverage.class.equals(object.getClass())) return true; 
				return false; 
			} 
		}; 

		// printFactsMessage(kieSession); 
		List<Coverage> coverages = new ArrayList<Coverage>(); 
		for (FactHandle handle : kieSession.getFactHandles(coverageFilter)) { 
			coverages.add((Coverage) kieSession.getObject(handle)); 
		} 

		return coverages; 
	} 
}
