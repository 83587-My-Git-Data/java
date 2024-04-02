import java.util.Scanner;

public class Program03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		int total = 0;
		int quantity = 0;
	do{ 
		System.out.println("1. Dosa");
		System.out.println("2. Samosa");
		System.out.println("3. Idli");
		System.out.println("4. Vadapav");
		System.out.println("5. Kachori");
		System.out.println("6. Medhu vada");
		System.out.println("7. Gulab Jamun");
		System.out.println("8. Lassi");
		System.out.println("9. Cold Drinks");
		System.out.println("10. Generate Bill");
		System.out.println("Enter your choice");
		choice = sc.nextInt();
		
		switch(choice) {
			case 0:
				System.out.println("Thankyou");
				break;
			case 1:
				System.out.println("Enter the quantity");
				quantity = sc.nextInt();
				total = total + (30 * quantity);
				System.out.println("Enjoy!");
				break;
			case 2:
				System.out.println("Enter the quantity");
				quantity = sc.nextInt();
				total = total + (20 * quantity);
				System.out.println("Enjoy!");
				break;
			case 3:
				System.out.println("Enter the quantity");
				quantity = sc.nextInt();
				total = total + (25 * quantity);
				System.out.println("Enjoy!");
				break;
			case 4:
				System.out.println("Enter the quantity");
				quantity = sc.nextInt();
				total = total + (10 * quantity);
				System.out.println("Enjoy!");
				break;
			case 5:
				System.out.println("Enter the quantity");
				quantity = sc.nextInt();
				total = total + (25 * quantity);
				System.out.println("Enjoy!");
				break;
			case 6:
				System.out.println("Enter the quantity");
				quantity = sc.nextInt();
				total = total + (20 * quantity);
				System.out.println("Enjoy!");
				break;
			case 7:
				System.out.println("Enter the quantity");
				quantity = sc.nextInt();
				total = total + (20 * quantity);
				System.out.println("Enjoy!");
				break;
			case 8:
				System.out.println("Enter the quantity");
				quantity = sc.nextInt();
				total = total + (30 * quantity);
				System.out.println("Enjoy!");
				break;
			case 9:
				System.out.println("Enter the quantity");
				quantity = sc.nextInt();
				total = total + (10 * quantity);
				System.out.println("Enjoy!");
				break;
			case 10:
				System.out.println("Total Bill - " + total);
				break;
		}
		}while(choice != 0);
	}

}
