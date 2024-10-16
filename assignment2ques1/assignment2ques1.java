import java.util.Scanner;

public class assignment2ques1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number: ");
		int number = sc.nextInt();
		System.out.println("in binary: " + Integer.toBinaryString(number) );
		System.out.println("in octal: " + Integer.toOctalString(number) );
		System.out.println("in hex: " + Integer.toHexString(number) );
	}	

}
