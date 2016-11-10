package medods;

public class TriangleArea {
	
	public double calculateArea(double a, double b) throws IllegalArgumentException{
		
        if(a<=0||b<=0){
            throw new IllegalArgumentException("a and b must be > 0");
        }
        return  (a*b)/2;
    }

}
