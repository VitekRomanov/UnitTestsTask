package medods;



public class ArraysConcat {
	
    public static int[] concatArray(int[] arr1, int[] arr2,int k)throws IllegalArgumentException{
    	
    	int arr1Lenght = arr1.length;
    	int arr2Lenght = arr2.length;
    	
    	if (k>arr1Lenght)  throw new IllegalArgumentException("k mast be < Arrays lenght");
    		
    	int[] newArr = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0,newArr, 0, k);
        System.arraycopy(arr2, 0, newArr,k,arr2Lenght);
        System.arraycopy(arr1,k,newArr,k+arr2Lenght,arr1Lenght-k);
		return newArr;
	}
	public static void main(String args[]){
		int[] arr1={1,2,3};
		int[] arr2={11,22,33};
		int c [] = ArraysConcat.concatArray(arr1,arr2, 2);
		
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]+" ");
		}
	}
}
