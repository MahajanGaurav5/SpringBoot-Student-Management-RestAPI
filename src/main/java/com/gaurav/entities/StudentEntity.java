package com.gaurav.entities;


import javax.persistence.Id;

public class StudentEntity 
{
	@Id
	private int sid;
	private String StudentName;
	private String course;
	private int marks;
	public StudentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the studentId
	 */
	public int getSid() {
		return sid;
	}
	/**
	 * @param studentId the studentId to set
	 */
	public void setSid(int sid) {
		this.sid = sid;
	}
	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return StudentName;
	}
	/**
	 * @param studentName the studentName to set
	 */
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	/**
	 * @return the course
	 */
	public String getCourse() {
		return course;
	}
	/**
	 * @param course the course to set
	 */
	public void setCourse(String course) {
		this.course = course;
	}
	/**
	 * @return the marks
	 */
	public int getMarks() {
		return marks;
	}
	/**
	 * @param marks the marks to set
	 */
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public StudentEntity(int sid, String studentName, String course, int marks) {
		super();
		this.sid = sid;
		StudentName = studentName;
		this.course = course;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "StudentEntity [sid=" + sid + ", StudentName=" + StudentName + ", course=" + course
				+ ", marks=" + marks + "]";
	}
	
	

}
