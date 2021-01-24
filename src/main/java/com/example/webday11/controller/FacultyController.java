package com.example.webday11.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.webday11.dto.FacultyDTO;
import com.example.webday11.entity.Faculty;
import com.example.webday11.service.FacultyService;
import com.example.webday11.transform.FacultyTransform;

@RestController
@RequestMapping("/faculties")
public class FacultyController {

	private FacultyService facultyService;

	public FacultyController(FacultyService facultyService) {
		this.facultyService = facultyService;
	}

	@GetMapping("/{id}")
	public FacultyDTO findById(@PathVariable int id) {
		Faculty faculty = facultyService.findById(id);
		FacultyTransform transform = new FacultyTransform();
		return transform.apply(faculty);
	}
}
