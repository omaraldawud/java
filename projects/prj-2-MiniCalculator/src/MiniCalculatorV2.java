
import java.util.Scanner;

public class MiniCalculatorV2 {
    static final double PI = 3.14159;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            int choice = showMenu(sc);
            switch (choice) {
                case 1 -> System.out.println("Result: " + add(sc));
                case 2 -> System.out.println("Result: " + subtract(sc));
                case 3 -> System.out.println("Area = " + areaOfCircle(sc));
                case 4 -> running = false;
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    public static int showMenu(Scanner sc) {
        System.out.println("1. Add\n2. Subtract\n3. Area of Circle\n4. Exit");
        return sc.nextInt();
    }
/push
    public static double add(Scanner sc) {
        System.out.println("Enter two numbers:");
        return sc.nextDouble() + sc.nextDouble();
    }

    public static double subtract(Scanner sc) {
        System.out.println("Enter two numbers:");
        return sc.nextDouble() - sc.nextDouble();
    }

    public static double areaOfCircle(Scanner sc) {
        System.out.println("Enter radius:");
        double r = sc.nextDouble();
        return PI * r * r;
    }
}
