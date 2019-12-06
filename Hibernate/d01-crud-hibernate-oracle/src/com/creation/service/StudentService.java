package com.creation.service;

import java.util.List;

import com.creation.model.Student;

public interface StudentService {
	public List<Student> getStudents();
	public Student getStudentById(int id);
	public void addStudent(Student student);
	public void updateStudent(Student student);
	public void removeStudent(Student student);
}
