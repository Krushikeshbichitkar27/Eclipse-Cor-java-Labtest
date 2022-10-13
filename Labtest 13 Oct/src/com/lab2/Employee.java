package com.lab2;

public class Employee 
{
    //creating properties
	private int id;
	private String ename;
	private String department;
	private String email;
	private double salary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int id, String ename, String department, String email, double salary) {
		super();
		this.id = id;
		this.ename = ename;
		this.department = department;
		this.email = email;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	public double grossSalary(double...salary) {
		 double grossSalary=10000;
		    double incomeTax=1000; 
		    double	 providentFund=800;    
		    double professionalTax=500;
		    double netSalary=grossSalary-(incomeTax+providentFund+professionalTax);
		     System.out.println("Net Salary is="+netSalary);
			return grossSalary;
	}
	
	
	
	
}
