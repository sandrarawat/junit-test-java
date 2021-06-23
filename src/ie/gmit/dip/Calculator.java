package ie.gmit.dip;


/*
* Method to determine any total premium taking into account age and accidents
*
*/


public class Calculator {
	public static int CalculateInsurance(int agePremium, int accidentPremium) {
		int premium = 0;
		premium = (agePremium + accidentPremium);
	
		if (accidentPremium == 0) {
			System.out.println("No accident surcharge" + "\nTotal amount to pay: " + premium);
		} else {
			System.out.println(
					"Additional surcharge for accident: " + accidentPremium + "\nTotal amount to pay: " + premium);
		}
		return premium;

	}
}