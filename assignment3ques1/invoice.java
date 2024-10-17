package pkg1;

public class invoice {
	String partNumber;
	String partDescription;
	int quantity;
	double price;
	
	public invoice(String partNumber, String partDescription, int quantity, double price) {
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.price = price;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
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

	public void setQuantity() {
		//this.quantity = quantity;
		if(quantity < 0) {
			this.quantity = 0;
		}
	}

	public double getPrice() {
		return price;
	}

	public void setPrice() {
		
		if(price<0) {
			this.price = 0.0;
		}
	}
	
	public void display() {
		System.out.println("part number is: " + partNumber);
		System.out.println("part description is : " + partDescription);
		System.out.println("quantity given is: " + quantity);
		System.out.println("price per item is: " + price);
	}
	
	public double calculate() {
		System.out.println("total price for this item is: " + quantity*price);
		return price;
	}
	
	
	
	
	

}
