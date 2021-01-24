package com.example.webday11.dto;

import java.util.Set;

public class SubjectDTO {

	private int id;
	private String name;
	private Set<FacultyDTO> faculties;

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

	public Set<FacultyDTO> getFaculties() {
		return faculties;
	}

	public void setFaculties(Set<FacultyDTO> faculties) {
		this.faculties = faculties;
	}

}
