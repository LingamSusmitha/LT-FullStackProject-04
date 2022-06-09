package com.lt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lt.entity.Course;
import com.lt.repository.CourseRegistrationRepository;
import com.lt.repository.CourseRepository;
import com.lt.repository.StudentRepository;

@Service
public class StudentServiceImpl {

	@Autowired(required=true)
	private CourseRepository courseRepository;    
	
	@Autowired 
	private CourseRegistrationRepository coursereg;
	
	
	
	
	public List<Course> getAllCourses()  
	{    
	List<Course>courseRecords = new ArrayList<>();    
    courseRepository.findAll().forEach(courseRecords::add);    
	return courseRecords;    
	}    
	
	public void deleteCourse(int studentid, int courseid)
	{
		coursereg.deleteCourse(studentid,courseid);
	}
	
	
	
	
	
}
