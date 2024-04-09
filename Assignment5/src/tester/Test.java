package tester;

import java.util.Scanner;

import com.sunbeam.payroll.BasePlusCommisionEmployee;
import com.sunbeam.payroll.CommisionEmployee;
import com.sunbeam.payroll.Employee;
import com.sunbeam.payroll.HourlyEmployee;
import com.sunbeam.payroll.SalariedEmployee;

public class Test {

	public static void main(String[] args) {
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Calculate salary of Salaried Employees");
		System.out.println("2. Calculate salary of Hourly Employees");
		System.out.println("3. Calculate salary of Commision Employees");
		System.out.println("4. Calculate salary of Base Plus Commision Employees");
		System.out.println("Enter your choice : ");
		choice = sc.nextInt();
		
		switch (choice) {
		case 1:{
			Employee e = new SalariedEmployee();
			e.acceptData(sc);
			e.displayData();
			break;
		}
		case 2:{
			Employee e = new HourlyEmployee();
			e.acceptData(sc);
			e.displayData();
			break;
		}
		case 3:{
			Employee e = new CommisionEmployee();
			e.acceptData(sc);
			e.displayData();
		}
		case 4:{
			Employee e = new BasePlusCommisionEmployee();
			e.acceptData(sc);
			e.displayData();
			BasePlusCommisionEmployee b = (BasePlusCommisionEmployee) e;
			System.out.println("Salary of Base Plus Commision Employees after Increment - " + b.incrementedSal());
			break;
		}
		default:
			System.out.println("Invalid Choice");
			break;
		}
		
		sc.close();
	}
	

}
