import java.util.Random;
import java.util.Scanner;

public class DiceAndCoinGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        String choice;

        System.out.println("🎮 Welcome to the Dice and Coin Simulator!");
        System.out.println("------------------------------------------");

        do {
            System.out.println("\nChoose an option:");
            System.out.println("1. Flip a coin");
            System.out.println("2. Roll a dice");
            System.out.print("Enter your choice (1 or 2): ");

            int option = input.nextInt();


            switch (option) {
                case 1:
                    boolean isHeads = rand.nextBoolean();
                    String coinResult = isHeads ? "Heads" : "Tails";
                    System.out.println("🪙 The coin shows: " + coinResult);
                    break;

                case 2:
                    int dice = rand.nextInt(6) + 1; // 1 to 6
                    System.out.println("🎲 You rolled a: " + dice);
                    break;

                default:
                    System.out.println("❌ Invalid option. Please enter 1 or 2.");
            }

            System.out.print("\nDo you want to play again? (Y/N): ");
            choice = input.nextLine();

        } while (!choice.equalsIgnoreCase("n"));

        System.out.println("\n👋 Thanks for playing!");
        input.close();
    }
}
