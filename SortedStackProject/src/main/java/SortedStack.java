import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

/**
 * The SortedStack class reads a list of integers from the user,
 * sorts them, and stores them in a stack.
 */
public class SortedStack {

    /**
     * The main method that executes the program.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        // Create a Scanner object for reading input
        Scanner input = new Scanner(System.in);

        // Create a Stack to store the integers
        Stack<Integer> numbers = new Stack<>();

        // Prompt the user to enter a list of integers
        System.out.println("Enter a list of integers, separated by spaces, and press enter when done:");
        String[] inputNumbers = input.nextLine().split(" ");

        // Parse the input strings into integers and add them to the stack
        for (String str : inputNumbers) {
            numbers.add(Integer.parseInt(str));
        }

        // Sort the stack (internally it works as a Vector)
        Collections.sort(numbers);

        // Transfer sorted elements to a new stack for clarity
        Stack<Integer> sortedStack = new Stack<>();
        for (Integer number : numbers) {
            sortedStack.push(number);
        }

        // Output the sorted stack
        System.out.println("Sorted stack: " + sortedStack);
    }
}
