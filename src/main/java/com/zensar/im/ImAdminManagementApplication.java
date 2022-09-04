package com.zensar.im;

import java.util.ArrayList;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.RequestHandler;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;



@SpringBootApplication
@EnableSwagger2
public class ImAdminManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImAdminManagementApplication.class, args);
		
		
	}
	@Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();
	}
	   
	@Bean
	public Docket getDocketObj() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com."))
				.paths(PathSelectors.any())
				.build()
				.apiInfo(getAppdetails());
	}
	@Bean ApiInfo getAppdetails() {
		Contact contact = new Contact("Arikaran","https://arikaran.com","arikaran1302@gmail.com");
		ApiInfo appInfo = new ApiInfo(
				
				"Interview-management",
				"admin-management",
				"1.0.0",
				"https://interview.com",
				contact,
				"GPL",
				"https://gplliscense.com",
				new ArrayList<VendorExtension>()
				
				);
		
		return appInfo;
	}
	
}
