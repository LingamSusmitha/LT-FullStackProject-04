/**
 * 
 */
package com.lt.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lt.configuration.JDBCConfiguration;
import com.lt.constant.JdbcTemplateSQLConstants;
import com.lt.dto.Course;
import com.lt.mapper.CourseMapper;

/**
 * @author ADMIN
 *
 */
@Repository
public class StudentDAOImpl implements StudentDAO {
	
	// create the reference of looger here
	
	 Logger logger = LoggerFactory.getLogger(StudentDAOImpl.class);
	
	// DI injection of JDBCTemplate
	
	@Autowired
	private JdbcTemplate jdbcTemplateObject;
	private JDBCConfiguration jdbcConfiguration;
	
	@Override
	@Transactional
	public List<Course> listCourses() {
		// TODO Auto-generated method stub
		 //String SQL = "select * from Course";
	      List <Course> courses = jdbcTemplateObject.query(JdbcTemplateSQLConstants.SQL_CourseDetails, 
	                                new CourseMapper());
	    	      logger.debug("in debug");
	      return courses;
	}
	
	@Override
	public String registerCourse(Integer courseId, String courseName, Integer studentId, String studentName) {
		// TODO Auto-generated method stub
		String grade = "NA";
		
		String SQL = "insert into registeredcourse (courseCode, courseName, studentId, studentName, grade) values (?, ?, ?, ?, ?)";
	      
	 jdbcTemplateObject.update(SQL, courseId, courseName, studentId, studentName,grade);
	 
	 String result = "Record Added";
	 System.out.println("Created Record ");
	
	 return result;
		
	}

}
