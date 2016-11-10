package medods;

public class ExpressionValue {
	
    public static Double calculateValue(double a, double b, double c){
        double res = ((b + Math.sqrt(Math.pow(b, 2)+4*a*c))/
                (2*a)) - (Math.pow(a, 3)*c)+ Math.pow(b, - 2);
        return res;
    }

}
