package medods;

public class BelongingToTheArea {
	
	public static boolean chekBelonging(float x, float y){
		
		return (x>=-4 && x<=4) && (y>=-3 && y<=0) || (x>=-2 && x<=2) && (y>=0 && y<=4);
		
	}

	public static void main(String args[]){
		System.out.println(BelongingToTheArea.chekBelonging(-4,4));
	}
	
}
