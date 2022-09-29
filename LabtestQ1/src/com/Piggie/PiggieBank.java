package com.Piggie;

//declaring class
public class PiggieBank
{
    private String name;
	private int amount;
	
	//default constructor
	public PiggieBank()
	{
		super();
		// TODO Auto-generated constructor stub
		System.out.println("---No Amount added---");
	}
	// parameterize constructor
	public PiggieBank(String name, int amount) {
		super();
		this.name = name;
		this.amount = amount;
		System.out.println("--- Amount Added---");
	}

	//getter and setter method
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "PiggieBank [name=" + name + ", amount=" + amount + "]";
	}

	
	
	
}
