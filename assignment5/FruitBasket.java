package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {

	public static int menu(Scanner sc) {
		System.out.println("1. Add Mango ");
		System.out.println("2. Add Apple ");
		System.out.println("3. Add Orange ");
		System.out.println("4. Display name of all fruits ");
		System.out.println("5. Display name, color, weight, taste, isFresh");
		System.out.println("6. Mark a fruit stale");
		System.out.println("7. Display taste of all stale(not fresh) fruits in the basket");

		int choice = sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int choice;
		int counter = 0;
		int size;
		System.out.println("Enter the sizze of the array");
		size = sc.nextInt();
		fruit[] f = new fruit[size];

		while ((choice = FruitBasket.menu(sc)) != 0) {
			switch (choice) {
			case 1:
				if (counter < f.length) {
					f[counter] = new Mango("Yellow", 300.32, "Langda");
					counter++;
				} else {
					System.out.println("Array is full");
				}
				break;

			case 2:
				if (counter < f.length) {
					f[counter] = new Apple("Red", 300.32, "Kashmiri");
					counter++;
				} else {
					System.out.println("Array is full");
				}
				break;

			case 3:
				if (counter < f.length) {
					f[counter] = new Orange("Orange", 300.32, "Nagpuri");
					counter++;
				} else {
					System.out.println("Array is full");
				}
				break;

			case 4:
				for (fruit fr : f) {

					System.out.println(fr.getName());

				}
				break;
			case 5:
				for (fruit fr : f) {
					System.out.println(fr.color + fr.name + fr.weight + fr.isFresh);
				}
				break;

			case 6:
				int a;
				a = sc.nextInt();
				if (a < f.length && a >= 0) {
					f[a].setFresh(false);
				}
				break;

			case 7:
				for (fruit fr : f) {
					if (fr.isFresh() == false) {
						System.out.println(fr.taste());
					}
				}
			}

		}

	}
}
