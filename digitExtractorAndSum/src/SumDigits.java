public class SumDigits {

    // Method to add up all the digits in a number.
    public static int sumDigits(long n) {
        int sum = 0; // Start with a sum of 0.
        // Continue as long as there are digits left in the number.
        while (n > 0) {
            sum += n % 10; // Add the last digit of 'n' to 'sum'.
            n /= 10;       // Remove the last digit from 'n'.
        }
        // Return the total sum of all digits.
        return sum;
    }

    // The main method where the program starts running.
    public static void main(String[] args) {
        // A number to test our digit-summing method.
        long testNumber = 234;
        // Call the method to sum the digits and store the result in 'sum'.
        int sum = sumDigits(testNumber);
        // Print out the result.
        System.out.println("The sum of the digits in " + testNumber + " is " + sum);
    }
}
