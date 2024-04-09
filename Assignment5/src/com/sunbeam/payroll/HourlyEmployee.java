package com.sunbeam.payroll;

import java.util.Scanner;

public class HourlyEmployee extends Employee{
	 private double hourlyWage;
	 private double hoursWorked;
	 
	 @Override
	public void acceptData(Scanner sc) {
		super.acceptData(sc);
		System.out.println("Enter the hourly wage- ");
		hourlyWage = sc.nextDouble();
		System.out.println("Enter the total number of hours worked - ");
		hoursWorked = sc.nextDouble();
	}
	 
	 @Override
	public void displayData() {
		super.displayData();
		System.out.println("Salary of hourly employee - " + calculateSal());
	}
	 
	@Override
	public double calculateSal() {
		if(hoursWorked <= 40) {
			return hoursWorked * hourlyWage;
		}
		else if(hoursWorked > 40) {
			return 40 * hourlyWage + (hoursWorked - 40) * hourlyWage * 1.5;
		}
		return 0;
		
	}
}
