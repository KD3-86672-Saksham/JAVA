package com.sunbeam.p1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


class StdCityComparator implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		return o1.getCity().compareTo(o2.getCity());		
	}
}

class StdMarksComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return Double.compare(o2.getMarks(), o1.getMarks());
	}
	
}

class StdNameComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
}


public class Program01 {
		
	
	public static int menu(Scanner sc) {
		System.out.println("0. EXIT");
		System.out.println("1. Display All Students ");
		System.out.println("2. Display Students Sorted on city");
		System.out.println("3. Display Employees Sorted on marks(desc)");
		System.out.println("4. Display Employees Sorted on name");
		System.out.println("5. Display Employees Sorted on rollno");
		int choice;
		System.out.println("enter your choice: ");
		choice = sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		Student[] s1 = new Student[3];
		s1[0] = new Student(5, "Mukesh","Noida", 80);
		s1[1] = new Student(1, "Anil","Katni", 95);
		s1[2] = new Student(4, "Suresh","Gwalior", 70);
		Comparator<Student> comparator;
		Scanner sc = new Scanner(System.in);
		int choice;
		
		
		while((choice = menu(sc)) != 0) {
			
			switch(choice) {
			
			case 1:
				for(Student s:s1) {
					System.out.println(s.getRoll() + " " + s.getName() + " " + s.getCity());
				}
				break;
				
			case 2:
				comparator = new StdCityComparator();
				Arrays.sort(s1, comparator);
				for (Student student : s1) {
					System.out.println(student);
				}
				break;
				
			case 3:
				comparator = new StdMarksComparator();
				Arrays.sort(s1, comparator);
				for (Student student : s1) {
					System.out.println(student);
				}
				break;
				
			case 4:
				comparator = new StdNameComparator();
				Arrays.sort(s1, comparator);
				for (Student student : s1) {
					System.out.println(student);
				}
				break;
				
			case 5:
				Arrays.sort(s1);
				for (Student student : s1) {
					System.out.println(student);
				}
				break;
			}
		}

	}

}
