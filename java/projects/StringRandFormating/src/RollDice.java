import java.util.Random;

/**
 * Simple program to simulate rolling a dice.
 * Demonstrates the use of the Random class in Java.
 */
public class RollDice {
    public static void main(String[] args) {
        // Create an instance of the Random class
        Random rand = new Random();

        // Generate a random number between 1 and 6
        // rand.nextInt(6) generates values from 0 to 5
        // Adding +1 shifts the range to 1–6
        int dice = rand.nextInt(6) + 1;

        // Print the result to the console
        System.out.println("🎲 You rolled a: " + dice);
    }
}
