package com.lt.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lt.entity.Course;
import com.lt.service.CourseServiceInterface;

@RestController
@CrossOrigin
public class CourseController {

	@Autowired
	private CourseServiceInterface courseservice;
	
	@RequestMapping("/viewcatalogue")
	public List<Course> getAllUser() {
		return courseservice.getAllCourses();
		//return userService.getAllUsers();
	}
}
