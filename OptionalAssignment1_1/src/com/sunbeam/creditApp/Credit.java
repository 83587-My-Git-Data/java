package com.sunbeam.creditApp;

import java.util.Scanner;

public class Credit {
	final private int accNo = ++generateAccNo;
	private int balance;
	private int totalMonthlyCharges;
	private int totalCredits;
	private int creditLimit;
	private boolean creditLimitExceed;
	private static int generateAccNo = 1000;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getTotalMonthlyCharges() {
		return totalMonthlyCharges;
	}
	
	public void setTotalMonthlyCharges(int totalMonthlyCharges) {
		this.totalMonthlyCharges = totalMonthlyCharges;
	}

	public int getTotalCredits() {
		return totalCredits;
	}

	public void setTotalCredits(int totalCredits) {
		this.totalCredits = totalCredits;
	}

	public int getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(int creditLimit) {
		this.creditLimit = creditLimit;
	}
	
	public boolean isCreditLimitExceed() {
		return creditLimitExceed;
	}

	public void setCreditLimitExceed(boolean creditLimitExceed) {
		this.creditLimitExceed = creditLimitExceed;
	}

	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the following details fot Account Number : " + accNo);
		
		do {
			System.out.print("Enter the pending balance of the begining month : ");
			balance = sc.nextInt();
				if(balance < 0) {
					System.out.println("Values cannot be 0. Please enter the valid values");
				}
		}while(balance < 0);
		
		System.out.print("Enter the total of all items charged this month :");
		totalMonthlyCharges = sc.nextInt();
		
		System.out.print("Enter the Total of all credits applied this month : ");
		totalCredits = sc.nextInt();
		
		System.out.print("Enter your credit limit : ");
		creditLimit = sc.nextInt();
		
	}
	
	public void displayData() {
		System.out.println("Account Number : "+ accNo);
		System.out.println("Pending balance of the begining month : " + balance);
		System.out.println("Total of all items charged by the customer this month : " + totalMonthlyCharges );
		System.out.println("Total of all credits applied to the customer's account this month : " + creditLimit);
		System.out.println("Allowed credit limit : "+ creditLimit);
		System.out.println("Your pending balance is : " + calculateNewBalance());
	}
	
	public int calculateNewBalance() {
		int newBalance = balance + totalMonthlyCharges - totalCredits;
		return newBalance;
		
	}
	
	
	
	public void newBalance() {
		if(calculateNewBalance() > creditLimit) {
			creditLimitExceed = true;
			System.out.println("Credit limit exceeded");
		}
		else {
			creditLimitExceed = false;
		}
	}

}
