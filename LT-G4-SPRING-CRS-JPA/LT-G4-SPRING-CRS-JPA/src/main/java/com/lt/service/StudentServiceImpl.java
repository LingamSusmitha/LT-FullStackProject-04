package com.lt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lt.entity.Course;
import com.lt.entity.CourseRegistration;
import com.lt.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentServiceInterface{

	@Autowired(required=true)
	private StudentRepository studentrepo;

	public void addCourse(CourseRegistration coursereg) {
		studentrepo.save(coursereg);
	}	
	
	public List<CourseRegistration> getregisterdCourses() {
		List<CourseRegistration> coursedetails = new ArrayList<>();	
		studentrepo.findAll().forEach(coursedetails::add);
	  return coursedetails;
	}
	
	public void removeCourse(int courseid) {
		studentrepo.deleteCourse(courseid);
	}
	
	public List getgradeList(int studentid) {
		List gradeList = new ArrayList<>();
		gradeList= studentrepo.getgrades(studentid);
		
		return gradeList;	
	}
	
}
