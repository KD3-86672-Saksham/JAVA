package com.app.geometry;

public class Assignment4 {

	public static void main(String[] args) {
			
		Point2D p1 = new Point2D(1,1);
		Point2D p2 = new Point2D(2,2);
		p1.accept();
		p2.accept();
		
		
		
		String point1=p1.stringGetDetails();
		String point2=p2.stringGetDetails();
		System.out.println(point1 + point2);
		if(p1.isEqual(p2)) {
			System.out.println("p1 and p2 are at same location");
		}
		else {
			System.out.println(p1.calculateDistance(p2));
		}
	}

}
