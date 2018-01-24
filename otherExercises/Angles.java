public enum Angles{
    RECTANGLE(4),
    TRIANGLE(3),
    CIRCLE(0);
    
    private int value;
    
    private Angles(int value){
        this.value = value;
    }
    
    public int getValue(){
        return value;
    }
}
