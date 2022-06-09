package com.lt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lt.entity.Course;
import com.lt.repository.CourseRepository;

@Service
public class CourseServiceImpl implements CourseServiceInterface {
	
	@Autowired(required=true)
	private CourseRepository courseRepository;    
	
	
	public List<Course> getAllCourses()  
	{    
	List<Course>courseRecords = new ArrayList<>();    
    courseRepository.findAll().forEach(courseRecords::add);    
	return courseRecords;    
	}    
	
	

}
