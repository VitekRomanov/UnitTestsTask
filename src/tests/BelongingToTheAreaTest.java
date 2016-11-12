package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import medods.BelongingToTheArea;

public class BelongingToTheAreaTest {

	    @Test
	    public void checkAreaYMinLimit() {
	        assertFalse("y=-4 accepted", BelongingToTheArea.chekBelonging(-4,-4));
	    }

	    @Test
	    public void checkAreaXMinLimit() {
	        assertFalse("x=-5 accepted", BelongingToTheArea.chekBelonging(-5,-3));
	    }

	    @Test
	    public void checkAreaYMaxLimit() {
	        assertFalse("y=5 accepted", BelongingToTheArea.chekBelonging(4,5));
	    }

	    @Test
	    public void checkAreaXMaxLimit() {
	        assertFalse("x=5 accepted", BelongingToTheArea.chekBelonging(5,4));
	    }
	    
	    @Test
	    public void checkAreaAxisOXLeft() {
	        assertTrue("It not belongs to the area", BelongingToTheArea.chekBelonging(-2,0));
	    }
	    
	    @Test
	    public void checkAreaAxisOXRight() {
		    assertTrue("It not belongs to the area", BelongingToTheArea.chekBelonging(2,0));
	    }
	    
	    @Test
	    public void checkAreaZeroConditions() {
	        assertTrue("zero coord", BelongingToTheArea.chekBelonging(0,0));
	    }
	
}
