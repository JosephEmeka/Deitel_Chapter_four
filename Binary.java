import java.util.Scanner;

public class Binary {
    
	public static void main(String[] args) {
        
	Scanner input = new Scanner(System.in);

	System.out.println("Enter Binary number");

	int binaryNumber = input.nextInt();

	int binaryRemainder = 0;

	int digit = 0;

	int count = 0; 

	int sum = 0;

	
	if (binaryNumber % 10 == 2) {


	System.out.println("You entered a wrong number! Try again");

	binaryNumber = input.nextInt();

	}

	if (binaryNumber % 10 <= 1 || binaryNumber % 10 >= 0 ) 

		{

		while(binaryNumber > 0) { 

		binaryRemainder = binaryNumber % 10;


		digit = binaryRemainder * (count * count);
		
		count ++;

		binaryNumber = binaryNumber / 10;

		sum = sum + digit;

		}


		System.out.println(sum);

	}

	}


}
	

	