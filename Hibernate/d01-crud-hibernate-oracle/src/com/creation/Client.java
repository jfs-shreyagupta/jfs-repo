package com.creation;

import com.creation.model.Student;
import com.creation.service.StudentService;
import com.creation.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		Student student=new Student(100,"Shyam");
	
		StudentService studentService=new StudentServiceImpl();
		studentService.updateStudent(student);
		System.out.println(studentService.getStudentById(100));
		System.out.println(studentService.getStudents());
	}

}
