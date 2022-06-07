package com.lt.crs.dao;

import java.util.ArrayList;

public interface ProfessorServiceDaoInterface {
	
	public String addGrades(String course, String student, String Grade);
	
	public ArrayList getCourseList(String LoginId);
	
	public ArrayList viewRegisteredStudentsforCourse(String CourseId);

}
