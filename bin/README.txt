This Java program contains Insurance program (refactored)

Four Classes and Class Tests have been created :
Main, mainClassTest
Accident, accidentClassTest
Age, ageClassTest
Calculator, calculatorClassTest
runnerTestSuite runs the test suite.

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