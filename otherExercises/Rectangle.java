public class Rectangle implements Shape{
    private double sideA;
    private double sideB;
    
    public Rectangle(double a, double b){
        
        sideA = a;
        sideB = b;
    }
    
    public double areaOfShape(){
        return sideA*sideB;
    }
    
    public Rectangle shapeFactory(int angles){
        if(angles == Angles.RECTANGLE.getValue()){
            return new Rectangle(sideA,sideB);
        }
        return null;
    }
}

