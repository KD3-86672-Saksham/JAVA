package com.app.fruits;

import java.util.Scanner;

public class Apple extends fruit {

	public Apple(String color, double weight, String name) {
		super(color, weight, name);
		
	}
	
	@Override
	void Accept(Scanner sc) {
	super.Accept(sc);
	}
	
	@Override
	void Display() {
	super.Display();
	taste();
	}

	@Override
	public String taste() {
		return "sweet n sour" ;
		
	}
	
	
}


