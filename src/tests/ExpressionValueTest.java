package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import medods.ExpressionValue;

public class ExpressionValueTest {

	 @Test
	    public void calculateValueZeroConditions(){
	       assertTrue("Test data 0, 0 , 0 expected Result NaN", ExpressionValue.calculateValue(0, 0, 0).isNaN());
	    }

	    @Test
	    public void calculateValueInfinite(){
	        assertTrue("Test data 1, 0 , 0 expected result +Infinite", ExpressionValue.calculateValue(1, 0, 0).isInfinite());
	    }

	    @Test
	    public void calculateValueInfiniteTwo(){
	        assertTrue("Test data 0, 1, 0 expected result +Infinite", ExpressionValue.calculateValue(0, 1, 0).isInfinite());
	    }

	    @Test
	    public void calculateValueNaN(){
	        assertTrue("Test data 0, 0, 1 expected result NaN", ExpressionValue.calculateValue(0, 0, 1).isNaN());
	    }

	    @Test
	    public void calculateValuePositive(){
	        assertTrue("Test data 1, 1, 0 expected result 2.0", ExpressionValue.calculateValue(1, 1, 0).equals(2.0));
	    }
	

}
