package com.lt.crs.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


/**
 * App Config class
 * 
 * Annotations used: 
 * @Configuration
 * @Import
 *
 */

@Configuration
@Import({StudentConfig.class, AdminConfig.class, ProfessorConfig.class})
public class AppConfig {

}