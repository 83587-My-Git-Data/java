import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number : ");
		int number = sc.nextInt();
		Integer i1 = new Integer(number);
		
		System.out.println("Given Number: " + number);
		System.out.println("Binary equivalent: "+ i1.toBinaryString(number));
		System.out.println("Octal equivalent: "+ i1.toOctalString(number));
		System.out.println("Binary equivalent: "+ i1.toHexString(number));
		
		
	}

}
