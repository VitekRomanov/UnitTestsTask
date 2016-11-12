package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import medods.SummFisrtAndLast;

public class SummFisrtAndLastTest {

	 @Test
	    public void EvenNumber() {
	       boolean temp = SummFisrtAndLast.summOfPart(6464);
	        assertTrue( "10==10", temp);
	    }

	    @Test
	    public void OddNumber() {
	    	boolean temp = SummFisrtAndLast.summOfPart(3621);
	        assertFalse("9 != 3 ",temp);
	    }
	    
	    @Test(expected = IllegalArgumentException.class)
	    public void isFourdigitNamber()  throws Exception{
	    	SummFisrtAndLast.summOfPart(123);
	       
	    }

}
