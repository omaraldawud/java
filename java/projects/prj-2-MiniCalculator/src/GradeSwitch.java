import java.util.Scanner;

public class GradeSwitch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your numeric grade (0-100): ");
        int grade = scanner.nextInt();

        char letterGrade;

        switch (grade / 10) { // divide by 10 to get 0-10 scale
            case 10:
            case 9:
                letterGrade = 'A';
                break;
            case 8:
                letterGrade = 'B';
                break;
            case 7:
                letterGrade = 'C';
                break;
            case 6:
                letterGrade = 'D';
                break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                letterGrade = 'F';
                break;
            default:
                System.out.println("Invalid grade!");
                scanner.close();
                return;
        }

        System.out.println("Your letter grade is: " + letterGrade);
        scanner.close();
    }
}
