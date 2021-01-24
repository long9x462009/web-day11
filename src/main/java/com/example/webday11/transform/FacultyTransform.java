package com.example.webday11.transform;

import java.util.HashSet;
import java.util.Set;

import com.example.webday11.dto.FacultyDTO;
import com.example.webday11.dto.SubjectDTO;
import com.example.webday11.entity.Faculty;
import com.example.webday11.entity.Subject;

public class FacultyTransform {

	public FacultyDTO apply(Faculty core) {
		FacultyDTO dto = new FacultyDTO();
		dto.setId(core.getId());
		dto.setName(core.getName());

		Set<SubjectDTO> subjectDTOs = new HashSet<SubjectDTO>();
		Set<Subject> subjects = core.getSubjects();
		SubjectTransform subjectTransform = new SubjectTransform();
		if (subjects != null && subjects.size() > 0) {
			for (Subject s : subjects) {
				subjectDTOs.add(subjectTransform.apply(s));
			}
		}
		dto.setSubjects(subjectDTOs);

		return dto;
	}
}
