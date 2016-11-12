package medods;

public class DegreesInSign {
	
	public static int [] choseDegrees(int a,int b, int c){
		
        int arr[] = {a, b, c};
        if (arr[0]>=0) { arr[0]=arr[0]*arr[0];}
        else arr[0]=arr[0]*arr[0]*arr[0]*arr[0];
        
        if (arr[1]>=0) { arr[1]=arr[1]*arr[1];}
        else arr[1]=arr[1]*arr[1]*arr[1]*arr[1];
        
        if (arr[2]>=0) { arr[2]=arr[2]*arr[2];}
        else arr[2]=arr[2]*arr[2]*arr[2]*arr[2];
		return arr;
	}
	public static void main(String args[]){
		int[] c = DegreesInSign.choseDegrees(0,4, -4);
		System.out.println( c[0]);
		System.out.println( c[1]);
		System.out.println( c[2]);
	}
}
