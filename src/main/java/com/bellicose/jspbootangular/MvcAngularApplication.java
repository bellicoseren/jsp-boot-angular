package com.bellicose.jspbootangular;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class MvcAngularApplication extends SpringBootServletInitializer{

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
		return application.sources(MvcAngularApplication.class);
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(MvcAngularApplication.class, args);
	}
}
