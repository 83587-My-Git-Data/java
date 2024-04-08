package com.app.fruits;

public class Apple extends Fruit{
	
	public Apple() {
		this.setName("Apple");
	}
	
	public Apple(String color, double weight) {
		super(color, weight);
	}
	
	@Override
	public String toString() {
		String statement = "name : " + this.getName() + ", color : " + this.getColor() + ", isFresh : " + this.isFresh() + ", taste : " + taste();
		return statement;
	}
	
	@Override
	public String taste() {
		return "sweet n sour";
	}
}
