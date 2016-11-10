package medods;

public class SummFisrtAndLast {
	
	public static boolean summOfPart (int a) throws IllegalArgumentException {
		 
		if (a > 9999 || a < 1000)
			throw new IllegalArgumentException("The number mast have 4chars");
		int twoFirstNubers = a/100;
		int twoLastNubers = a%100;
		return (twoFirstNubers/10)+(twoFirstNubers%10)==(twoLastNubers/10)+(twoLastNubers%10);
		
	}
		
	public static void main(String args[]){
		System.out.println(SummFisrtAndLast.summOfPart(4646));
		System.out.println(1011%100);
	}
	
}
