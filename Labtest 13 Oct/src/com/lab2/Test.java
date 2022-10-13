package com.lab2;

import java.util.Scanner;

public class Test
{
	
	static void enterSalariedEmp()
	{
		Scanner sc1 = new Scanner(System.in);
		SalariedEmployee s=new SalariedEmployee();
		
		double d[]=new double[2];
		System.out.println("Enter Employee id :");
		s.setId(sc1.nextInt());
		
		System.out.println("Enter Employee Name :");
		s.setEname(sc1.next());
		
		System.out.println("Enter Employee Department :");
		s.setDepartment(sc1.next());
		
		System.out.println("Enter Employee Gross Salary :");
		s.setSalary(sc1.nextDouble());
		
		//calculating salary
		s.setGrossSalary(s.grossSalary());
		System.out.println();
		sc1.close();
		
	}
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter the Employee details:");
		enterSalariedEmp();
	}


	

}
