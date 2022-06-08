/**
 * 
 */
package com.lt.dao;

import java.util.List;

import com.lt.dto.Course;

/**
 * @author ADMIN
 *
 */
public interface StudentDAO {

	String registerCourse(Integer courseId, String courseName, Integer studentId, String studentName);

	List<Course> listCourses();

}
