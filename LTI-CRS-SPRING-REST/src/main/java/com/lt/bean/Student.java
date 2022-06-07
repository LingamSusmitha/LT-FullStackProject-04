package com.lt.bean;

import java.util.List;
import java.util.Map;

public class Student {

	private int id;
	private String name;
	private List<Course> course;
	
	
	private Map<String,String> grades;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public List<Course> getCourse() {
		return course;
	}
	public void setCourse(List<Course> course) {
		this.course = course;
	}
	public Map<String, String> getGrades() {
		return grades;
	}
	public void setGrades(Map<String, String> grades) {
		this.grades = grades;
	}
	
	
	
	
}
	


