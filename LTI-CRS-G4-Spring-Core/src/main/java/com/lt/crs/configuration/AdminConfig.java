package com.lt.crs.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.lt.crs.service.AdminService;
import com.lt.crs.service.AdminServiceInterface;

/**
 * Admin Config class is used to get the bean of admin
 * 
 * Annotations used: 
 * @Configuration
 * @Bean
 *
 */
@Configuration
public class AdminConfig {

	
	@Bean(name="AdminBean")
    public AdminServiceInterface admin() {
        return new AdminService();
    }
}
