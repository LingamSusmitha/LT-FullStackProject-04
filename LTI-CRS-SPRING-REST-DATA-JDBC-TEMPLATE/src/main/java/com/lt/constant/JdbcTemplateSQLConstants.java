/**
 * 
 */
package com.lt.constant;

/**
 * @author ADMIN
 *
 */
public class JdbcTemplateSQLConstants {
	
	public static final String SQL_CourseDetails = "select * from Course";
	
	public static final String SQL_RegisteredStudents = "select * from RegisteredCourse";
	
	public static final String SQL_Coursedata = "select * from course where instructorCode = ?";

}
