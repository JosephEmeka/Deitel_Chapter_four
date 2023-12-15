import java.util.Scanner;

public class TwoLargestNumbersFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 1;
        int largestOne = 0;
        int largestTwo = 0;

        while (counter <= 10) {
            System.out.print("Enter an integer: ");
            int number = input.nextInt();

            if (number > largestOne) {
                largestTwo = largestOne;
                largestOne = number;
            } else if (number > largestTwo) {
                largestTwo = number;
            }

            counter++;
        }

        System.out.println("The largest number is: " + largestOne);
        System.out.println("The second largest number is: " + largestTwo);

    }
}
