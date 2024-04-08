package com.app.fruits;

public class Orange extends Fruit{

	public Orange(){
		this.setName("Orange");
	};
	
	public Orange(String color, double weight) {
		super(color, weight);
	}

	@Override
	public String toString() {
		String statement = "name : " + this.getName() + ", color : " + this.getColor() + ", isFresh : " + this.isFresh() + ", taste : " + taste();
		return statement;
	}
	
	@Override
	public String taste() {
		return "sour";
	}
}
