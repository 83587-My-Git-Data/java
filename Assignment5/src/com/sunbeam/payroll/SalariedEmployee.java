package com.sunbeam.payroll;

import java.util.Scanner;

public class SalariedEmployee extends Employee{
	private double weeklySal;
	
	@Override
	public void acceptData(Scanner sc) {
		super.acceptData(sc);
		System.out.println("Enter the weeklySal - ");
		weeklySal = sc.nextDouble();
		
	}

	@Override
	public void displayData() {
		super.displayData();
		System.out.println("Salary after Increment - " + calculateSal()); 
		
	}
	
	@Override
	public double calculateSal() {
		return weeklySal;
		
	}
}
