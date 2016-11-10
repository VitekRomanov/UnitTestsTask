package medods;

public class MultiplicityOfNumber {
	
	  public static int calculateArrayMultiplicity(int[] arr, int k){
	        int sum=0;
	        for (int i = 0; i < arr.length; i++){
	            if(arr[i]%k==0){
	                sum+=arr[i];
	            }
	        }
	        return sum;
	    }

	    public static void main(String[] args){
	        int[] arr = {-1, -2, -3};

	        System.out.println(calculateArrayMultiplicity(arr, 3));
	    }

}
