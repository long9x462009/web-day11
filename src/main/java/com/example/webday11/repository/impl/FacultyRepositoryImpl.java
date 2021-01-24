package com.example.webday11.repository.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.webday11.entity.Faculty;
import com.example.webday11.repository.FacultyRepository;

@Repository
public class FacultyRepositoryImpl implements FacultyRepository {

	private SessionFactory sessionFactory;

	@Autowired
	public FacultyRepositoryImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Faculty findById(int id) {
		Session session = sessionFactory.getCurrentSession();
		Faculty faculty = session.find(Faculty.class, id);
		return faculty;
	}

}
