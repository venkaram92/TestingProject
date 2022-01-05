package com.mindtree.entity;

public class Student {
	private String studentName;
	private int age;
	private String subject;
	private College college;
	
	public Student()
	{}
	
	public Student(String studentName, int age, String subject, College college) {
		this.studentName = studentName;
		this.age = age;
		this.subject = subject;
		this.college = college;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	public String getStudentName() {
		return studentName;
	}

	public int getAge() {
		return age;
	}

	public String getSubject() {
		return subject;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", age=" + age + ", subject=" + subject + ", college=" + college
				+ "]";
	}

}
