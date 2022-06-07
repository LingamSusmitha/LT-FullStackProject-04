package com.lt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan({"com.lt.*"})
@EnableWebMvc 
public class LtiCrsSpringRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(LtiCrsSpringRestApplication.class, args);
	}

}
