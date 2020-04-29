package com.cg.config;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.cg.entities.Employee;
import com.cg.entities.SBU;

@Configuration
@ComponentScan("com.cg.entities")
@PropertySource("classpath:info.properties")
public class JavaConfig {
	@Bean(name="sbuBean")
	public SBU sbu()
	{
		Employee employee1=new Employee(1,"John",6000,32);
		Employee employee2=new Employee(2,"Doe",7000,40);
		
		List<Employee> empList=new ArrayList<Employee>();
		empList.add(employee1);
		empList.add(employee2);
		
		SBU sbu=new SBU();
		sbu.setEmpList(empList); 
		
		return sbu;

	}
	
	

}
