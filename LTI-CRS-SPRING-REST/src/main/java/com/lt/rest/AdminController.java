package com.lt.rest;

import java.awt.PageAttributes.MediaType;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lt.bean.*;
import com.lt.dao.*;
import com.lt.service.AdminService;

@RestController
public class AdminController {
	
	
	
	  @Autowired private AdminDao admin;
	 

	//@Autowired private AdminService admin;
	
	@PostMapping("/addProfessor")
public ResponseEntity<List<Professor>> addProfessor(@RequestBody List<Professor> professor) {
		
		List<Professor> pl = admin.addProfessors(professor);
		return new ResponseEntity<List<Professor>>(pl, HttpStatus.OK);

	}
	
	@PostMapping("/addCourse")
	public ResponseEntity<List<Course>> addCourse(@RequestBody List<Course> course) {
			
			List<Course> cl = admin.addCourses(course);
			return new ResponseEntity<List<Course>>(cl, HttpStatus.OK);

		}
	
	@PostMapping("/addStudent")
	public ResponseEntity<List<Student>> addStudent(@RequestBody List<Student> student) {
			
			List<Student> s = admin.addStudents(student);
			return new ResponseEntity<List<Student>>(s, HttpStatus.OK);

		}
	
	@DeleteMapping("/deleteCourse/{id}")
	public ResponseEntity deleteEmployee(@PathVariable Long id) {

		if (null == admin.delete(id)) {
			return new ResponseEntity("No Employee found for ID " + id, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity(id, HttpStatus.OK);

	}
	
	@GetMapping("/ViewStudents")
	public List<Student> getStudents() {

		return admin.ViewStudents();
	}
    
	@GetMapping("/ViewProfessors")
	public List<Professor> getProfessors() {

		return admin.ViewProfessors();
	}
	@GetMapping("/GenerateReportCard/{id}")
	public Student generateReportCard(@PathVariable ("id") int id) {

		return admin.generateGradeCard(id);
	}
}
