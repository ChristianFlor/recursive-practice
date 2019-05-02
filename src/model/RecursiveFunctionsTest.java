package model;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecursiveFunctionsTest {

	@Test
	void factorialTest() {
		assertTrue("Factorial 1 is not good", RecursiveFunctions.factorial(4) == 24);
		assertTrue("Factorial 2 is not good", RecursiveFunctions.factorial(8) == 40320);
		assertTrue("Factorial 3 is not good", RecursiveFunctions.factorial(10) == 3628800);
	}
	@Test
	void fibonacciTest() {
		assertTrue("Fibonacci 1 is not good",RecursiveFunctions.fibonacci(0)== 0 );
		assertTrue("Fibonacci 2 is not good",RecursiveFunctions.fibonacci(2)== 1 );
		assertTrue("Fibonacci 3 is not good",RecursiveFunctions.fibonacci(3)== 2 );
		assertTrue("Fibonacci 4 is not good",RecursiveFunctions.fibonacci(10)== 55 );
	}
	@Test
	void arraySummatoryTest() {
		assertTrue("arraySummatory 1 is not good",RecursiveFunctions.arraySummatory(new int[] {1,2,3,4,5,6,7,8,9,10}, 9)== 55 );
		assertTrue("arraySummatory 2 is not good",RecursiveFunctions.arraySummatory(new int[] {1,2,3,4}, 3)== 10 );
	}

}
