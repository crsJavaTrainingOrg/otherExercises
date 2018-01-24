import java.lang.Math;

public class Circle implements Shape{
    private double r;
    
    public Circle(double radius){
        
        r = radius;
        
    }
    
    public double areaOfShape(){
        return Math.PI*(r*r);
    }
    
    public Circle shapeFactory(int angles){
        if(angles == Angles.CIRCLE.getValue()){
            return new Circle(r);
        }
        return null;
    }
}
