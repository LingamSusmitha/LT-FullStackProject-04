/**
 * 
 */
package com.lt.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.lt.dto.Course;
import com.lt.dto.Professor;

/**
 * @author ADMIN
 *
 */
public class CourseMapper implements RowMapper<Course> {
	
	@Override
	public Course mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Course course = new Course();
		course.setCourseCode(rs.getInt("courseCode"));
		course.setName(rs.getString("name"));
		course.setIsOffered(rs.getBoolean("isOffered"));
		course.setInstructor(rs.getString("instructor"));
		return course;
	}

}
