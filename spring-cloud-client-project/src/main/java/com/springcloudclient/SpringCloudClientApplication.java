package com.springcloudclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringCloudClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudClientApplication.class, args);
	}
	
	// Name which is in config server properties file is given to retrieve that property's value
	@Value("${dummy.property}")
	private String propertyValue;
	
	@GetMapping("/")
	public String getProperty()
	{
		return "Hello value of property is: "+propertyValue ;
	}

}
