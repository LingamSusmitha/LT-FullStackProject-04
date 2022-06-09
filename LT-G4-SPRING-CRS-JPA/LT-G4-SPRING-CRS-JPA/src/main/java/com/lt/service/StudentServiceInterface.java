package com.lt.service;

import java.util.List;

import com.lt.entity.Course;
import com.lt.entity.CourseRegistration;

public interface StudentServiceInterface{

	public void addCourse(CourseRegistration coursereg);
	
	public List<CourseRegistration> getregisterdCourses();
	
	public void removeCourse(int courseid);
	
	public List<CourseRegistration> getgradeList(int studentid) ;
}
