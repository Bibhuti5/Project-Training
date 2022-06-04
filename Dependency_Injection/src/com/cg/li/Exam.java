package com.cg.li;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student bib = context.getBean("student",Student.class);
        bib.displayStudentInfo();
	}

}