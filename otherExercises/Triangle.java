



import java.lang.Math;

public class Triangle implements Shape{
    private double sideA;
    private double sideB;
    private double sideC;
    
    
    public Triangle(double a, double b, double c)  {
        if(a+b < c || a+c < b || b+c < a){
            throw new IllegalShapeParameterException();
        }
        
        sideA = a;
        sideB = b;
        sideC = c;
        
    }
    
    public double areaOfShape(){
        double p = (sideA+sideB+sideC)/2;
        return Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
    }
    

}
    