
import java.util.Scanner;

public class SpecifiedSum{
    
	public static void main(String[] args) {
        
	Scanner input = new Scanner(System.in);

	System.out.println("Enter Specified number");

	int number = input.nextInt();

	int sum = 0;

	
	while (number > sum) {

	
	System.out.println("Enter integer values until Specified number is achieved or exceeded");

	int newNumber = input.nextInt();

	sum = sum + newNumber;

	if (sum > number) {

	System.out.println("Total values inputed =", sum);

	}

	}
 
	}
}
