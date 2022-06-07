package com.lt.crs.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.lt.crs.service.AdminService;
import com.lt.crs.service.AdminServiceInterface;
import com.lt.crs.service.ProfessorService;
import com.lt.crs.service.ProfessorServiceInterface;


/**
 * Professor Config class is used to get the bean of professor
 * 
 * Annotations used: 
 * @Configuration
 * @Bean
 *
 */

@Configuration
public class ProfessorConfig {

	
	@Bean(name="ProfessorBean")
    public ProfessorServiceInterface customer() {
        return new ProfessorService();
    }
}
