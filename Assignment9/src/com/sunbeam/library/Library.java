package com.sunbeam.library;

import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;

public class Library implements Comparator<Library>{
	private String isbn;
	private Category category;
	private double price;
	private String authorName;
	private int quantity;
	
	public Library(){}
	public Library(String isbn,Category category, double price, String authorName, int quantity){
		this.isbn = isbn;
		this.category = category;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "Library [isbn=" + isbn + ", category=" + category + ", price=" + price + ", authorName=" + authorName
				+ ", quantity=" + quantity + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(isbn);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Library other = (Library) obj;
		return Objects.equals(isbn, other.isbn);
	}
	public void accept(Scanner sc) {
		System.out.print("Enter the isbn - ");
		isbn = sc.next();
		System.out.print("Enter the Category - ");
		category = Category.valueOf(sc.next());
		System.out.print("Enter the Price - ");
		price = sc.nextDouble();
		System.out.print("Enter the Author Name - ");
		authorName = sc.next();
		System.out.print("Enter the Quantity - ");
		quantity = sc.nextInt();
	}
	@Override
	public int compare(Library o1, Library o2) {
		return o1.category.compareTo(o2.category);
	}
}
