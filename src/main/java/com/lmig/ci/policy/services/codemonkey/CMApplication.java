/**
 * 
 */
package com.lmig.ci.policy.services.codemonkey;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author n0172213
 *
 */
@SpringBootApplication(scanBasePackages = "com.lmig.ci.policy")
public class CMApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(CMApplication.class);
    
    public static void main(String[] args) {

        LOGGER.info("About to start application...");
        SpringApplication.run(CMApplication.class, args);
    }
    
	@Bean 
	public KieContainer kieContainer() { 
		return KieServices.Factory.get().getKieClasspathContainer(); 
	} 
}
