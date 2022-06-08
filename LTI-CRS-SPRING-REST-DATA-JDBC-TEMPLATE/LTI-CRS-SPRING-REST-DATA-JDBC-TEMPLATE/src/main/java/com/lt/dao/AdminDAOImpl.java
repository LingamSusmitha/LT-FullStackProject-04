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
import com.lt.dto.Professor;
import com.lt.dto.RegisteredStudents;
import com.lt.mapper.CourseMapper;
import com.lt.mapper.ProfessorMapper;
import com.lt.mapper.RegisteredstudentsMapper;

/**
 * @author ADMIN
 *
 */
@Repository
public class AdminDAOImpl implements AdminDAO {
	
	// create the reference of looger here
	
			 Logger logger = LoggerFactory.getLogger(AdminDAOImpl.class);
			
			// DI injection of JDBCTemplate
			
			@Autowired
			private JdbcTemplate jdbcTemplateObject;
			private JDBCConfiguration jdbcConfiguration;
			
			/**
			* Create new Course.
			*
			* @param course
			* @return Course object
			*/
			@Transactional
			public Course addcourse(Course course) {
			// TODO Auto-generated method stub



			String SQL = "insert into course (courseCode,name,isOffered,instructor) values (?,?,?,?)";



			jdbcTemplateObject.update(SQL, course.getCourseCode(), course.getName(),
					course.getIsOffered(), course.getInstructor());
			System.out.println("Created Record Name = " + course.getName() + " instructor = " + course.getInstructor()
			+ " isOffered = " + course.getIsOffered());

			return course;

			}

			/**
			* Returns list of Courses.
			*
			* @return list of Courses
			*/
			@Transactional
			public List<Course> listCourses() {
			// TODO Auto-generated method stub
			String SQL = "select * from course";
			List<Course> courses = jdbcTemplateObject.query(SQL, new CourseMapper());
			logger.debug("in debug");
			return courses;
			}



			/**
			* Delete the Course object.
			*
			* @param coursCcode
			* @return courseCode of deleted Course object
			*/
			@Transactional
			public Integer removeCourse(Integer courseCode) {
			// TODO Auto-generated method stub
			int updatedstatus = 0;
			String SQL = "delete from course where courseCode = ?";
			updatedstatus = jdbcTemplateObject.update(SQL, courseCode);
			if (updatedstatus == 1) {
			System.out.println("Updated Record with courseCode = " + courseCode);
			return courseCode;
			} else
			return null;



			}

			/**
			* Create new Professor.
			*
			* @param Professor Professor object
			* @return Professor object
			*/
			public Professor addProfessor(Professor professor) {

			String SQL = "insert into professor (id,name,department,designation) values (?,?,?,?)";

			jdbcTemplateObject.update(SQL,  professor.getUserId(),professor.getUsername(),
					professor.getDepartment(), professor.getDesignation());
			System.out.println("Created Record Name = " + professor.getUsername() + " department = " + professor.getDepartment()
			+ "designation= " + professor.getDesignation());



			return professor;
			}
			
			

}
