package com.app.fruits;

import java.util.Scanner;

public abstract class fruit {
String color;
double weight;
String name;
boolean isFresh = true;


public fruit(String color, double weight, String name) {
	this.color = color;
	this.weight = weight;
	this.name = name;
	
}

void Accept(Scanner sc) {
	System.out.println("enter the name: ");
	sc.next();
	System.out.println("enter the color: ");
	sc.next();
	System.out.println("enter the weight: ");
	sc.nextDouble();
	System.out.println("enter the isFresh: ");
	sc.nextBoolean();
}

void Display() {
	System.out.println("the name of the fruit is: " + name);
	System.out.println("the color of the fruit is: " + color);
	System.out.println("the weight of the fruit is: " + weight);
	System.out.println("is the fruit fresh: " + isFresh);
}

void displayName() {
	System.out.println(name);
}


public String getColor() {
	return color;
}


public void setColor(String color) {
	this.color = color;
}


public double getWeight() {
	return weight;
}


public void setWeight(double weight) {
	this.weight = weight;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public boolean isFresh() {
	return isFresh;
}


public void setFresh(boolean isFresh) {
	this.isFresh = isFresh;
}


@Override
public String toString() {
	return "fruit [name=" + name + ", weight=" + weight + ", color=" + color + ", isFresh=" + isFresh + "]";
}

    public abstract String taste();
}



