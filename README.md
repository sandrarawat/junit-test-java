# junit-insurance-program

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

![alt text](https://github.com/sandrarawat/junit-test-java/blob/main/testsuite.gif "Logo Title Text 1")
![](https://giphy.com/gifs/junit-testsuite-7NTOrlsUssnh6ImKQx)
