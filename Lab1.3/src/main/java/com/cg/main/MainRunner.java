package com.cg.main;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.config.JavaConfig;
import com.cg.entities.SBU;

public class MainRunner
{
	public static void main(String[] args) {
		 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		 SBU sbu=(SBU)context.getBean("sbuBean");
	     sbu.display();
	     context.close();
		
	}
	
}
