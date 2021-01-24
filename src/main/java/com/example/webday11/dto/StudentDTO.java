package com.example.webday11.dto;

import java.util.Set;

public class StudentDTO {

	private int id;
	private String name;
	private Set<StudentSubjectDTO> registedSubject;

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

	public Set<StudentSubjectDTO> getRegistedSubject() {
		return registedSubject;
	}

	public void setRegistedSubject(Set<StudentSubjectDTO> registedSubject) {
		this.registedSubject = registedSubject;
	}

}
