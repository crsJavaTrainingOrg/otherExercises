public class ShapeTest{

    public static void test(){
       
        try{
             Triangle t = new Triangle(4,5,60);
             System.out.println("Area of triangle: " + t.areaOfShape());
            }
            catch(NullPointerException | IllegalShapeParameterException e){
                System.out.println(e);
            }finally{
                System.out.println("kutya");
            }
            
            
            
        
        
        
        
        
        Rectangle r = new Rectangle(5,6);
        System.out.println("Area of rectangle : " + r.areaOfShape());
        Circle c = new Circle(5);
        
        System.out.println("Area of circle: " + c.areaOfShape());
        try{
            Shape shapeOne = shapeFactory(Angles.TRIANGLE);
            System.out.println(shapeOne.areaOfShape());

        }
        catch(Exception e){
            System.out.println("Nem megszerkesztheto haromszog");
        }

        
    }

    public static Shape shapeFactory(Angles angles) throws Exception{
        switch(angles){
            case RECTANGLE: return new Rectangle(1,2);
            case TRIANGLE: return new Triangle(1,2,60);
            case CIRCLE: return new Circle(5);

        }
        return null;
    }

}

