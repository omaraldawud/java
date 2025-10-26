public class ForLoopExercises {
    public static void main(String[] args) {

        // ===============================
        // LEVEL 1 – BASIC COUNTING
        // ===============================

        // 1. Print numbers 1 to 10
          for (int i = 1; i <= 10; i++) {
              System.out.println(i);
          }

        // 2. Print numbers from 10 down to 1
        // for (int i = 10; i >= 1; i--) {
        //     System.out.println(i);
        // }

        // 3. Print only even numbers between 1 and 20
        // for (int i = 2; i <= 20; i += 2) {
        //     System.out.println(i);
        // }

        // 4. Print only odd numbers between 1 and 15
        // for (int i = 1; i <= 15; i += 2) {
        //     System.out.println(i);
        // }


        // ===============================
        // LEVEL 2 – USING VARIABLES AND CALCULATIONS
        // ===============================

        // 5. Sum numbers from 1 to 5
        // int sum = 0;
        // for (int i = 1; i <= 5; i++) {
        //     sum += i;
        // }
        // System.out.println("Sum = " + sum);

        // 6. Find the factorial of 5
        // int fact = 1;
        // for (int i = 1; i <= 5; i++) {
        //     fact *= i;
        // }
        // System.out.println("Factorial = " + fact);

        // 7. Calculate and print squares of numbers 1–10
        // for (int i = 1; i <= 10; i++) {
        //     System.out.println(i + " squared = " + (i * i));
        // }


        // ===============================
        // LEVEL 3 – NESTED FOR LOOPS
        // ===============================

        // 8. Print multiplication table for 5
        // for (int i = 1; i <= 10; i++) {
        //     System.out.println("5 x " + i + " = " + (5 * i));
        // }

        // 9. Print multiplication tables for 1–3
        // for (int i = 1; i <= 3; i++) {
        //     System.out.println("Table of " + i);
        //     for (int j = 1; j <= 10; j++) {
        //         System.out.println(i + " x " + j + " = " + (i * j));
        //     }
        //     System.out.println();
        // }

        // 10. Print a simple triangle of stars
        // for (int i = 1; i <= 5; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }


        // ===============================
        // CHALLENGE SECTION
        // ===============================

        // 11. Reverse a string using a for loop
        // String word = "Hello";
        // for (int i = word.length() - 1; i >= 0; i--) {
        //     System.out.print(word.charAt(i));
        // }

        // 12. Print numbers between 1–50 divisible by both 3 and 5
        // for (int i = 1; i <= 50; i++) {
        //     if (i % 3 == 0 && i % 5 == 0) {
        //         System.out.println(i);
        //     }
        // }
    }


}
