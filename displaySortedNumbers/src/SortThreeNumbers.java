import java.util.Scanner;

public class SortThreeNumbers {

    public static void main(String[] args) {
        // Set up a way to retrieve user input
        Scanner input = new Scanner(System.in);

        // Ask the user to enter three numbers
        System.out.print("Enter three numbers: ");
        double num1 = input.nextDouble(); // Retrieve the first number
        double num2 = input.nextDouble(); // Retrieve the second number
        double num3 = input.nextDouble(); // Retrieve the third number

        // Call the method to sort and display the numbers
        displaySortedNumbers(num1, num2, num3);
    }

    public static void displaySortedNumbers(double num1, double num2, double num3) {
        // Create an array with the three numbers
        double[] numbers = {num1, num2, num3};

        // Sort the numbers in the array from smallest to largest
        java.util.Arrays.sort(numbers);

        // Display the sorted numbers
        System.out.println("Numbers in increasing order: " + numbers[0] + ", " + numbers[1] + ", " + numbers[2]);
    }
}
