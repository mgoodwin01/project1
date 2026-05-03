import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Ask the user for two numbers
        System.out.print("Enter the first number (x): ");
        double x = input.nextDouble();

        System.out.print("Enter the second number (y): ");
        double y = input.nextDouble();

        // Perform arithmetic operations
        double addition = x + y;
        double subtraction = x - y;
        double multiplication = x * y;
        double division = x / y;

        // Display results
        System.out.println("\n--- Arithmetic Results ---");
        System.out.println("Addition (x + y): " + addition);
        System.out.println("Subtraction (x - y): " + subtraction);
        System.out.println("Multiplication (x * y): " + multiplication);
        System.out.println("Division (x / y): " + division);
    }
}
