package medods;

import java.util.Arrays;

public class MinMaxSumm {
	
    public static  float calculateMaxMinSumm(int a, int b, int c){
		float arr[] = {a, b, c};
        Arrays.sort(arr);
        return (arr[0]+arr[2]);
    }



}
