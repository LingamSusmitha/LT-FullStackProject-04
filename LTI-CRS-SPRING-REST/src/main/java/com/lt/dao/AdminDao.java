package com.lt.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.lt.bean.Course;

import com.lt.bean.Professor;
import com.lt.bean.Student;

@Repository
public class AdminDao {
	 static List<Professor> prof = new ArrayList<Professor>();
	 {
		 Professor ps = new Professor();
		 
		 ps.setId(201);
		 ps.setName("Raghu");
		 ps.setCourse("Java");		 
	 }
	
	static List<Course> courses = new ArrayList<Course>();
		{
			Course c = new Course();
			c.setId(10);
			c.setName("Java");
			
			courses.add(c);
		}
	
	
	 static List<Student> students = new ArrayList<Student>();
	 {
		 Student st = new Student();
		 st.setId(101);
		 st.setName("sharath");
		 
	 }
	
	public List<Professor> addProfessors(List<Professor> pf) {	
	for (Professor p : pf) {

		prof.add(p);
	}
	return prof;
}
	public List<Course> addCourses(List<Course> course) {	
		for (Course c : course) {

			courses.add(c);
		}
		return courses;
	}
	
	public List<Student> addStudents(List<Student> student) {	
		for (Student s : student) {

			students.add(s);
		}
		return students;
	}
	
	public List<Student> ViewStudents()
	{
		return students;
	}
	
	public List<Professor> ViewProfessors()
	{
		return prof;
	}

public Long delete(Long id) {

	for (Course c : courses) {
		if (c.getId()==id) {
			courses.remove(c);
			return id;
		}
	}

	return null;
}

public Student generateGradeCard(int id)
{
	for(Student s : students)
	{
		if(s.getId()==id)
		{
			return s;
		}
	}
	return null;
}



}
