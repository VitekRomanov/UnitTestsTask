package tests;

import static org.junit.Assert.*;
import medods.DegreesInSign;

import org.junit.Test;

public class DegreesInSignTest {

	@Test
	public void testChoseDegrees() {
		int[] testArray = {0, 16, 256};
		
		assertArrayEquals(testArray, DegreesInSign.choseDegrees(0, 4, -4));
	}

}
