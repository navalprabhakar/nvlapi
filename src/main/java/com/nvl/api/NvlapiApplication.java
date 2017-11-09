/**
 * @project NVL.API
 * @author navalprabhakar
 */
package com.nvl.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * The Class NvlapiApplication.
 */
@SpringBootApplication()
public class NvlapiApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(NvlapiApplication.class);
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		//SpringApplication.run(NvlapiApplication.class, args);
		ApplicationContext ctx = SpringApplication.run(NvlapiApplication.class, args);
		DispatcherServlet dispatcherServlet = (DispatcherServlet) ctx.getBean("dispatcherServlet");
		dispatcherServlet.setThrowExceptionIfNoHandlerFound(true);
		dispatcherServlet.setDetectAllHandlerExceptionResolvers(true);
	}

}