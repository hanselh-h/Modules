package sortedlinkedlistapp;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class SortedLinkedList {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);
        // Create a LinkedList to store integers
        LinkedList<Integer> numbers = new LinkedList<>();

        // Prompt the user to enter a list of integers
        System.out.println("Enter a list of integers, separated by spaces, and press enter when done:");
        // Read the input line and split it into individual numbers
        String[] inputNumbers = input.nextLine().split(" ");

        try {
            // Convert each string input to an integer and add it to the LinkedList
            for (String str : inputNumbers) {
                numbers.add(Integer.parseInt(str));
            }

            // Sort the LinkedList in ascending order
            Collections.sort(numbers);

            // Print the sorted linked list
            System.out.println("Sorted linked list: " + numbers);
        } catch (NumberFormatException e) {
            // Handle the case where the input is not a valid integer
            System.out.println("Invalid input. Please enter only integers.");
        } finally {
            // Close the Scanner to release system resources
            input.close();
        }
    }
}
