package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import medods.TriangleArea;

public class TriangleAreaTest {

    @Test
    public void calculateTriangleArea() {
    	double temp = TriangleArea.calculateArea(3,4);
        assertTrue("legs of Triangle (3, 4) and Area=", 6==temp);
    }

    @Test(expected = IllegalArgumentException.class)
    public void calculateTriangleAreaNegative() {
    	TriangleArea.calculateArea(-4,3);

    }

    @Test(expected = IllegalArgumentException.class)
    public void calculateTriangleAreaZero() {
    	TriangleArea.calculateArea(0,1);
    }

}
