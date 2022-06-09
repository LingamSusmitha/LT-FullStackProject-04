package com.lt.restcontroller;

import java.util.ArrayList;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lt.service.*;

import com.lt.entity.*;
import com.lt.repository.CourseRepository;


@RestController
@CrossOrigin
public class StudentController {
	
	
	@Autowired(required=true)
	private StudentServiceImpl studentservice;    
	
	

	 
	  
	  
	  @RequestMapping("/ViewCatalogue")
	  public List<Course> getAllCourses() {
	  return studentservice.getAllCourses(); }
	
	
	  @RequestMapping(value="/deleteCourse/{studentid}/{courseid}", method=RequestMethod.DELETE) 
	  public void deleteCourse(@PathVariable("studentid") int studentid, @PathVariable("courseid")int courseid)
	 
	  {
		  studentservice.deleteCourse(studentid, courseid);
	  }
	  
	  
}
