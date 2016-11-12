package tests;

import static org.junit.Assert.*;

import org.junit.Test;


import medods.ArraysConcat;

public class ArraysConcatTest {

	@Test	
	public void concatArrays() throws Exception {
	int[] array1 = {1, 2, 3};
	int[] array2 = {4,5,6};
	int[] resArr = {1, 2, 4, 5, 6, 3};
	assertArrayEquals(resArr, ArraysConcat.concatArray(array1,array2, 2));
	
	}

}
