import java.util.Scanner;

public class RightAngledTriangle {
    
	public static void main(String[] args) {
        
	Scanner input = new Scanner(System.in);

	System.out.println("Enter base of Triangle: ");

	int baseLength = input.nextInt();


	if (baseLength < 1 || baseLength > 10) {
        System.out.println("Invalid input. Please enter a number between 1 and 10.");
        } 


	else {
            for (int item = 1; item <= baseLength; item++) {
                for (int items = 1; items <= item; items++) {
                    System.out.print("* ");
                }
                System.out.println();
		}
	     }
	}

}
