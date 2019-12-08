package com.creation.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.creation.model.Student;

public class StudentDaoImpl implements StudentDao{
		private EntityManager entityManager=null;
		
		public StudentDaoImpl(){
			entityManager=JPAUtil.getEntityManager();
		}
	@Override
	public List<Student> getStudents() {
		List<Student> studentlList=entityManager.createQuery("from Student",Student.class).getResultList();
		return studentlList;
	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return entityManager.find(Student.class, 100);
	}

	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		entityManager.persist(student);
		
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		entityManager.merge(student);
	}

	@Override
	public void removeStudent(Student student) {
		// TODO Auto-generated method stub
		entityManager.remove(student);
	}

	@Override
	public void commitTransaction() {
		// TODO Auto-generated method stub
		 entityManager.getTransaction().commit();
	
	}

	@Override
	public void beginTransaction() {
		// TODO Auto-generated method stub
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
	}

}
