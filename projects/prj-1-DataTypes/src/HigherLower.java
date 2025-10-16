import java.util.Scanner;

public class HigherLower {
	public static void main(String[] args) {
		int guess;      // not init value
		int secret = 56;        // declaration and init.
		int counter = 0;
		Scanner keyboard = new Scanner(System.in);
		while (true) {
			System.out.print("Enter a number: ");
			guess = keyboard.nextInt();
			counter = counter + 1;
			if (guess == secret) {
				System.out.print(
					"Congratulations, you used " + counter + " guesses to find the right number!");
				return;
			}
			if (guess < secret) {
				System.out.print("Higher! ");
			}
			if (guess > secret) {
				System.out.print("Lower! ");
			} //end if
		} //end while
	}//end main
}//end class
