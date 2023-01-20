public class Circle {
    public static final double RADIUS = 15.5;
    public static final double PI = 3.14;

    public static double area() {
       return PI*(RADIUS*RADIUS);
    }
    public static double circumference(){
        return PI*2*RADIUS;
    }

}