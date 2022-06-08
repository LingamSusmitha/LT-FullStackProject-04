/**
 * 
 */
package com.lt.dao;

import java.util.List;

import com.lt.dto.Course;
import com.lt.dto.RegisteredStudents;

/**
 * @author ADMIN
 *
 */
public interface ProfessorDAO {

	List<Course> listCourses();

	Course getCourse(Integer id);

	List<RegisteredStudents> listregisteredstudents();

	String addgrades(Integer studentid, Integer coursecode, String grade);


}
