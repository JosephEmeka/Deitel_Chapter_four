import java.util.Scanner;

public class Palindrome {
    
	public static void main(String[] args) {
        
	Scanner input = new Scanner(System.in);

	System.out.println("Enter Five digit number");

	int number = input.nextInt();

		while (number < 10000 || number > 99999) {

        	System.out.println("Error! input another number ");

		System.out.println("Enter Five digit number");

		number = input.nextInt();

		}

		
		if (number > 10000 || number <= 99999) {

		int originalNumber = number; int reversedNumber = 0;

			while (number != 0) {

			int digit = number % 10;

			reversedNumber = reversedNumber * 10 + digit;

			number /= 10;

			}

        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }
	
	}
			
	
        }


} 