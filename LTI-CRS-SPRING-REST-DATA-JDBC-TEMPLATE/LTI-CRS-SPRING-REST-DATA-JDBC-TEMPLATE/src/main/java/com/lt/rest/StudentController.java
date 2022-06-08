/**
 * 
 */
package com.lt.rest;

import java.util.List;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lt.dao.AdminDAO;
import com.lt.dao.ProfessorDAO;
import com.lt.dao.StudentDAO;
import com.lt.dto.RegisteredStudents;

/**
 * @author ADMIN
 *
 */
@RestController
@CrossOrigin
public class StudentController {
	@Autowired
	private StudentDAO studentdao;
	

	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.GET, value = "/viewcatalogue")
	@ResponseBody
	public List getCourses() {
		
		return studentdao.listCourses();
	}

	
	  @RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.POST, value = "/courseregistration")  
	  @ResponseBody
	  
	  public String registerCourse(@RequestBody RegisteredStudents registeredStudents) 
	  {
		  Integer courseId   = registeredStudents.getCourseCode(); 
		  String course      = registeredStudents.getCourseName(); 
		  Integer studentId  = registeredStudents.getStudentId(); 
		  String studentName = registeredStudents.getStudentName();
	  
	      String resultmsg= (String)studentdao.registerCourse(courseId, course, studentId,studentName);
	  
		
		  if (null == registeredStudents) { resultmsg = "No student found for ID " ;
		     return resultmsg; 
		  }
		 
	  
	  return resultmsg; }
	 

}
