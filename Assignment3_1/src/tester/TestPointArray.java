package tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPointArray {

	public static void main(String[] args) {
		int index = 0;
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many number of point you want to plot?");
		Point2D [] points = new Point2D[sc.nextInt()];
		
		for(int i = 0; i < points.length; i++) {
			points[i] = new Point2D();
			System.out.println("Enter the x-coordinate : ");
			points[i].setXaxis(sc.nextDouble());
			
			System.out.println("Enter the y-coordinate : ");
			points[i].setYaxis(sc.nextDouble());
		}
		
		do {
			System.out.println("0. Exit");
			System.out.println("1. Display details of the specific point");
			System.out.println("2. Display x, y co-ordinates of all points");
			System.out.println("3. Display the distance between two points");
			System.out.println("Enter your choice");
			choice = sc.nextInt();
		
		switch(choice) {
		case 0:
			System.out.println("Thankyou!");
			break;
		case 1:{
			System.out.println("Enter the Index");
			index = sc.nextInt();
			if(index < points.length) {
				System.out.println(points[index].getDetails());
			}
			else {
				System.out.println("Please Enter valid Index");
			}
		}
			break;
		case 2:{
			for(Point2D coords : points) {
				System.out.println(coords.getDetails());
			}
		}
			break;
		case 3:{
			int index2;
			System.out.println("Enter index of the first point");
			index = sc.nextInt();
			System.out.println("Enter index of the second point");
			index2 = sc.nextInt();
			if(points[index].isEqual(points[index2])) {
				System.out.println("P1 is equals to P2");
			}
			else {
				System.out.println("Since P1 and P2 are not equal. The distance betwwen them is " + points[index].calculateDistance(points[index2]));
				}
			}
			break;
			}
		}while(choice != 0);
	}

}
