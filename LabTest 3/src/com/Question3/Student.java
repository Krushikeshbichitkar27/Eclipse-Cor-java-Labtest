package com.Question3;

public class Student 
{
	private String name;
    public int standard;
	private float avgMarks;
	
	public Student()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int standard, float avgMarks) {
		super();
		this.name = name;
		this.standard = standard;
		this.avgMarks = avgMarks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStandard() {
		return standard;
	}

	public void setStandard(int standard) {
		this.standard = standard;
	}

	public float getAvgMarks() {
		return avgMarks;
	}

	public void setAvgMarks(float avgMarks) {
		this.avgMarks = avgMarks;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", standard=" + standard + ", avgMarks=" + avgMarks + ", getName()="
				+ getName() + ", getStandard()=" + getStandard() + ", getAvgMarks()=" + getAvgMarks() + "]";
	}

	
	
	

}
