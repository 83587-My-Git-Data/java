import java.util.Scanner;

public class Program02 {

	public static void main(String[] args) {
		double num1, num2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		if(sc.hasNextDouble() && !sc.hasNextInt()) {
			num1 = sc.nextDouble();
			System.out.println("Enter the second number");
			if(sc.hasNextDouble() && !sc.hasNextInt()) {
				num2 = sc.nextDouble();
				double avg; 
				avg = (num1 + num2)/2;
				System.out.println("Average :"+ avg);
			}
			else {
				System.out.println("The Second value entered is not of type double");
			}
		}
		else {
			System.out.println("The first value added is not of type double");
		}
	}

}
