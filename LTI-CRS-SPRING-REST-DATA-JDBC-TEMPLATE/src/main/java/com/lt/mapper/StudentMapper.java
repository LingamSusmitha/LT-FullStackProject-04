/**
 * 
 */
package com.lt.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.lt.dto.Student;

/**
 * @author ADMIN
 *
 */
public class StudentMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		Student student = new Student();
		student.setStudentId(rs.getString("studentId"));
		student.setName(rs.getString("name"));
		student.setBranch(rs.getString("branch"));
		student.setAge(rs.getInt("age"));
		student.setGender(rs.getString("gender"));
		student.setAddress(rs.getString("address"));
		
	    return student;
	}

}
