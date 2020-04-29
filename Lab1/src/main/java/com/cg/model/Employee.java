package com.cg.model;

public class Employee 
{
	private int empId;
	private String empName;
	private int empSalary;
	private SBU empBu;
	private int empAge;
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	public void setEmpBu(SBU empBu) {
		this.empBu = empBu;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	
	public void display()
	{
		System.out.println("Employee Details");
		System.out.println("-----------------------");
		System.out.println("Employee ID : "+ empId);
		System.out.println("Employee Name : "+ empName);
		System.out.println("Employee Salary : "+ empSalary);
		System.out.println(empBu);
		System.out.println("Employee Age : "+empAge);
	}
	
	
}
