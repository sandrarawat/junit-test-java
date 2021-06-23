package ie.gmit.dip;


/*
* Method to determine premium taking age into account
*
*/

public class Age {
	public static int AgeCalculator(int age) {
		int agePremium = 0;
		int basicInsurance = 500;
		int surcharge = 100;
		
		if (age >= 25) {
			agePremium = basicInsurance;
		} else
			agePremium = basicInsurance + surcharge;

		return agePremium;

	}

}
