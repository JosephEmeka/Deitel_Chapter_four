import java.util.Scanner;

public class SalesCommissionCalculator{

	public static void main(String[] arg) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of items sold: ");

		int numItemSold = input.nextInt();
		
		double totalSales = 0;

		for (int item = 1; item <= numItemSold; item++){			
		
		System.out.print("Enter the value of item " + item + ": $");
		
		double itemValue = input.nextDouble();

		totalSales += itemValue;

		}

		double earnings = 200 + (0.09 * totalSales);

		System.out.println("The salesperson's earnings for the week is: $" + earnings);

	}


}



