package medods;

public class SummFisrtAndLast {
	
	public static boolean summOfPart (int a) throws IllegalArgumentException {
		 
		if (a > 9999 || a < 1000)
			throw new IllegalArgumentException("The namber mast have 4chars");
		
		return a%100==a/100;
		
	}
		
	public static void main(String args[]){
		System.out.println(SummFisrtAndLast.summOfPart(4446));
		System.out.println(1011%100);
	}
	
}
