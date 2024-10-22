package com.sunbeam.palindrome;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String b = sc.nextLine();
		StringBuffer a = new StringBuffer();
		a.append(b);
		System.out.println("before reverse");
		System.out.println(a);
		String s1 = a.reverse().toString();
		System.out.println("after reverse");
		System.out.println(s1);
		if(b.equals(s1)) {
			System.out.println(b + " " + "is a palindrome");
		}
		else {
			System.out.println(b + " " + "is not a palindrome");
		}
	}

}
