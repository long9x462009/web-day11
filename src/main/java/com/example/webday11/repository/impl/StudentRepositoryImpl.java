package com.example.webday11.repository.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.webday11.entity.Student;
import com.example.webday11.repository.StudentRepository;

@Repository
public class StudentRepositoryImpl implements StudentRepository {

	private SessionFactory sessionFactory;

	@Autowired
	public StudentRepositoryImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Student findById(int id) {
		Session session = sessionFactory.getCurrentSession();
		return session.find(Student.class, id);
	}

}
