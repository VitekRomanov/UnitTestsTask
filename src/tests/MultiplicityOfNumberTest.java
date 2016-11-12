package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import medods.MultiplicityOfNumber;

public class MultiplicityOfNumberTest {

	   @Test
	    public void calculateMultiplicitySummPositive() {
	        int[] testArray = {1, 2, 3, 5, 8, 13, 21};
	        int k = 3;
	        assertTrue("Test data {1, 2, 3, 5, 8, 13, 21  k = 3",
	                24==MultiplicityOfNumber.calculateArrayMultiplicity(testArray, k));
	    }

	    @Test
	    public void calculateMultiplicitySummNegative() {
	        int[] testArray = {-1, -2, -3, -5, -8, -13, -21 };
	        int k = 3;
	        assertTrue("Test data {-1, -2, -3, -5, -8, -13, -21}, k = 3",
	                -24==MultiplicityOfNumber.calculateArrayMultiplicity(testArray, k));
	    }

}
