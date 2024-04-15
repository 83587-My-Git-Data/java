package com.sunbeam;

public class Student{
	private String name;
	private int marks;
	private String city;

	public Student() {}
	
	public Student(String name, int marks, String city) {
		this.name = name;
		this.marks = marks;
		this.city = city;
	}
	
	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + ", city=" + city + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
