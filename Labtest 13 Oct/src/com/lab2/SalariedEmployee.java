package com.lab2;

public class SalariedEmployee extends Employee 
{
	private String department;
	private double grossSalary;
	
	public SalariedEmployee() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	public SalariedEmployee(int id, String ename, String department, String email, double salary) {
		super(id, ename, department, email, salary);
		// TODO Auto-generated constructor stub
	this.department=department;
	this.grossSalary=grossSalary;
	
	}
	
	//getter setter
	public String getDepartment() 
	{
		return department;
	}
	public void setDepartment(String department) 
	{
		this.department = department;
	}
	public double getGrossSalary() 
	{
		return grossSalary;
	}
	public void setGrossSalary(double grossSalary) 
	{
		this.grossSalary = grossSalary;
	}
	
	@Override
	public String toString() 
	{
		return "SalariedEmployee [department=" + department + ", grossSalary=" + grossSalary + "]";
	}
	
	
	
	
	

	
	
}
