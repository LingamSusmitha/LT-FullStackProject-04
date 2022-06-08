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
import com.lt.dto.RegisteredStudents;
import com.lt.mapper.CourseMapper;
import com.lt.mapper.RegisteredstudentsMapper;

/**
 * @author ADMIN
 *
 */
@Repository
public class ProfessorDAOImpl implements ProfessorDAO{
	
	Logger logger = LoggerFactory.getLogger(AdminDAOImpl.class);
	
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
	public Course getCourse(Integer id) {
		// TODO Auto-generated method stub
		
		
	      Course course =  jdbcTemplateObject.queryForObject(JdbcTemplateSQLConstants.SQL_Coursedata,
	    		            new Object[]{id},new CourseMapper()); 
	      logger.debug("value", jdbcTemplateObject.queryForObject(JdbcTemplateSQLConstants.SQL_Coursedata, 
	                        new Object[]{id}, new CourseMapper()));;
	      logger.debug("value of emp-->" +course.toString());
	      return course;
	}
	
	@Override
	@Transactional
	public List<RegisteredStudents> listregisteredstudents() {
		// TODO Auto-generated method stub
		 String SQL = "select * from RegisteredCourse";
	      List <RegisteredStudents> regstudents = jdbcTemplateObject.query(JdbcTemplateSQLConstants.SQL_RegisteredStudents, 
	                                new RegisteredstudentsMapper());
	    	      logger.debug("in debug");
	    	      
	      return regstudents;
	}
	
	@Override
	public String addgrades(Integer studentid, Integer coursecode, String grade) {
		// TODO Auto-generated method stub
		 String SQL = "update RegisteredCourse set grade = ? where studentId = ? and courseCode = ? ";
	     
		 jdbcTemplateObject.update(SQL,grade, studentid, coursecode);
	      
	      String result = "Added the grade and updated record with studnet ID = " + studentid+" Course code = "+coursecode ;
	      
	      System.out.println("Added the grade and updated record with studnet ID = " + studentid+" Course code = "+coursecode );
	      
	      return result;
	}
	
}
