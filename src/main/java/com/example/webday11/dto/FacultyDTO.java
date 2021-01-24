package com.example.webday11.dto;

import java.util.Set;

public class FacultyDTO {
	private int id;
	private String name;
	private Set<SubjectDTO> subjects;

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

	public Set<SubjectDTO> getSubjects() {
		return subjects;
	}

	public void setSubjects(Set<SubjectDTO> subjects) {
		this.subjects = subjects;
	}

}
