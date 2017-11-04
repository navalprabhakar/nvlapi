/**
 * @project NVL.API
 * @author navalprabhakar
 */
package com.nvl.api;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * The Class SwaggerConfigurer.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfigurer extends WebMvcConfigurerAdapter {

	/**
	 * Product api.
	 *
	 * @return the docket
	 */
	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("com.nvl.api"))
				.paths(PathSelectors.any()).build().apiInfo(metaData());
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry aRegistry) {
		aRegistry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources");
		aRegistry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
	}

	private ApiInfo metaData() {
		ApiInfo apiInfo = new ApiInfo("NVL API Documentation",
				"A rest api for collating personal information of navalprabhakar", "0.1", "urn:tos",
				new Contact("navalprabhakar", "navalprabhakar.com", "navalprabhakar@gmail.com"),
				"GNU GENERAL PUBLIC LICENSE", "http://www.gnu.org/licenses/", new ArrayList<>());
		return apiInfo;
	}
}