package com.jsp.controller;

import java.util.ArrayList;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class SaveMultiple {
	
		public static void main(String[] args) {
			ArrayList<Student> a=new ArrayList<Student>();
			Student s1=new Student();
			s1.setId(1);
			s1.setName("Kishan");
			s1.setEmail("kishan@123");
			s1.setGender("male");
			s1.setCno(1245679525);
			
			Student s2=new Student();
			s2.setId(2);
			s2.setName("Manoj");
			s2.setEmail("manoj@123");
			s2.setGender("male");
			s2.setCno(1245679525);
			
			Student s3=new Student();
			s3.setId(3);
			s3.setName("Ram");
			s3.setEmail("ram@123");
			s3.setGender("male");
			s3.setCno(1245679525);
			
			Student s4=new Student();
			s4.setId(4);
			s4.setName("Rutik");
			s4.setEmail("rutik@123");
			s4.setGender("male");
			s4.setCno(1245679525);
			
			a.add(s4);
			a.add(s3);
			a.add(s2);
			a.add(s1);
			
			StudentDao studentDao =new StudentDao();
			studentDao.addmultipleStudent(a);
			
		}
		}

