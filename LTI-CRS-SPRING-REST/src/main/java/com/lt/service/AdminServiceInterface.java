package com.lt.service;

import java.util.List;

import com.lt.bean.Course;
import com.lt.bean.Professor;
import com.lt.bean.Student;

public interface AdminServiceInterface {

	public List<Professor> addProfessors(List<Professor> pf);
	public List<Course> addCourses(List<Course> course) ;
	public List<Student> addStudents(List<Student> student);
	public List<Student> ViewStudents();
	public List<Professor> ViewProfessors();
	public Long delete(Long id);
	public Student generateGradeCard(int id);
	
}
