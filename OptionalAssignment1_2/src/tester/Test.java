package tester;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		int choice = 0;
		int indexForFirstClass = 0;
		int indexForEconomyClass = 5;
		
		boolean [] available = new boolean[10];
		
		Scanner sc = new Scanner(System.in);
		
		do {
			for(int i = 0; i < available.length; i++) {
				System.out.print("seat No : " + (i + 1) + " - " + available[i]);
				System.out.println();
			}
			System.out.println("");
			System.out.println("0. Exit");
			System.out.println("1. First Class");
			System.out.println("2. Economy Class");
			System.out.println("Enter your choice : ");
			choice = sc.nextInt();
			
			switch (choice) {
			case 0:
				System.out.println("Thankyou for using our app");
				break;
			
			case 1:{
				if(indexForFirstClass < 5) {
					available[indexForFirstClass] = true;
					System.out.println("Seat Booked Succesfully !");
					indexForFirstClass++;
				}
				else {
					System.out.println("We're sorry our seats are all booked");
				}
			}
				break;
			
			case 2:{
				if(indexForEconomyClass < 10) {
					available[indexForEconomyClass] = true;
					System.out.println("Seat Booked Succesfully !");
					indexForEconomyClass++;
				}
				else {
						if(indexForFirstClass < 5) {
							System.out.println("Sorry our Economy class is full. Would you like to have a seat in the first class?");
							System.out.println("1. Yes");
							System.out.println("2. No");
							choice = sc.nextInt();
							
							switch (choice) {
							case 1:{
								available[indexForFirstClass] = true;
								System.out.println("Seat Booked Succesfully !");
								indexForFirstClass++;
								break;
							}
							case 2:
								System.out.println("Next flight leaves in 3 hours");
								break;
								
							default:
								System.out.println("Please enter the valid choice");
								break;
							}
						}
						else {
							System.out.println("sorry for the inconviniences . We will try out best next time.");
						}
					}
				break;	
				}
			}
		}while(choice != 0);
	}
}
