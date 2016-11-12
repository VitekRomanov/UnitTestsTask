package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import medods.SquareMatrixCreator;

public class SquareMatrixCreatorTest {

    @Test
    public void createMatrix(){
    int[][] testMatrix ={
                            { 1, 2, 3},
                            { 3, 2, 1},
                            { 1, 2, 3},
                        };
      assertArrayEquals(testMatrix, SquareMatrixCreator.createSquareMatrix(3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void createZeroMatrix() throws Exception {
    	SquareMatrixCreator.createSquareMatrix(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void createNegativeMatrix() throws Exception {
    	SquareMatrixCreator.createSquareMatrix(-3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void createOneMatrix() throws Exception {
    	SquareMatrixCreator.createSquareMatrix(1);
    }

}
