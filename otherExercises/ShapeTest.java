public class ShapeTest{
    
    public static void test(){
        Triangle t = new Triangle(4,5,6);
        
        
        System.out.println("Area of triangle: " + t.areaOfShape());
        
        Rectangle r = new Rectangle(5,6);
        
        System.out.println("Area of rectangle : " + r.areaOfShape());
        
        Circle c = new Circle(5);
        
        
        System.out.println("Area of circle: " + c.areaOfShape());
        Shape shapeOne = shapeFactory(Angles.CIRCLE);
        System.out.println(shapeOne.areaOfShape());
        System.out.println(((Circle)shapeOne).getRadius());
        
        
        
    }
    
    public static Shape shapeFactory(Angles angles){
        switch(angles){
            case RECTANGLE: return new Rectangle(1,2);
            case TRIANGLE: return new Triangle(1,2,3);
            case CIRCLE: return new Circle(5);
            
        }
        return null;
    }
        
}
        
