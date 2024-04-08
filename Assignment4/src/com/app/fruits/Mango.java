package com.app.fruits;

public class Mango extends Fruit{
	
	public Mango(){
		this.setName("Mango");
	};
	
	public Mango(String color, double weight) {
		super(color, weight);
	}

	@Override
	public String toString() {
		String statement = "name : " + this.getName() + ", color : " + this.getColor() + ", isFresh : " + this.isFresh() + ", taste : " + taste();
		return statement;
	}
	
	@Override
	public String taste() {
		return "sweet";
	}
}
