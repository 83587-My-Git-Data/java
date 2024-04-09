package com.sunbeam.payroll;

import java.util.Scanner;

public abstract class Employee {
	private String firstName;
	private String lastName;
	private double SSN;	

	public void acceptData(Scanner sc) {
		System.out.println("Enter first name - ");
		firstName = sc.next();
		System.out.println("Enter last name -");
		lastName = sc.next();
		System.out.println("Enter the Social Security Number - ");
		SSN = sc.nextDouble();
	}
	
	public void displayData() {
		System.out.println("Name - " + firstName + " " + lastName);
		System.out.println("Social Security Number - "+ SSN);
	}
	
	abstract public double calculateSal();
}
