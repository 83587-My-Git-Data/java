package com.sunbeam.payroll;

import java.util.Scanner;

public class CommisionEmployee extends Employee{
	private double grossSales;
	private double commisionRate;
	
	@Override
	public void acceptData(Scanner sc) {
		super.acceptData(sc);
		System.out.println("Enter the gross Sales - ");
		grossSales = sc.nextDouble();
		
		System.out.println("Enter the commision - ");
		commisionRate = sc.nextDouble();
	}
	
	@Override
	public void displayData() {
		super.displayData();
		System.out.println("Gross sales - " + grossSales);
		System.out.println("Commision - " + commisionRate);
		System.out.println("Salary of Commision Employee Before Increm- " + calculateSal());
	}

	@Override
	public double calculateSal() {
		return commisionRate * grossSales;
	}
}
