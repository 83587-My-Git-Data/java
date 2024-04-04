package tester;

import java.lang.Math;
import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPoint {

	public static void main(String[] args){
		double xaxis;
		double yaxis;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the x Coordinate for P1");
		xaxis = sc.nextDouble();
		System.out.println("Enter the y Coordinate for P1");
		yaxis = sc.nextDouble();
		Point2D p1 = new Point2D(xaxis, yaxis);
		
		System.out.println("Enter the x Coordinate for P2");
		xaxis = sc.nextDouble();
		System.out.println("Enter the y Coordinate for P2");
		yaxis = sc.nextDouble();
		Point2D p2 = new Point2D(xaxis, yaxis);
		
		System.out.println("Details of p1");
		System.out.println(p1.getDetails()); 

		System.out.println("Details of p2");
		System.out.println(p2.getDetails()); 
		
		if(p1.isEqual(p2)) {
			System.out.println("P1 is equals to P2");
		}
		else {
			System.out.println("Since P1 and P2 are not equal. The distance betwwen them is " + p1.calculateDistance(p2));
		}
		
		
	}

}
