package ie.gmit.dip;

/*
* Method to determine any accident premium that applies 
*
*/

public class Accident {

	public static int AccidentCalculator(int accidents) {
		int accidentPremium = 0;

		switch (accidents) {
		case 0:
			accidents = 0;
			accidentPremium = 0;
			break;
		case 1:
			accidents = 1;
			accidentPremium = 50;
			break;
		case 2:
			accidents = 2;
			accidentPremium = 125;
			break;
		case 3:
			accidents = 3;
			accidentPremium = 225;
			break;
		case 4:
			accidents = 4;
			accidentPremium = 375;
			break;
		case 5:
			accidents = 5;
			accidentPremium = 575;
			break;
		}

		return accidentPremium;

	}
}