## junit-insurance-program

This Java program contains an Insurance program that is refactored to run an efficient JUnit Test suite.

Four Classes and Class Tests have been created :
runnerTestSuite runs the test suite.
Main, mainClassTest
Accident, accidentClassTest
Age, ageClassTest
Calculator, calculatorClassTest


Annotations:	
@BeforeAll - runnerClassTest
@BeforeEach - ageClassTest, mainClassTest, calculatorClassTest			
@Test - each ClassTest
@ParameterizedTest - accidentClassTest
@Timeout - ageClassTest 
@AfterAll - runnerClassTest
@AfterEach - ageClassTest, mainClassTest, calculatorClassTest 
Exceptions:
IllegalArgumentExceptionTest - mainClassTest
NullPointerExceptionTest - mainClassTest
