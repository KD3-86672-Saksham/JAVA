import java.util.Scanner;

public class assignment1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER NUM1 :");
		double a;
		double b;
		double avg;
		
		if(sc.hasNextDouble() && sc.hasNextInt()) {
			System.out.println("ERROR");
		}
		else if(sc.hasNextDouble() || sc.hasNextInt()) {
			a=sc.nextDouble();
			System.out.println("ENTER NUM 2");
			if(sc.hasNextDouble() && sc.hasNextInt()) {
				System.out.println("ERROR");
			}
			else if(sc.hasNextDouble() || sc.hasNextInt()) {
				b=sc.nextDouble();
				avg = (a+b)/2;
				System.out.println("AVERAGE = " + avg);
				
				
			}
			else {
				System.out.println("ERROR");
			}
		}
		else {
			System.out.println("ERROR");
		}	
	}
}




