package com.lt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CourseRegistration")
public class CourseRegistration {

	@Id
	@Column(name = "coursecode")
	private int coursecode;
	@Column(name = "name")
	private String name;
	@Column(name = "studentid")
	private int studentid;
	@Column(name = "studentname")
	private String studentname;
	@Column(name = "grade")
	private String grade;
	/**
	 * @return the coursecode
	 */
	public int getCoursecode() {
		return coursecode;
	}
	/**
	 * @param coursecode the coursecode to set
	 */
	public void setCoursecode(int coursecode) {
		this.coursecode = coursecode;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the studentid
	 */
	public int getStudentid() {
		return studentid;
	}
	/**
	 * @param studentid the studentid to set
	 */
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	/**
	 * @return the studentname
	 */
	public String getStudentname() {
		return studentname;
	}
	/**
	 * @param studentname the studentname to set
	 */
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	/**
	 * @return the grade
	 */
	public String getGrade() {
		return grade;
	}
	/**
	 * @param grade the grade to set
	 */
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
	
	
}

