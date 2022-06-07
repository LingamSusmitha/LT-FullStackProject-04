package com.lt.rest;

import java.util.List;
import java.util.Map;

import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lt.bean.Course;
import com.lt.bean.Student;
import com.lt.dao.AdminDao;
import com.lt.dao.StudentDao;

@RestController
public class StudentController {

	private static final Logger logger = LoggerFactory.getLogger(StudentController.class);
			
	@Autowired
	private StudentDao studentdao;
	
	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.POST, value = "/RegisterStudent")
	@ResponseBody
	public ResponseEntity StudentRegistration1(@RequestBody List<Student> student) {

		List<Student> s = studentdao.RegisterStudent(student);
		
		logger.info("Registering the Students");
		logger.debug("Registration is debugging"+s);

		return new ResponseEntity(s, HttpStatus.OK);
		
	}
	
	
	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.GET, value = "/ViewCatalogue")
	@ResponseBody
	public ResponseEntity getCourses() {

		List<Course> courseList = studentdao.ViewCatalogue();
		
		logger.info("Displaying the Catalogue");
		logger.debug("Catalaogue is debugging:"+courseList);
		return new ResponseEntity<>(courseList,HttpStatus.OK);
	}
	

	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.GET, value = "/ViewGradeCard/{id}")
	@ResponseBody
	public ResponseEntity getGradeCard(@PathVariable int id) {
		
		Map<String,String> grades = studentdao.gradeCard(id);
		
		logger.info("Displaying the Grades");
		logger.debug("Grades is debugging");
		
		return new ResponseEntity(grades,HttpStatus.OK);
	}
	 
	 
	 @PutMapping("/registercourse/{id}")
	 public void registerCourse(@PathVariable ("id") int id, @RequestBody Student s)
	 {
		 studentdao.registerCourse(id, s);
	 }
		
	 
	
}
