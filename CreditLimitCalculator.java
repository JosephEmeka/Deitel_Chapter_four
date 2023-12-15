import java.util.Scanner;

public class CreditLimitCalculator{

	public static void main(String[] arg) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter Account Number: ");
		int accountNumber = input.nextInt();

		System.out.println("");
		int balanceAtBeginningOfTheMonth = input.nextInt();

		System.out.println("");
		int totalCharged =input.nextInt();

		System.out.println("");
		int totalCreditApplied =input.nextInt();

		System.out.println("");
		int allowdCreditLimit =input.nextInt();

		System.out.print("Enter credit limit: ");
                creditLimit = input.nextInt();

		int newBalance = balanceAtBeginningOfTheMonth + totalCharged - totalCreditApplied 

		System.out.printf("New balance for account %d is: %d\n", accountNumber, newBalance);


                if (newBalance > creditLimit) {
            System.out.println("Credit limit exceeded");
		}


	}



}