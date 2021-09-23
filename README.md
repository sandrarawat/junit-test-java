# Insurance Program with JUnit testing

This Java program contains a refactored and encapsulated Insurance program with an efficient JUnit Test suite.

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
1. Install testing extension (eg. Test Runner for Java on VScode)
2. Open Test Explorer to shows all the test cases in the workspace
3. To run tests select the green play button, on specific classes or entire workspace. You can also right-click on the play button to see more options. Demonstrated below

  ![alt text](https://github.com/sandrarawat/junit-test-java/blob/main/testsuite.gif "Test Suite Gif")



