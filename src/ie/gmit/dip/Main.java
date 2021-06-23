package ie.gmit.dip;

import java.util.Scanner;


/*
* Main method which uses a scanner to get user input and extends age and calls Calculator and Accident classes to output results.
*
*/

public class Main extends Age {

	private static final int surcharge = 100;

	Scanner in;

	public static void main(String[] args) {
		int age;
		int accidents;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your age : ");
		age = in.nextInt();

		AgeCalculator(age);
		if (age >= 25) {
			System.out.println("No additional age surcharge");
		} else if (age <= 25) {
			System.out.println("Additional age surcharge: " + surcharge);
		}
		System.out.println("How many accidents did you have? ");

		accidents = in.nextInt();
		if (accidents >= 6) {
			System.out.println("No insurance");
		} else {
			Accident.AccidentCalculator(accidents);

			Calculator.CalculateInsurance(AgeCalculator(age), Accident.AccidentCalculator(accidents));
		}
		in.close();
	}
}