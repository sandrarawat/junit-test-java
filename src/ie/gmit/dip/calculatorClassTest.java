package ie.gmit.dip;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



/*
* testCalculateInsurance uses assertEquals to determine CalculateInsurance method is calculating correct premiums
*/

class calculatorClassTest {
	
	public static Calculator calculator;
	@BeforeEach
	public void SetUp() {
		calculator = new Calculator();
			  
	}

	@AfterEach
	public void tearDown() throws Exception {
		System.gc();
	}
	

	@Test
	public void testCalculateInsurance_1() throws Exception {
		int agePremium = 500;
		int accidentPremium = 275;

		int result = Calculator.CalculateInsurance(agePremium, accidentPremium);
		assertEquals(775, result);
	}

	@Test
	public void testCalculateInsurance_2() throws Exception {
		int agePremium = 500;
		int accidentPremium = 275;

		int result = Calculator.CalculateInsurance(agePremium, accidentPremium);
		assertEquals(775, result);

	}

	@Test
	public void testCalculateInsurance_3() throws Exception {
		int agePremium = 600;
		int accidentPremium = 125;

		int result = Calculator.CalculateInsurance(agePremium, accidentPremium);
		assertEquals(725, result);

	}
	


}
