package ie.gmit.dip;

import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

class ageClassTest {

	public static Age age;

	@BeforeEach
	public void SetUp() {
		age = new Age();

	}

	@AfterEach
	public void tearDown() throws Exception {
		System.gc();
	}

	/*
	 * This testAgeCalculator to determine the correct surcharge applies if aged //
	 * under 25
	 */

	@Test
	public void testAgeCalculator() throws Exception {
		int age = 24;
		int result = Age.AgeCalculator(age);

		assertEquals(600, result);
	}
	/*
	 * This timeout test is accompanied by an if statement , change timeout value to
	 * 1 in order to timeout
	 */

	@Test
	@Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
	public void testAgeCalculatorTimeout() throws InterruptedException {
		for (int i = 0; i < 10; i++) {
			int age = 25;
			int result = Age.AgeCalculator(age);

			assertEquals(500, result);
		}
	}

}
