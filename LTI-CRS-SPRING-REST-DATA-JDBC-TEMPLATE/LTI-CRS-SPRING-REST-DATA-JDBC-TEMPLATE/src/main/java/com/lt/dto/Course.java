/**
 * 
 */
package com.lt.dto;

/**
 * @author ADMIN
 *
 */
public class Course {
	
	int courseCode;
	String name;
	Boolean isOffered;
	String instructor;
	int instructorCode;
	
	@Override
	public String toString() {
		return "Course [courseCode=" + courseCode + ", name=" + name + ", isOffered=" + isOffered + ", instructor="
				+ instructor + ", instructorCode=" + instructorCode + "]";
	}
	/**
	 * @return the instructorCode
	 */
	public int getInstructorCode() {
		return instructorCode;
	}
	/**
	 * @param instructorCode the instructorCode to set
	 */
	public void setInstructorCode(int instructorCode) {
		this.instructorCode = instructorCode;
	}
	/**
	 * @return the courseCode
	 */
	public int getCourseCode() {
		return courseCode;
	}
	/**
	 * @param courseCode the courseCode to set
	 */
	public void setCourseCode(int courseCode) {
		this.courseCode = courseCode;
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
	public Boolean getIsOffered() {
		return isOffered;
	}
	/**
	 * @param isOffered the isOffered to set
	 */
	public void setIsOffered(Boolean isOffered) {
		this.isOffered = isOffered;
	}
	/**
	 * @return the instructor
	 */
	public String getInstructor() {
		return instructor;
	}
	/**
	 * @param instructor the instructor to set
	 */
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	
}
