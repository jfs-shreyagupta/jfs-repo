package com.creation.dao;

import java.util.List;

import com.creation.model.Student;

public interface StudentDao {
	public List<Student> getStudents();
	public Student getStudentById(int id);
	public void addStudent(Student student);
	public void updateStudent(Student student);
	public void removeStudent(Student student);
	 public void commitTransaction();
	 public void beginTransaction();
	
}
