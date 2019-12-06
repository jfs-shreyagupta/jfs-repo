package com.creation;

import com.creation.model.Student;
import com.creation.service.StudentService;
import com.creation.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		Student student=new Student(200,"Ram");
	
		StudentService studentService=new StudentServiceImpl();
		studentService.addStudent(student);
//		System.out.println(studentService.getStudents());
	}

}
