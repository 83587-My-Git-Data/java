package com.sunbeam.payroll;

import java.util.Scanner;

public class BasePlusCommisionEmployee extends CommisionEmployee{
	private double baseSalary;
	
	@Override
	public void acceptData(Scanner sc) {
		
		super.acceptData(sc);
		System.out.println("Enter Base Salary");
		baseSalary = sc.nextDouble();
	}
	
	@Override
	public void displayData() {
		super.displayData();
	}
	
	@Override
	public double calculateSal() {
		return super.calculateSal() + baseSalary;
	}
	
	public double  incrementedSal() {
		return calculateSal() + (0.1 * baseSalary);
	}
}
