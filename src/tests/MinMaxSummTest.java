package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import medods.MinMaxSumm;

public class MinMaxSummTest {

	@Test
    public void calculateMaxMinPositive() {
        assertTrue("array[{2}{2}{3}] expect 2+3=5 ", 5==MinMaxSumm.calculateMaxMinSumm(2, 2, 3));
    }

    @Test
    public void calculateMaxMinNegative() {
        assertTrue("array[{-4}{-2}{-3}] expect -4+(-2) ", -6==MinMaxSumm.calculateMaxMinSumm(-4, -2, -3));
    }


}
