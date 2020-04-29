package com.cg.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.model.Employee;
import com.cg.model.SBU;

public class MainRunner {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		SBU sbu=(SBU)context.getBean("sbu");
		Employee emp=(Employee)context.getBean("Employee");
		emp.display();
	}
}
