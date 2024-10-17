package pkg1;

public class assignment3ques1 {

	public static void main(String[] args) {
		invoice a = new invoice("A202","plumbing tool",-2,-50);
		invoice b = new invoice("A203","screw driver",-5,500);
		invoice c = new invoice("A204","plumbing tool",3,-250);
		invoice d = new invoice("A205","plumbing tool",7,150);
		a.setQuantity();
		a.setPrice();
		a.display();
		a.calculate();
		b.setQuantity();
		b.setPrice();
		b.display();
		b.calculate();
		c.setQuantity();
		c.setPrice();
		c.display();
		c.calculate();
		d.setQuantity();
		d.setPrice();
		d.display();
		d.calculate();
	}
	
	

}
