import java.util.Scanner;

public class ReadName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   // create Scanner object
        System.out.print("Enter your name: ");
        String name = sc.nextLine();           // read user input
        System.out.println("Your name is: " + name); // print it
    }
}

