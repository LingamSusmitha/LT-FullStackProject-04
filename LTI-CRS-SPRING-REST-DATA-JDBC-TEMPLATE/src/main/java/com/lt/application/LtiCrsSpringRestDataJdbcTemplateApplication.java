package com.lt.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.lt.configuration.JDBCConfiguration;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan({"com.lt.*"})
@Import({JDBCConfiguration.class})
@EnableWebMvc
public class LtiCrsSpringRestDataJdbcTemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(LtiCrsSpringRestDataJdbcTemplateApplication.class, args);
	}

}
