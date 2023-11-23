import java.util.Scanner;  // This is used to read what you type.
import java.util.LinkedHashSet;  // This helps remember numbers without repeating them.

public class removeDuplicates {

    // This is where the program starts.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // A tool to read what you type.
        int[] numbers = new int[10];  // A box to keep 10 numbers.

        // Asking you to type 10 numbers.
        System.out.print("Enter ten numbers: ");
        // Start counting from 0 and keep counting up until we reach 10.
        for (int i = 0; i < numbers.length; i++) {
            // Reading each number you type and putting it in the box.
            numbers[i] = input.nextInt();
        }

        // Removing any repeating numbers.
        int[] distinctNumbers = eliminateDuplicates(numbers);

        // Showing the numbers without any repeats.
        System.out.print("The distinct numbers are: ");
        for (int number : distinctNumbers) {
            // Writing out each number without repeats.
            System.out.print(number + " ");
        }
    }

    // A special magic box that takes out any repeats in your numbers.
    public static int[] eliminateDuplicates(int[] list) {
        // A special set that likes to keep things in order and doesn't like repeats.
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        // Looking at each number and putting it in the special set.
        for (int i = 0; i < list.length; i++) {
            // If it sees a number it already has, it ignores it.
            set.add(list[i]);
        }

        // Now, we take the numbers from the special set and put them back in a box.
        int[] result = new int[set.size()];
        int i = 0;  // We start at the beginning of the box.

        // Taking each number out of the special set and putting it in our box.
        for (Integer num : set) {
            // Putting each number into the box.
            result[i++] = num;
        }

        // Now we have a box of numbers with no repeats to give back.
        return result;
    }
}
