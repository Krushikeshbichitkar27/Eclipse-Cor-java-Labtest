package com.lab3;

public class Bank1 extends Account
{
	Account a1;
	
	Bank1(Account a1)
	{
		this.a1=a1;
		
	}
	public void run() {
		for (int x = 0; x < 5; x++) {
			makeWithdrawal(10);
			if (a1.getBalance() < 0) {
				System.out.println("account is overdrawn!");
			}
		}
	}
	public void makeWithdrawal(int i) {
		int amt = 10;
		// TODO Auto-generated method stub
		if (a1.getBalance() >= amt) {
			System.out.println(Thread.currentThread().getName() + " is going to withdraw");
			try {
				Thread.sleep(100);
			} catch (InterruptedException ex) {
			}
			a1.withdraw(amt);
			System.out.println(Thread.currentThread().getName() + " completes the withdrawal");
		} else {
			System.out.println("Not enough in account for " + Thread.currentThread().getName() + " to withdraw " + a1.getBalance());
		}
	}
		


	
	

}
