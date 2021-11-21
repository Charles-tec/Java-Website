package com.example.demoSpringWebsite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
@SpringBootApplication
public class DemoSpringWebsiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringWebsiteApplication.class, args);
	}

}
