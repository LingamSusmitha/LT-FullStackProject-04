package com.lt.crs.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.lt.crs.service.StudentService;
import com.lt.crs.service.StudentServiceInterface;

/**
 * Student Config class is used to get the bean of student
 * 
 * Annotations used: 
 * @Configuration
 * @Bean
 *
 */

@Configuration
public class StudentConfig {

	
	@Bean(name="StudentBean")
    public StudentServiceInterface student() {
        return new StudentService();
    }
}
