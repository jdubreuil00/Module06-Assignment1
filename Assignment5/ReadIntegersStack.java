package Assignment5;
import java.util.Collections;
import java.util.Stack;
import java.util.Scanner;

/**
 * This program reads a list of integers from the user and outputs the sorted list using a Stack for Java Collections.
 */
public class ReadIntegersStack {

    /**
     * The main method where the program execution begins. Tells the user to input an integer one at a time. If the user presses return or enter without entering an integer the program outputs the list of integers sorted from smallest to largest.
     *
     * @param args The command-line arguments.
     */
    public static void main(String[] args){
        //Scanner to take in user input.
        Scanner scanner = new Scanner(System.in);
        //Using a Stack from Java Collections that stores the list of integers
        Stack<Integer> stackIntegers = new Stack<>();

        //Prompt gives the user initial instructions.
        System.out.println("Enter a list of integers. Press enter or return when finished.");

        //While loop allows the user to input an integer. If the user enters some other input it gives and error and asks for the correct input. If the user presses enter without entering an input the while loop breaks.
        while(true){
            System.out.print("Enter an integer or press enter again to view list: ");
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                // User pressed Enter without typing, end input.
                break;
            }
            //Checks the input. If it is a valid integer it gets added to the Stack. If not the user is prompted for valid input.
            try {
                int num = Integer.parseInt(input);
                stackIntegers.push(num);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }

        //Collections method sorts the Stack stack Integers.
        Collections.sort(stackIntegers);

        //Outputs Stack of sorted integers
        System.out.println("Here is the list of sorted integers: " + stackIntegers);
        //Closes scanner input.
        scanner.close();

    }
}
