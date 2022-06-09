package com.lt.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lt.entity.Course;
import com.lt.entity.CourseRegistration;
import com.lt.service.CourseServiceInterface;
import com.lt.service.StudentServiceInterface;

@RestController
@CrossOrigin
public class StudentController {

	@Autowired
	private StudentServiceInterface studentservice;
	
	@RequestMapping(value = "/registercourse", method = RequestMethod.POST)
	public void addUser(@RequestBody CourseRegistration coursereg) {
		studentservice.addCourse(coursereg);
	}

	@RequestMapping("/registeredcourses")
	public List<CourseRegistration> getregisteredcourses() {
		return studentservice.getregisterdCourses();
		//return userService.getAllUsers();
	}
	
	@RequestMapping(value = "/deletecourse/{id}", method = RequestMethod.DELETE)
	public void deletingcourse(@PathVariable("id") int courseid) {
		//return userService.getAllUsers();
		studentservice.removeCourse(courseid);
	}
	
	@RequestMapping(value = "/gradecard/{id}", method = RequestMethod.GET)
	public List viewgradecard(@PathVariable("id") int studentid) {
		//return userService.getAllUsers();
		return studentservice.getgradeList(studentid);
	}
	 
}
