package JavaStart.ObjectPrograming1.GeometricFigures;
public class TestingClass {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(new Point(-3,2),new Point(3,2),new Point(3,-2),new Point(-3,-2));
        Circle circle = new Circle(new Point(0,0),2);
        
        System.out.println(Calculator.RectangleArea(rectangle));

    }
}
