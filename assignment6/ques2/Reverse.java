package com.sunbeam.reverse;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String b = sc.nextLine();
		StringBuffer a = new StringBuffer();
		a.append(b);
		System.out.println(a);
		a.reverse();
		System.out.println(a);
		

	}

}
