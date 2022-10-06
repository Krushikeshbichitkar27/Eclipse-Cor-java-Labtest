package com.Question3;

public class college extends Student 
{

	
	private float avgMarks;
	public int standard;
	
	
	public college() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public college( float avgMarks, int standard) {
		super();
		
		this.avgMarks = avgMarks;
		this.standard = standard;
	}
	
	public float getAvgMarks() {
		return avgMarks;
	}
	public void setAvgMarks(float avgMarks) {
		this.avgMarks = avgMarks;
	}
	public int getStandard() {
		return standard;
	}
	public void setStandard(int standard) {
		this.standard = standard;
	}

	@Override
	public String toString() {
		return "college [avgMarks=" + avgMarks + ", standard=" + standard + ", getAvgMarks()=" + getAvgMarks()
				+ ", getStandard()=" + getStandard() + "]";
	}
	
	
	
	
}
