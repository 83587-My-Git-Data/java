package tester;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import com.sunbeam.library.*;

public class Test {

	public static void main(String[] args) {
		int choice; 
		Set<Library> booksList = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		
		
		do {
			System.out.println("0. Exit");
			System.out.println("1. Accept book details");
			System.out.println("2. Display all the books");
			System.out.println("3. Sort the books as per category and display it");
			System.out.println("4. Sort the book as per author and display it");
			System.out.println("5. Find the book by id");
			System.out.println("Enter your choice");
			choice = sc.nextInt();
			
		
			switch (choice) {
			case 0:
				System.out.println("Thankyou");
				break;
			case 1:
				Library l = new Library();
				l.accept(sc);
				booksList.add(l);
				break;
			case 2:
				for (Library element : booksList) {
					System.out.println(element);
				}
				break;
			case 3:{
				class LibraryCatComparator implements Comparator<Library>{

					@Override
					public int compare(Library o1, Library o2) {
						return o1.getCategory().compareTo(o2.getCategory());
					}
				}
				LibraryCatComparator l1 = new LibraryCatComparator();
				ArrayList<Library> arrayList = new ArrayList<>(booksList);
				Collections.sort(arrayList, l1);
				for (Library element : arrayList) {
					System.out.println(element);
				}
			}
			break;
			case 4:{
				class LibraryCatComparator implements Comparator<Library>{

					@Override
					public int compare(Library o1, Library o2) {
						return o1.getAuthorName().compareTo(o2.getAuthorName());
					}
				}
				LibraryCatComparator l1 = new LibraryCatComparator();
				ArrayList<Library> arrayList = new ArrayList<>(booksList);
				Collections.sort(arrayList, l1);
				for (Library element : arrayList) {
					System.out.println(element);
				}
			}
			break;
			case 5:{
				String isbm;
				System.out.print("Enter the id - ");
				isbm = sc.next();
				ArrayList<Library> arrayList = new ArrayList<>(booksList);
				for (int i = 0; i < arrayList.size(); i++) {
					if(arrayList.get(i).getIsbn().equals(isbm)) {
						System.out.println(arrayList.get(i));
					}
				}
			}
				break;
			default:
				break;
			}
		} while (choice != 0);

	}

}
