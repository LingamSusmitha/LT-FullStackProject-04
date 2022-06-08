/**
 * 
 */
package com.lt.dao;

import java.util.List;

import com.lt.dto.Course;
import com.lt.dto.Professor;
import com.lt.dto.RegisteredStudents;

/**
 * @author ADMIN
 *
 */
public interface AdminDAO {

	/**
	* Create new Course.
	*
	* @param course
	* @return Course object
	*/
	Course addcourse(Course course);

	/**
	* Returns list of Courses.
	*
	* @return list of Courses
	*/
	List<Course> listCourses();

	/**
	* Delete the Course object.
	*
	* @param coursCcode
	* @return courseCode of deleted Course object
	*/
	Integer removeCourse(Integer courseCode);

}
