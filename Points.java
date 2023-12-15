import java.util.Scanner;

public class Points {
    
	public static void main(String[] args) {
        
	Scanner input = new Scanner(System.in);

	System.out.println("Enter x1 coordinate of point 1: ");

	double x1 = scanner.nextDouble();

	System.out.println("Enter y1 coordinate of point 1: ");

	double y1 = scanner.nextDouble();

	System.out.println("Enter x2 coordinate of point 2: ");

	double x2 = scanner.nextDouble();

	System.out.println("Enter y2 coordinate of point 2: ");

	double y2 = scanner.nextDouble();

		
        if (y1 == y2) {
            System.out.println("The points are located on a line perpendicular to the x-axis");
        }
        
        else if (x1 == x2) {
            System.out.println("The points are located on a line perpendicular to the y-axis");
        } else {
            System.out.println("The points are not located on a line perpendicular to either axis");
        }



	}

}
