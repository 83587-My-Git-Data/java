package com.app.fruits;

import java.util.Scanner;

public class Fruit{
	private String color;
	private double weight;
	private String name;
	private boolean isFresh = true;
	
	public Fruit() {}
	
	public Fruit(String color, double weight) {
		this.color = color;
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	public void accept(Scanner sc) {
		System.out.println("Enter the color of the fruit : ");
		color = sc.next();
		
		System.out.println("Enter the weight of the fruit : ");
		weight = sc.nextDouble();
	
	}
	
	@Override
	public String toString() {
		String statement = "name : " + name + "color : " + color + "isFresh : " + isFresh ;
		return statement;
	}
	
	public String taste() {
		return "no specific taste";
	}
}


