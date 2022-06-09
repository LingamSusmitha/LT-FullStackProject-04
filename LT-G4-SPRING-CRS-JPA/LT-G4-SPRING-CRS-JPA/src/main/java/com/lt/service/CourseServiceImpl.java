/**
 * 
 */
package com.lt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lt.entity.Course;
import com.lt.entity.CourseRegistration;
import com.lt.repository.CourseRepository;
import com.lt.repository.StudentRepository;

/**
 * @author ADMIN
 *
 */
@Service
public class CourseServiceImpl implements CourseServiceInterface{

	@Autowired(required=true)
	private CourseRepository courserepository;

	public List<Course> getAllCourses() {
		List<Course> coursedetails = new ArrayList<>();	
		courserepository.findAll().forEach(coursedetails::add);
	  return coursedetails;
	}
}
