/**
 * 
 */
package com.lt.rest;

import java.util.List;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lt.dao.AdminDAO;
import com.lt.dao.ProfessorDAO;
import com.lt.dto.Course;
import com.lt.dto.RegisteredStudents;


/**
 * @author ADMIN
 *
 */
@RestController
@CrossOrigin
public class ProfessorController {

	@Autowired
	private ProfessorDAO professordao;
	//private AdminDAO admindao;
	
	/**
	 * Displaying the Courses
	 */
	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.GET, value = "/courses")
	@ResponseBody
	public List getCourses() {

		return professordao.listCourses();
	}
	/**
	 * @param id to send professor id as input
	 * Displaying the Courses to be tought by the Professor 
	 */
	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.GET, value = "/courses/{id}")
	@ResponseBody
	public Course getCourseToTeach(@PathVariable("id") int instructorId) {

		return professordao.getCourse(instructorId);
	}
	
	/**
	 * Displaying the Registered Students for the courses
	 */
	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.GET, value = "/registeredstudents")
	@ResponseBody
	public List<RegisteredStudents> getregisteredstudents() {

		return professordao.listregisteredstudents();
	}
	/**
	 * @param studentid  sending student Id as input
	 * @param courseid  sending Course Code as input
	 * Adding Grades for the Registered students for the respective courses
	 */
	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.PUT, value = "/addgrades/{studentid}/{courseid}")
	@ResponseBody
	public RegisteredStudents addGrades(@PathVariable("studentid") Integer studentid, @PathVariable("courseid") Integer courseid, @RequestBody RegisteredStudents registeredStudents) 
	{
		 String resultmsg = professordao.addgrades(studentid, courseid,registeredStudents.getGrade().toString());
		
		if (null == registeredStudents) {
			 resultmsg = "No student found for ID " + studentid;
			 return registeredStudents;
		}

		return registeredStudents;
	}
}
