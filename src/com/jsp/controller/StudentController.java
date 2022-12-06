package com.jsp.controller;


import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class StudentController {
			public static void main(String[] args) {
			Student student = new Student();
			student.setId(15);
			student.setName("NITISH");
			student.setEmail("nitish@123");
			student.setGender("Male");
			student.setCno(1875286014);
			
			StudentDao studentDao = new StudentDao();
			studentDao.saveStudent(student);


		}
}