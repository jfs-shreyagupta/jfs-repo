package com.creation.service;

import java.util.List;

import com.creation.dao.StudentDao;
import com.creation.dao.StudentDaoImpl;
import com.creation.model.Student;

public class StudentServiceImpl implements StudentService{

	StudentDao studentDao=null;
	
	public StudentServiceImpl() {
		studentDao=new StudentDaoImpl();
	}
	
	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return studentDao.getStudents();
	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return studentDao.getStudentById(id);
	}

	@Override
	public void addStudent(Student student) {
		studentDao.beginTransaction();
		studentDao.addStudent(student);
		studentDao.commitTransaction();
		
	}

	@Override
	public void updateStudent(Student student) {
		studentDao.beginTransaction();
		studentDao.updateStudent(student);
		studentDao.commitTransaction();
		
	}

	@Override
	public void removeStudent(Student student) {
		studentDao.beginTransaction();
		studentDao.removeStudent(student);
		studentDao.commitTransaction();
		
	}

}
