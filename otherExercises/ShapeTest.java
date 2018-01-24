public class ShapeTest{
    
    public static void test(){
        Triangle t = new Triangle(4,5,6);
        t.shapeFactory(3);
        System.out.println("Area of triangle: " + t.areaOfShape());
        
        Rectangle r = new Rectangle(5,6);
        r.shapeFactory(4);
        System.out.println("Area of rectangle : " + r.areaOfShape());
        
        Circle c = new Circle(5);
        System.out.println("Area of circle: " + c.areaOfShape());
        c.shapeFactory(0);
        
        
    }
}
        
