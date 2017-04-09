package com.aa.mss;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Spring boot application class. This class helps to run application from
 * command line.
 * 
 * @author 847612
 * 
 * @see SpringBootApplication
 * @see SpringBootServletInitializer
 */
@SpringBootApplication
public class Application extends SpringBootServletInitializer {

	private static Log logger = LogFactory.getLog(Application.class);

	/**
	 * <code>main</code> method which will bootstrap Spring Boot application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		logger.debug("Initializing Application");
		SpringApplication.run(Application.class, args);
		logger.debug("Stopping Container");
	}

	// FIXME: Add javadoc
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}
}
