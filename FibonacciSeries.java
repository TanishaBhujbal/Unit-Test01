import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        // Create a Scanner object for taking input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of terms for the Fibonacci series
        System.out.print("Enter the number of terms for the Fibonacci series: ");
        int n = scanner.nextInt();

        // Close the scanner to prevent resource leak
        scanner.close();

        // Logic to generate Fibonacci series
        int firstTerm = 0, secondTerm = 1;

        // Check if the user wants at least one term
        if (n <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else if (n == 1) {
            System.out.println("Fibonacci series up to " + n + " term: ");
            System.out.println(firstTerm); // Only the first term
        } else {
            System.out.println("Fibonacci series up to " + n + " terms: ");
            // Print the first two terms
            System.out.print(firstTerm + ", " + secondTerm);

            // Generate and print the remaining terms
            for (int i = 3; i <= n; i++) {
                int nextTerm = firstTerm + secondTerm;
                System.out.print(", " + nextTerm);

                // Update the terms for the next iteration
                firstTerm = secondTerm;
                secondTerm = nextTerm;
            }
            System.out.println(); // Move to the next line after the series is printed
        }
    }
}

