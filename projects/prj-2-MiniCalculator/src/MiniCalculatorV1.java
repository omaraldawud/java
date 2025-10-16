import java.util.Scanner;

public class MiniCalculatorV1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PI = 3.14159;
        boolean running = true;

        while (running) {
            System.out.println("1. Add\n2. Subtract\n3. Area of Circle\n4. Exit");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Enter two numbers:");
                double a = sc.nextDouble(), b = sc.nextDouble();
                System.out.println("Result: " + (a + b));
            } else if (choice == 3) {
                System.out.println("Enter radius:");
                double r = sc.nextDouble();
                System.out.println("Area = " + (PI * r * r));
            } else if (choice == 4) {
                running = false;
            } else {
                System.out.println("Invalid choice.");
            }
        }

        sc.close(); // Good practice to close the scanner
    }
}


