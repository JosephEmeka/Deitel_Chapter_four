import java.util.Scanner;


public class GasMileage{

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int miles_driven = 0;
		int gallons_used = 0;
        	int totalMiles = 0;
        	int totalGallons = 0;

		System.out.println("Enter the miles driven and gallons used for each trip (enter -1 to stop):");


        while (miles != -1) {
            System.out.print("Miles driven: ");
            miles = input.nextInt();
            
            if (miles == -1) {
                break;
            }
            
            System.out.print("Gallons used: ");
            int gallons = input.nextInt();
            
            double mpg = (double) miles / gallons;
            System.out.printf("Miles per gallon for this trip: %.2f%n", mpg);
            
            totalMiles += miles;
            totalGallons += gallons;
            
            double totalMpg = (double) totalMiles / totalGallons;
            System.out.printf("Combined miles per gallon: %.2f%n", totalMpg);
        }
    }
}
