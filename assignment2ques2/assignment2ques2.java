import java.util.Scanner;

public class assignment2ques2 {

	public static int menu() {

		int choice;

		System.out.println("1.Dosa $50");
		System.out.println("2. idli $20");
		System.out.println("3. vada  $20");
		System.out.println("4. Sambar $5");
		System.out.println("5. Chole Bhature $120");
		System.out.println("6. Momo $90");
		System.out.println("7 Generate bill");
		System.out.println("0 Exit");
		System.out.println("enter you choice: ");
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		
		int quantity;
		int choice;
		int total = 0;
		Scanner sc = new Scanner(System.in);
		while ((choice = menu()) != 0)
			{
			switch(choice) {
			
			case 0:
				System.out.println("thankyou ");
				break;
			
			case 1:
				System.out.println("enter quantity for dosa: ");
				quantity = sc.nextInt();
				total = total + (quantity*50);
				break;
				
			case 2:
				System.out.println("enter quantity for dosa: ");
				quantity = sc.nextInt();
				total = total + (quantity*20);
				break;
				
			case 3:
				System.out.println("enter quantity for dosa: ");
				quantity = sc.nextInt();
				total = total + (quantity*20);
				break;
				
			case 4:
				System.out.println("enter quantity for dosa: ");
				quantity = sc.nextInt();
				total = total + (quantity*5);
				break;
				
			case 5:
				System.out.println("enter quantity for Chole Bhature: ");
				quantity = sc.nextInt();
				total = total + (quantity*120);
				break;
				
			case 6:
				System.out.println("enter quantity for Momo");
				quantity = sc.nextInt();
				total = total + (quantity*90);
				break;
				
			case 7:
				System.out.println("total bill = " + total);
				quantity = sc.nextInt();
				total = total + (quantity*5);
				break;
				
			default:
				System.out.println("enter a valid choice");
				break;
				
				
				}
			
			}
		
		}
	}
