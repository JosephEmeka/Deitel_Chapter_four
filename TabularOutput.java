import java.util.Scanner;

public class TabularOutput {
    
	public static void main(String[] args) {
        
	Scanner input = new Scanner(System.in);
	
	System.out.printf("%s\t\t%s\t\t%s%t\t%s%n", "N", "N2", "N3", "N4");

	int number;

	int resultTwo = number * number;

	int resultThree = number * resultTwo;

	int resultFour = number * resultThree;
	

	for (number = 1; number <= 5; number ++) 

	System.out.printf("%d\t\t%d\t\t%d%t\t%d%n", number, resultTwo , resultThree, resultFour);
	
	}

}