public class Invoice {
	
 String partNo;
	private String partDescription;
	private int quantity;
	private double price;
	
	public Invoice(){}
	
	public Invoice(String partNo, String partDescription, int quantity, double price){
		this.partNo = partNo;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.price = price;
	}
	
	public String getPartNo() {
		return partNo;
	}
	
	public void setPartNo(String partNo) {
		this.partNo = partNo;
	}
	
	public String getPartDescription() {
		return partDescription;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
