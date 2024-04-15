package tester;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import com.sunbeam.Student;

public class Test {

	public static void main(String[] args) {
		int choice;
		Scanner sc = new Scanner(System.in);
		Student arr[] = new Student[5];
		arr[0] = new Student("Abhay", 100, "Mumbai");
		arr[1] = new Student("Tushar", 95, "Nagpur");
		arr[2] = new Student("Ninad", 88, "Nasik");
		arr[3] = new Student("Ranjit", 89, "Kolhapur");
		arr[4] = new Student("Rohit", 92, "Pune");

		do {
			System.out.println("0. Exit");
			System.out.println("1. Sort based on their city");
			System.out.println("2. Sort based on their marks");
			System.out.println("3. Sort based on their name");
			System.out.println("4. Display the array");
			System.out.println("Enter your choice");
			choice = sc.nextInt();
			
			switch (choice) {
			case 0:
				System.out.println("Thankyou");
				break;
			case 1:
				class StudentCityComparator implements Comparator<Student>{
					@Override
					public int compare(Student o1, Student o2) {
						int value = o1.getCity().compareTo(o2.getCity());
						return value;
					}
				}
					Comparator<Student> stdCityComparator = new StudentCityComparator();	
					Arrays.sort(arr, stdCityComparator);
					System.out.println("Sorting done successfully");
				break;
			case 2:
				class StudentMarksComparator implements Comparator<Student>{
					@Override
					public int compare(Student o1, Student o2) {
						int value = o1.getMarks() - o2.getMarks();
						return value;
					}
				}
					Comparator<Student> stdMarksComparator = new StudentMarksComparator();	
					Arrays.sort(arr, stdMarksComparator);
					System.out.println("Sorting done successfully");
				break;
			case 3:
				class StudentNameComparator implements Comparator<Student>{
					@Override
					public int compare(Student o1, Student o2) {
						int value = o1.getName().compareTo(o2.getName());
						return value;
					}
				}
					Comparator<Student> stdNameComparator = new StudentNameComparator();	
					Arrays.sort(arr, stdNameComparator);
					System.out.println("Sorting done successfully");
				break;
			case 4:
				for(Student element: arr) {
					System.out.println(element);
				}
			default:
				System.out.println("Please enter correct choice");
				break;
			}
			
		} while (choice != 0);
		
	}
}