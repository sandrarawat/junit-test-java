package ie.gmit.dip;

import org.junit.runner.RunWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;


@RunWith(JUnitPlatform.class)
@SelectClasses({ mainClassTest.class, accidentClassTest.class, ageClassTest.class, calculatorClassTest.class

})
class runnerTestSuite {
	public static runnerTestSuite runner;

	@BeforeAll
	public void setUpBeforeClass() throws Exception {
		runner = new runnerTestSuite();

	}

	@AfterAll
	static void tearDownAll() {
		System.exit(0);
	}

}

