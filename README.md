# JUnit Insurance Program

This Java program contains an Insurance program that is refactored to run an efficient JUnit Test suite.

## Classes and Test Classes

* runnerTestSuite runs the test suite.

* Main, mainClassTest

* Accident, accidentClassTest

* Age, ageClassTest

* Calculator, calculatorClassTest


## Annotations

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

## To Run:
1. Install testing extension (eg. Test Runner for Java on Visual Studio code)
2. Open Test Explorer 
3. Run tests as demonstarted: ![alt text](https://github.com/sandrarawat/junit-test-java/blob/main/testsuite.gif "Logo Title Text 1")



