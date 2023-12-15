import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int item = 1; item <= 3; item++) {
            System.out.print("Enter citizen " + item + "'s name: ");
            String name = input.nextLine();
            System.out.print("Enter " + name + "'s earnings for the year: $");
            double earnings = input.nextDouble();

            double tax;
            if (earnings <= 30000) {
                tax = 0.15 * earnings;
            } else {
                tax = (0.15 * 30000) + (0.20 * (earnings - 30000));
            }

            System.out.println(name + "'s total tax for the year is: $" + tax);
            input.nextLine();
        }

    }
}
