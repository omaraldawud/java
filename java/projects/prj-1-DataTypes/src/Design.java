import java.util.Scanner;

public class Design {
    public static void main(String[] args) {
        // R1. read 2 numbers from user
        //  R1.1 name the numbers: num1 and num2
        //  R1.2 the number are integers
        // R2. print the numbers and their sum as follows:
        //  R2.1 name the sum of the 2 numbers sum
        // R3. the sum of num1 and num2 is sum

        int num1;
        int num2;
        int prod;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter Number 1: ");
        num1 = keyboard.nextInt();
        System.out.println("Enter Number 2: ");
        num2 = keyboard.nextInt();

        prod = num1 * num2;

        System.out.println("the product of " + num1 + " and " + num2 + " is: " + prod  );
    }
}
