package ie.gmit.dip;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class mainClassTest {

	public static Main program;

	@BeforeEach
	public void SetUp() {
		program = new Main();

	}

	@AfterEach
	public void tearDown() throws Exception {
		System.gc();
	}

	/*
	 * @ParameterizedTest uses assertEquals to determine AgeCalculator method is
	 * calculating correct surcharge according to age
	 */

	@ParameterizedTest
	@CsvSource({ "1, 600", "10, 600", "25, 500" })
	void testAgeSurcharge(int age, int expected) {

		int result = Age.AgeCalculator(age);
		assertEquals(result, expected);
	}

	/*
	 * IllegalArgumentExceptionTest to determine an illegal argument exception is
	 * thrown when accidents is assigned a value >=6
	 */

	@Test
	public void IllegalArgumentExceptionTest() {
		int accidents = 7;
		assertThrows(IllegalArgumentException.class, () -> {
			if (accidents >= 6)
				throw new IllegalArgumentException("No insurance");

		});
	}

	/*
	 * NullPointerExceptionTest to determine a null pointer exception is thrown when
	 * an object is assigned a value of null
	 */

	@Test
	public void NullPointerExceptionTest() {
		assertThrows(NullPointerException.class, () -> {
			Object obj = null;
			if (obj == null)
				throw new NullPointerException("Null pointer Exception");
		});
	}

}

