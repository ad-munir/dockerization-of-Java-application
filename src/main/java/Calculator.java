import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    // Class fields
    double x;
    double y;
    double result;
    String op;

    // Method to perform the calculator operations
    public void calculate() {
        int exit = 0;

        while (exit == 0) {
            System.out.println("\nCalculator :");

            // Read the operator from the user
            op = readOperator();

            if (op.equals("0")) {
                // Exit the calculator loop if the user enters "0"
                exit = 1;
                break;
            }

            // Read operands from the user
            double[] operands = readOperands();
            x = operands[0];
            y = operands[1];

            // Perform the selected operation based on the operator
            switch (op) {
                case "+":
                    result = x + y;
                    break;
                case "-":
                    result = x - y;
                    break;
                case "*":
                    result = x * y;
                    break;
                case "/":
                    // Check for division by zero
                    if (y == 0) {
                        System.out.println("Error: The second operand must not be equal to 0!");
                        break;
                    }
                    result = x / y;
                    break;
                default:
                    System.out.println("Please enter a valid operator");
                    continue; // Go back to the beginning of the loop if the operator is invalid
            }

            // Display the result of the operation
            System.out.println("Result : " + result);
        }
    }

    // Method to read operands from the user
    public double[] readOperands() {
        double[] operands = new double[2];
        Scanner scanner = new Scanner(System.in);

        // Read the first operand
        System.out.print("Enter the first Operand: ");
        while (true) {
            try {
                operands[0] = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input for the first operand. Please enter a valid double value.");
                scanner.nextLine(); // Consume the invalid input from the buffer
            }
        }

        // Read the second operand
        System.out.print("Enter the second Operand: ");
        while (true) {
            try {
                operands[1] = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input for the second operand. Please enter a valid double value.");
                scanner.nextLine(); // Consume the invalid input from the buffer
            }
        }

        return operands;
    }

    // Method to read the operator from the user
    public String readOperator() {
        System.out.println("Please Choose the operation");
        System.out.println("'+' for addition:");
        System.out.println("'-' for subtraction:");
        System.out.println("'*' for multiplication:");
        System.out.println("'/' for division:");
        System.out.println("'0' to Exit:");

        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
