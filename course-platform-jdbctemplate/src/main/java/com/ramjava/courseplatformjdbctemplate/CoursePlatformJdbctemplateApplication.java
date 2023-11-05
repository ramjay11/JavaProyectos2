package com.ramjava.courseplatformjdbctemplate;

import com.ramjava.courseplatformjdbctemplate.dao.DAO;
import com.ramjava.courseplatformjdbctemplate.model.Course;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class CoursePlatformJdbctemplateApplication {
	private static DAO<Course> dao;

	public CoursePlatformJdbctemplateApplication(DAO<Course> dao) {
		this.dao = dao;
	}

	public static void main(String[] args) {
		SpringApplication.run(CoursePlatformJdbctemplateApplication.class, args);
		System.out.println("\n All Courses --------------------------\n");
		List<Course> courses = dao.list();
		courses.forEach(System.out::println);
	}

}
