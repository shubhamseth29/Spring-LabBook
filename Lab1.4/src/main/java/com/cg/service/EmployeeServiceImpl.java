package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.EmployeeDAO;
import com.cg.entities.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	private EmployeeDAO dao;

	public EmployeeDAO getDao() {
		return dao;
	}
	@Autowired
	public void setDao(EmployeeDAO dao) {
		this.dao = dao;
	}

	public List<Employee> fetchAllEmployee() {
		return dao.fetchAllEmplloyees();
		
		
	}
	

}
