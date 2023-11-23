import java.util.Scanner;  // This tool helps read what you type.

public class App {

    // This is where the program starts working.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Set up the tool to read typing.
        double[] doubleValues = new double[10];  // Make space to store 10 numbers.

        // Ask to type 10 numbers.
        System.out.print("Enter ten double values: ");
        for (int i = 0; i < doubleValues.length; i++) {
            doubleValues[i] = input.nextDouble();  // Save each number typed.
        }

        // Calculate the average of the numbers typed.
        double averageValue = average(doubleValues);
        // Show the average number on the screen.
        System.out.println("The average value is: " + averageValue);
    }

    // This part figures out the average of a bunch of whole numbers.
    public static int average(int[] array) {
        int sum = 0;  // Start with a sum of 0.
        for (int value : array) {
            sum += value;  // Add each number to the sum.
        }
        return sum / array.length;  // Divide the total sum by the number of numbers to find the average.
    }

    // This part figures out the average of a bunch of decimal numbers.
    public static double average(double[] array) {
        double sum = 0;  // Start with a sum of 0.
        for (double value : array) {
            sum += value;  // Add each number to the sum.
        }
        return sum / array.length;  // Divide the total sum by the number of numbers to find the average.
    }
}
