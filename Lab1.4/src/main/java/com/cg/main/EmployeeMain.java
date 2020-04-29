package com.cg.main;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.config.JavaConfig;
import com.cg.entities.Employee;
import com.cg.service.EmployeeService;

public class EmployeeMain {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		EmployeeService service = context.getBean(EmployeeService.class);
		List<Employee> employee = service.fetchAllEmployee();
		EmployeeMain main=new EmployeeMain();
		main.display(employee);

	}
	
	private void display(List<Employee> employee) {
		System.out.println("Enter employee id");
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		for(Employee emp:employee)
		{
			if(id==emp.getEmpId())
			{
				System.out.println("Employee info");
		        System.out.println("EMPLOYEEID :"+emp.getEmpId());
		        System.out.println("EMPLOYEEName : "+emp.getEmpName());
		        System.out.println("EMPLOYEESalary :"+emp.getEmpSalary());
			}
		}
		
		
	}

	
}
