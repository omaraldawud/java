/*
 * Java Exam - Variables, Operators, Loops, and Control Flow
 * ---------------------------------------------------------
 * Instructions:
 * 1. Open this project in IntelliJ IDEA.
 * 2. Run this program to see the intro message.
 * 3. Complete each question where indicated by "Answer here".
 * 4. Do not change the method signatures.
 * 5. Submit the completed project as instructed by your teacher.
 */

public class ExamMain {

    public static void main(String[] args) {
        System.out.println("Welcome to the Java Exam!");
        System.out.println("Follow the instructions in the comments to answer questions.\n");

        // Q1: Variables and Operators
        // Declare two integer variables a=10 and b=3, then print their sum, difference, product, and quotient.
        int a = 10;  // Answer here
        int b = 3;   // Answer here

        System.out.println("Q1 Results:");
        System.out.println("Sum: " + (a + b));        // Answer here
        System.out.println("Difference: " + (a - b)); // Answer here
        System.out.println("Product: " + (a * b));    // Answer here
        System.out.println("Quotient: " + (a / b));   // Answer here

        // Q2: Increment/Decrement
        // Using a and b, show the result of ++a, b--, and a+b
        int result = 0; // Answer here
        System.out.println("\nQ2 Results:");
        System.out.println("Result after ++a and b--: " + result);

        // Q2.1: Increment/Decrement and Operator Precedence
        // Using a and b, compute the following expression and print the result:
        //    result = ++a + b-- - a++;
        // Explain in comments what happens at each step.

        int incrementResult = ++a + b-- - a++; // Answer here

        System.out.println("\nQ2 Results:");
        System.out.println("Result after '++a + b-- - a++' is: " + incrementResult);
        System.out.println("Value of a after the expression: " + a);
        System.out.println("Value of b after the expression: " + b);


        // Q3: Boolean expressions
        // Declare boolean variables x and y. Assign true to x and false to y.
        // Print the result of x && y, x || y, and !x
        boolean x = true;  // Answer here
        boolean y = false; // Answer here

        System.out.println("\nQ3 Results:");
        System.out.println("x && y = " + (x && y));  // Answer here
        System.out.println("x || y = " + (x || y));  // Answer here
        System.out.println("!x = " + (!x));          // Answer here

        // Q4: Loops
        // Use a for loop to print numbers from 1 to 5
        System.out.println("\nQ4 Results:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);  // Answer here
        }

        // Q5: If ... Else
        // Check if a is greater than b and print an appropriate message
        System.out.println("\nQ5 Results:");
        if (a > b) {  // Answer here
            System.out.println(a + " is greater than " + b);
        } else {
            System.out.println(a + " is not greater than " + b);
        }

        // Q6: Switch
        // Declare an int variable day=3. Use a switch statement to print the day of the week
        int day = 3; // Answer here

        System.out.println("\nQ6 Results:");
        switch (day) {  // Answer here
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }

        System.out.println("\nExam completed. Make sure to save your changes!");
    }
}
