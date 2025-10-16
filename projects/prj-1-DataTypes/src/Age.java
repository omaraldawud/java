import java.time.LocalDate;
import java.util.Scanner;

/**
 * Student Name: Suliman AR
 * Date:
 * Assignment Number: 1
 *
 * This program reads 2 numbers (num1, num2) and prints the product of these numbers
 * ## Input: num1, num2
 * ## Output: prod
 */
public class Age {
	public static void main(String[] args) {
        // Declarations
		String name;
		int birthYear;
		int currentYear;
		int age;
		Scanner keyboard = new Scanner(System.in);

		//algorithm:
		System.out.print("Please enter your name: ");
		name = keyboard.nextLine();
		System.out.print("Dear " + name + ", please enter the year you were born: ");
		birthYear = keyboard.nextInt();
		//get current year from systemtime:
		currentYear = LocalDate.now().getYear(); // 2025
		//Calculate and display:
		age = currentYear - birthYear; // 2025 - 1966 = 59
		System.out.println("If all goes well you'll be  " + age + " by the end of the year.");
	}
}
