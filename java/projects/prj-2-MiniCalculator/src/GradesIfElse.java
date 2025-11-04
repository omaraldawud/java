import java.util.Scanner;

    public class GradesIfElse {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter your numeric grade (0-100): ");
            int grade = scanner.nextInt();

            char letterGrade;

            if (grade >= 90 && grade <= 100) {
                letterGrade = 'A';
            } else if (grade >= 80) {
                letterGrade = 'B';
            } else if (grade >= 70) {
                letterGrade = 'C';
            } else if (grade >= 60) {
                letterGrade = 'D';
            } else if (grade >= 0) {
                letterGrade = 'F';
            } else {
                System.out.println("Invalid grade!");
                scanner.close();
                return;
            }

            System.out.println("Your letter grade is: " + letterGrade);
            scanner.close();
        }
    }

