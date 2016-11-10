package medods;

public class SummFisrtAndLast {
	
	public static boolean summOfPart (int a) throws IllegalArgumentException {
		 
		if (a > 9999 || a < 1000)
			throw new IllegalArgumentException("The namber mast have 4chars");
		int twoFirstNaber = a/100;
		int twoLastNaber = a%100;
		return (twoFirstNaber/10)+(twoFirstNaber%10)==(twoLastNaber/10)+(twoLastNaber%10);
		
	}
		
	public static void main(String args[]){
		System.out.println(SummFisrtAndLast.summOfPart(4646));
		System.out.println(1011%100);
	}
	
}
