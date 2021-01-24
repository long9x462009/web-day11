package com.example.webday11.transform;

import com.example.webday11.dto.SubjectDTO;
import com.example.webday11.entity.Subject;

public class SubjectTransform {

	public SubjectDTO apply (Subject core) {
		SubjectDTO dto = new SubjectDTO();
		
		dto.setId(core.getId());
		dto.setName(core.getName());
		
		return dto;
	}
}
