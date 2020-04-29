package com.cg.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.cg.entities.Employee;
@Repository
public class EmployeeDAOImpl implements EmployeeDAO 
{
	private Map<Integer,Employee> empData=new HashMap<Integer, Employee>();
	
	public EmployeeDAOImpl()
	{
		empData.put(1,new Employee(101,"John",70000));
        empData.put(2,new Employee(102,"Doe",134560));
	}
	public List<Employee> fetchAllEmplloyees() {
		Collection<Employee>employees=empData.values();
        List<Employee> empList=new ArrayList<Employee>(employees);
        return empList;

		
		
	}

}
