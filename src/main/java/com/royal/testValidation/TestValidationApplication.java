package com.royal.testValidation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

import javax.annotation.PostConstruct;

//@ComponentScan(basePackages = {"com.royal.testValidation","com.royal.somejar"})
@SpringBootApplication
@ComponentScan(basePackages = {"com.royal.testValidation"},excludeFilters = @ComponentScan.Filter(type= FilterType.ASSIGNABLE_TYPE))
public class TestValidationApplication {

	public static void main(String[] args) {
		System.out.println("-----done-----");
		SpringApplication.run(TestValidationApplication.class, args);
	}

	@PostConstruct
	public void initialize(){
		System.out.println("TestValidationApplication.initialize");
		/*System.setProperty("http.proxyPort" , "8080");
		System.setProperty("https.proxyPort" , "8080");
		System.setProperty("http.proxyPort" , "proxy.myComp.com");
		System.setProperty("https.proxyPort" , "proxy.myComp.com");*/
	}


}



/*
		While working with Spring Boot application, it is difficult to get the classpath resources using resource.getFile()
		when it is deployed as JAR as I faced the same issue.

		This scan be resolved using Stream which will find out all the resources which are placed anywhere in classpath.
		Below is the code snippet for the same -
		ClassPathResource classPathResource = new ClassPathResource("fileName");
		InputStream inputStream = classPathResource.getInputStream();
		content = IOUtils.toString(inputStream);*/
