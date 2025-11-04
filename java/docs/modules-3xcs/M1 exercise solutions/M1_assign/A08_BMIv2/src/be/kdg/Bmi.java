package be.kdg;

import java.util.Scanner;

public class Bmi {

	public static void main(String[] args) {
		//declarations:
		Scanner keyboard = new Scanner(System.in);
		int weight;
		double length;
		double bmi;

		//input:
		System.out.println("Dear patient, this programma will calculate your BMI.");
		System.out.print("Enter your weight in kilograms: ");
		weight = keyboard.nextInt();
		System.out.print("Enter your length in meters: ");
		length = keyboard.nextDouble();
		//calculate and display:
		bmi = weight / (length * length);
		System.out.println("Your BMI is: " + bmi);
		//advise
		System.out.print("Your BMI class is: ");
		if (bmi < 18) {
			System.out.println("underweighted.");
		} else if (bmi < 25) {
			System.out.println("healthy weight.");
		} else if (bmi < 30) {
			System.out.println("overweighted.");
		} else {
			System.out.println("obese.");
		}
	}
}
