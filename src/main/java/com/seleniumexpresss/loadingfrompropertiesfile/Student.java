package com.seleniumexpresss.loadingfrompropertiesfile;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {

	@Value("${student.name}")
	private String name;

	@Value("${student.intrestedCourse}")
	private String interstedCourse;

	@Value("${student.hobby}")
	private String hobby;

	public void displayStudentInfo() {

		System.out.println("Student Name " + name);
		System.out.println("Student intrested course " + interstedCourse);
		System.out.println("Student hobby " + hobby);
	}
}
