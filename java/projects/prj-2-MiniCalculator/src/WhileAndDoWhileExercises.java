public class WhileAndDoWhileExercises {
    public static void main(String[] args) {


        // ===============================
        // LEVEL 1 – BASIC COUNTING
        // ===============================

        // 1. Print numbers 1 to 10 using while loop
        // int i = 1;
        // while (i <= 10) {
        //     System.out.println(i);
        //     i++;
        // }

        // 2. Print numbers from 10 down to 1 using while loop
        // int j = 10;
        // while (j >= 1) {
        //     System.out.println(j);
        //     j--;
        // }

        // 3. Print even numbers between 1 and 20
        // int e = 2;
        // while (e <= 20) {
        //     System.out.println(e);
        //     e += 2;
        // }

        // 4. Print odd numbers between 1 and 15
        // int o = 1;
        // while (o <= 15) {
        //     System.out.println(o);
        //     o += 2;
        // }


        // ===============================
        // LEVEL 2 – USING VARIABLES AND CALCULATIONS
        // ===============================

        // 5. Sum numbers from 1 to 5
        // int sum = 0;
        // int num = 1;
        // while (num <= 5) {
        //     sum += num;
        //     num++;
        // }
        // System.out.println("Sum = " + sum);

        // 6. Find the factorial of 5
        // int fact = 1;
        // int n = 1;
        // while (n <= 5) {
        //     fact *= n;
        //     n++;
        // }
        // System.out.println("Factorial = " + fact);

        // 7. Calculate and print squares of numbers 1–10
        // int s = 1;
        // while (s <= 10) {
        //     System.out.println(s + " squared = " + (s * s));
        //     s++;
        // }


        // ===============================
        // LEVEL 3 – DO-WHILE LOOP
        // ===============================

        // 8. Print numbers 1–5 using do-while loop
        // int x = 1;
        // do {
        //     System.out.println(x);
        //     x++;
        // } while (x <= 5);

        // 9. Countdown from 5 to 1 using do-while loop
        // int y = 5;
        // do {
        //     System.out.println(y);
        //     y--;
        // } while (y >= 1);

        // 10. Repeat until user enters 0 (simulated with counter)
        // int counter = 3; // simulate user input decreasing
        // do {
        //     System.out.println("Looping... " + counter);
        //     counter--;
        // } while (counter > 0);
        // System.out.println("Loop ended!");

        // ===============================
        // CHALLENGE SECTION
        // ===============================

        // 11. Reverse a string using while loop
        // String word = "Java";
        // int index = word.length() - 1;
        // while (index >= 0) {
        //     System.out.print(word.charAt(index));
        //     index--;
        // }

        // 12. Print numbers between 1–50 divisible by both 3 and 5 using do-while
        // int k = 1;
        // do {
        //     if (k % 3 == 0 && k % 5 == 0) {
        //         System.out.println(k);
        //     }
        //     k++;
        // } while (k <= 50);
    }
}
