package com.lt.crs.bean;


public class Course {

	private String courseCode;
	private String name;
	private String instructor;
	
	private boolean isOffered;
	public String getCourseCode() {
	return courseCode;
	}
	public void setCourseCode(String courseCode) {
	this.courseCode = courseCode;
	}
	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	public String getInstructor() {
	return instructor;
	}
	public void setInstructor(String instructor) {
	this.instructor = instructor;
	}
	public boolean isOffered() {
	return isOffered;
	}
	public void setOffered(boolean isOffered) {
	this.isOffered = isOffered;
	}


	
}
