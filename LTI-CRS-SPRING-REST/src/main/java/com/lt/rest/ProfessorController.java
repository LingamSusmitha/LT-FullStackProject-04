package com.lt.rest;

import java.util.List;
import java.util.Map;

import javax.ws.rs.core.MediaType;

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

import com.lt.dao.ProfessorDao;

@RestController
public class ProfessorController {

	@Autowired ProfessorDao prof;
	
	
	@GetMapping("/course/{id}")
	public ResponseEntity<List<String>>  getStudentsByCourse(@PathVariable("id") int id) 
	{

		List<String> s = prof.ViewStudents(id);
		return new ResponseEntity<List<String>>(s, HttpStatus.OK);

	}
	
	
	
	
	@GetMapping("courselist/{id}")
	public ResponseEntity<String>  getCourseList(@PathVariable("id") int id) 
	{

		String s = prof.getCourseList(id);
		return new ResponseEntity<String>(s, HttpStatus.OK);

	}
	
	
	
	 @PutMapping("/giveGrade/{id}")
	 public void registerCourse(@PathVariable ("id") int id, @RequestBody Student s)
	 {
		 prof.addGradesforStudents(id, s);
	 }
	
}
	
	

