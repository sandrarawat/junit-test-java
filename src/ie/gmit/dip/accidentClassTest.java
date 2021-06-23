package ie.gmit.dip;

import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class accidentClassTest {
	 private Calculator calculator;

	@Test
	public void testAccidentCalculator_1()
		throws Exception {
		int accidents = 0;
		int result = Accident.AccidentCalculator(accidents);

		assertEquals(0, result );
	}


	@Test
	public void testAccidentCalculator_2()
		throws Exception {
		int accidents = 1;
		int result = Accident.AccidentCalculator(accidents);
	
		assertEquals(50, result);
	}


	@Test
	public void testAccidentCalculator_3()
		throws Exception {
		int accidents = 2;
		int result = Accident.AccidentCalculator(accidents);

		assertEquals(125, result);
	}


	@Test
	public void testAccidentCalculator_4()
		throws Exception {
		int accidents = 3;
		int result = Accident.AccidentCalculator(accidents);
		
		assertEquals(225, result);
	}


	@Test
	public void testAccidentCalculator_5() throws Exception {
		int accidents = 4;
		int result = Accident.AccidentCalculator(accidents);

		assertEquals(375, result);
	}


	@Test
	public void testAccidentCalculator_6()
		throws Exception {
		int accidents = 5;
		int result = Accident.AccidentCalculator(accidents);

		assertEquals(575, result);
	}


	/*
	 * The following ParameterizedTest below is a more efficient method in assessing results against expected 
	 */
	
	
	@ParameterizedTest
	@CsvSource({"0, 0", "1, 50", "2, 125", "3 , 225", "4, 375", "5, 575"})
	@Timeout(value = 10, unit = TimeUnit.MILLISECONDS)
	void testAccidentCalculator_7(int accidents, int expected) {
		
		int result = Accident.AccidentCalculator(accidents);
		assertEquals(result, expected);
	}


	public Calculator getCalculator() {
		return calculator;
	}


	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}


	
}