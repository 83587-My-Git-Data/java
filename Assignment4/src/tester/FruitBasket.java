package tester;

import java.util.Scanner;

import com.app.fruits.Fruit;
import com.app.fruits.Mango;
import com.app.fruits.Orange;
import com.app.fruits.Apple;

public class FruitBasket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		int size;
		int index = 0;
		
		System.out.println("Enter the number of fruits you want to add in the basket");
		size = sc.nextInt();
		
		Fruit []f = new Fruit[size];
		
		do {
			System.out.println("0. Exit");
			System.out.println("1. Add mango");
			System.out.println("2. Add Orange");
			System.out.println("3. Add Apple");
			System.out.println("4. Display name of all fruits in the basket");
			System.out.println("5. Display details of all fruits in the basket");
			System.out.println("6. Display the tastes of all stale(not fresh) fruits in the basket;");
			System.out.println("7. Mark a fruit as stale");
			System.out.println("8. Make  all sour fruits stale");
			System.out.println("Enter your choice");
			choice = sc.nextInt();
		
			switch(choice) {
				case 0:
					System.out.println("Thankyou!");
					break;
				case 1:{
					if(index < size) {
						f[index] = new Mango();
						f[index].accept(sc);
						System.out.println("Fruit added succesfully!");
						index++;
					}
					else
						System.out.println("Array is Full!");
				}
					break;
				case 2:{
					if(index < size) {
						f[index] = new Orange();
						f[index].accept(sc);
						System.out.println("Fruit added succesfully!");
						index++;
					}
					else
						System.out.println("Array is Full!");
				}
					break;
				case 3:{
					if(index < size) {
						f[index] = new Apple();
						f[index].accept(sc);
						System.out.println("Fruit added succesfully!");
						index++;
					}
					else
						System.out.println("Array is Full!");
				}
					break;
				case 4:{
					for(Fruit fobj : f) {
						if(fobj != null)
							System.out.println("Name of fruit : " + fobj.getName()); 
						else
							break;
					}
				}
					break;
				case 5:{
					for(Fruit fobj : f) {
						if(fobj != null) {
							System.out.println(fobj.toString());
						}else
							break;
					}
				}
					break;
				case 6:{
					for(Fruit fobj : f) {
						if(!fobj.isFresh()) {
							System.out.println("Name of the fruit: " + fobj.getName() + " and " + "Taste of the fruit : " + fobj.taste()); 
						}
					}
				}
					break;
				case 7:{
					System.out.println("Enter the Index of the fruit to mark it as stale");
					int staleindex = sc.nextInt();
					if(staleindex < f.length)
						f[staleindex].setFresh(false);
					else
						System.out.println("Invalid Index");
				}
					break;
				case 8:
					for(int i = 0; i < index; i++) {
						if(f[i].taste() == "sour")
							f[i].setFresh(false);
					}
					break;
			}	
		}while(choice != 0);

	}
}