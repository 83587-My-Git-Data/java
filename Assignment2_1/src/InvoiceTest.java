import java.util.Scanner;

public class InvoiceTest {

	public static void main(String[] args) {
		String partNo;
		String partDesc;
		int quantity;
		double price;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the PartNo - ");
		partNo = sc.nextLine();
		System.out.print("Enter the partDesc - ");
		partDesc = sc.nextLine();
		System.out.print("Enter the Quantity- ");
		quantity = sc.nextInt();
		if(quantity < 0) {
			quantity = 0;
		}
		System.out.print("Enter the Price - ");
		price = sc.nextDouble();
		if(price < 0) {
			price = 0.0;
		}
		
		Invoice i = new Invoice(partNo, partDesc, quantity, price);
		
		System.out.println("Total Amount = "+ (i.getPrice() * i.getQuantity()));
		
	}

}
