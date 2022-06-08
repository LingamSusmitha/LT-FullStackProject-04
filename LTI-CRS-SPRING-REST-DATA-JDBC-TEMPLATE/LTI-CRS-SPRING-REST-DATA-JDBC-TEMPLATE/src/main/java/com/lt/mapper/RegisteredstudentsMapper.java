/**
 * 
 */
package com.lt.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.lt.dto.RegisteredStudents;

/**
 * @author ADMIN
 *
 */
public class RegisteredstudentsMapper implements RowMapper<RegisteredStudents>{

	@Override
	public RegisteredStudents mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		RegisteredStudents resgisterstudents = new RegisteredStudents();
		resgisterstudents.setCourseCode(rs.getInt("courseCode"));
		resgisterstudents.setCourseName(rs.getString("courseName"));
		resgisterstudents.setStudentId(rs.getInt("studentId"));
		resgisterstudents.setStudentName(rs.getString("studentName"));
		resgisterstudents.setGrade(rs.getString("grade"));
		
		return resgisterstudents;
	}
}
