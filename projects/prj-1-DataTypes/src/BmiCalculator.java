    import java.util.Scanner;   // used for input

    public class BmiCalculator {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in); // we define scanner object

            // Ask for user input
            System.out.print("Enter your weight in kilograms: ");
            double weight = input.nextDouble();

            System.out.print("Enter your height in meters: ");
            double height = input.nextDouble();

            // Calculate BMI
            double bmi = weight / (height * height);  // bmi = 90 / (height * height)

            // Print result
            System.out.printf("Your BMI is: %.2f%n", bmi);

            // Interpretation (optional)
            if (bmi < 18.5) {
                System.out.println("You are underweight.");
            } else if (bmi < 25) {
                System.out.println("You are normal weight.");
            } else if (bmi < 50) {
                System.out.println("You are overweight.");
            } else {
                System.out.println("You are obese.");
            }

            input.close();
        }
    }

