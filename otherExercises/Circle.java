import java.lang.Math;

public class Circle implements Shape{
    private double r;
    
    public Circle(double radius){
        
        r = radius;
        
    }
    public double getRadius(){
        return r;
    }
    
    public double areaOfShape(){
        return Math.PI*(r*r);
    }
    

}
