package com.cg.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
	
		/* 
		 * Student s = new Student();
		MathCheat mc = new MathCheat();
		s.setMathCheat(mc);
	    s.getMathCheat().mathCheat();;
	    */
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Student s = context.getBean("stu", Student.class);
        s.getMathCheat().mathCheat();
	}

}