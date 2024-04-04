package com.app.fuelManagement;

import java.util.Scanner;

public class Car {
	private double totalMiles;
	private double fuelPrice;
	private double average;
	private double parkingCost;
	private double tollPrice;
	
	public void accept() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the total miles driven today:");
		totalMiles = sc.nextDouble();
		
		System.out.println("Enter the Fuel price:");
		fuelPrice = sc.nextDouble();
		
		System.out.println("Enter the average: ");
		average = sc.nextDouble();
		
		System.out.println("Enter the parking fees: ");
		parkingCost = sc.nextDouble();
		
		System.out.println("Enter the toll price: ");
		tollPrice = sc.nextDouble();
	}
	
	public void display() {
		System.out.println("Total miles driven today : " + totalMiles);
		System.out.println("Cost per gallon of gasoline : "+ fuelPrice);
		System.out.println("average miles per gallon : " + average);
		System.out.println("Parking fees per day: " + parkingCost);
		System.out.println("Tolls per day: " + tollPrice);
	}
	
	
	public double calculateCost() {
		return (((totalMiles * fuelPrice) / average) + parkingCost + tollPrice) ;
	}
}
