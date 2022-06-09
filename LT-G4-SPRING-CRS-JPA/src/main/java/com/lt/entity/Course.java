package com.lt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Course")
public class Course {
	
	@Id
	@Column(name = "coursecode")
	private int coursecode;
	@Column(name = "name")
	private String name;
	@Column(name = "isOffered")
	private String isOffered;
	@Column(name = "instructorid")
	private int instructorid;
	@Column(name = "instructorname")
	private String instructorname;
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
	 * @return the isOffered
	 */
	public String getIsOffered() {
		return isOffered;
	}
	/**
	 * @param isOffered the isOffered to set
	 */
	public void setIsOffered(String isOffered) {
		this.isOffered = isOffered;
	}
	/**
	 * @return the instructorid
	 */
	public int getInstructorid() {
		return instructorid;
	}
	/**
	 * @param instructorid the instructorid to set
	 */
	public void setInstructorid(int instructorid) {
		this.instructorid = instructorid;
	}
	/**
	 * @return the instructor
	 */
	/**
	 * @return the instructorname
	 */
	public String getInstructorname() {
		return instructorname;
	}
	/**
	 * @param instructorname the instructorname to set
	 */
	public void setInstructorname(String instructorname) {
		this.instructorname = instructorname;
	}


}
