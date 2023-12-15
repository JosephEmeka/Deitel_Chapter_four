
import java.util.Scanner;

public class Comparator {
    
	public static void main(String[] args) {
        
	Scanner input = new Scanner(System.in);

	System.out.println("Enter first number");

	int numberOne = input.nextInt();

	System.out.println("Enter Second number");

	int numberTwo = input.nextInt();

	if (numberOne == numberTwo)

	System.out.println(0);

	if (numberOne > numberTwo)

	System.out.println(1);

	if (numberOne < numberTwo)

	System.out.println(-1);

	}

}

