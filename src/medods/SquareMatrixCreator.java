package medods;

public class SquareMatrixCreator {
	
	public static int [][] createSquareMatrix(int n)throws IllegalArgumentException{
		
		if (n<2){
			throw new IllegalArgumentException("n must be > 2");
        }
		
        else {
        	
            int[][] matrix = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (i % 2 == 0) {
                        matrix[i][j - 1] = j;
                    } else {
                        matrix[i][j - 1] = n - j + 1;
                    }
                }
            }
            return matrix;
        }
    }
	public static void main(String args[]){
		int [][] c = SquareMatrixCreator.createSquareMatrix(3);
		for (int i = 0; i < 3; i++) {
		    for (int j = 0; j < 3; j++) {
		        System.out.print(c[i][j] + "\t");
		    }
		    System.out.println();
		}
	}
}

