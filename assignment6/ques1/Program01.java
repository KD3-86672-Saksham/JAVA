package com.sunbeam.string;

import java.util.Scanner;

public class Program01 {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		try {
		if(a.length()>8) {
			 throw new ExceptionLineTooLong("string should be less than 80");
		}
		}
		catch(ExceptionLineTooLong e) {
			e.printStackTrace();
		}
System.out.println("test");
	}

}
