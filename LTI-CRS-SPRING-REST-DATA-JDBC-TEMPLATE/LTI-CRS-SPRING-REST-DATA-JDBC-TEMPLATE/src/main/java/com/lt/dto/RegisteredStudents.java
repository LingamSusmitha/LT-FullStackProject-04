/**
 * 
 */
package com.lt.dto;

/**
 * @author ADMIN
 *
 */
public class RegisteredStudents {
	
	int courseCode;
	String CourseName;
	int studentId;
	String studentName;
	String Grade;
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
	 * @return the courseName
	 */
	public String getCourseName() {
		return CourseName;
	}
	/**
	 * @param courseName the courseName to set
	 */
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	/**
	 * @return the studentId
	 */
	public int getStudentId() {
		return studentId;
	}
	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return studentName;
	}
	/**
	 * @param studentName the studentName to set
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	/**
	 * @return the grade
	 */
	public String getGrade() {
		return Grade;
	}
	/**
	 * @param grade the grade to set
	 */
	public void setGrade(String grade) {
		Grade = grade;
	}
	@Override
	public String toString() {
		return "RegisteredStudents [courseCode=" + courseCode + ", CourseName=" + CourseName + ", studentId="
				+ studentId + ", studentName=" + studentName + ", Grade=" + Grade + "]";
	}


}
