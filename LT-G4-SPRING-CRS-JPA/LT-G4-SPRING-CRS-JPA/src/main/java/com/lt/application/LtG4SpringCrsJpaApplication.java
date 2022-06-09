package com.lt.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
@EnableAutoConfiguration
@Configuration
@EnableJpaRepositories("com.lt.repository")  // this is seperate jpa container , after enable it should be assosiated with spring container
@EntityScan("com.lt.entity")
@ComponentScan({"com.lt.*"})
public class LtG4SpringCrsJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LtG4SpringCrsJpaApplication.class, args);
	}

}
