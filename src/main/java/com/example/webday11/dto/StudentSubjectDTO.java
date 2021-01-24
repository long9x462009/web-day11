package com.example.webday11.dto;

public class StudentSubjectDTO {

	private int id;
	private StudentDTO student;
	private SubjectDTO subject;
	private double grade;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public StudentDTO getStudent() {
		return student;
	}

	public void setStudent(StudentDTO student) {
		this.student = student;
	}

	public SubjectDTO getSubject() {
		return subject;
	}

	public void setSubject(SubjectDTO subject) {
		this.subject = subject;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

}
