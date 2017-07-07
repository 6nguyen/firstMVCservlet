package com.nguyen92.servlet.firstMVCservlet;

import java.util.ArrayList;
import java.util.List;


public class studentDataUtil {

	public static List<Student> getStudents(){
		
		// create an empty list
		List<Student> students = new ArrayList<>();
		
		// add sample data
		students.add(new Student("Ashley", "Simpson", "asimp@gmail.com"));
		students.add(new Student("George", "Wynn", "gn@gmail.com"));
		students.add(new Student("Fred", "Remington", "fr@gmail.com"));
		
		// return the list
		return students;
	}
}
