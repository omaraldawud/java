import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        //declarations:
        int choice;
        double number1, number2;
        Scanner keyboard = new Scanner(System.in);

        //input:
        System.out.print("Enter a number: ");
        number1 = keyboard.nextDouble();
        System.out.print("Enter another number: ");
        number2 = keyboard.nextDouble();
        System.out.println("Choose an operation:\n" +
                "\t1 add\n" +
                "\t2 substract\n" +
                "\t3 multiply\n" +
                "\t4 divide");
        System.out.print("Your choice: ");
        choice = keyboard.nextInt();

        //calculate and output:
        if(choice == 1) { //add
            double result = number1 + number2;
            System.out.println(number1 + " + " + number2 + " = " + result);
        }
        if(choice == 2) { //substract
            double result = number1 - number2;
            System.out.println(number1 + " - " + number2 + " = " + result);
        }
        if(choice == 3) { //product
            double result = number1 * number2;
            System.out.println(number1 + " * " + number2 + " = " + result);
        }
        if(choice == 4) { //divide
            double result = number1 / number2;
            System.out.println(number1 + " / " + number2 + " = " + result);
        }
    }
}
