package com.springcore;

public class Student {
	
	private int studentid;
	private String studentName;
	private String studentAddress;
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public Student(int studentid, String studentName, String studentAddress) {
		super();
		this.studentid = studentid;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "student[studentid"+studentid+",studentName="+ studentName+ ",studentAddress="+studentAddress+"]";
	}  
	
	

}
