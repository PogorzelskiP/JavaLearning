package JavaStart.ObjectPrograming1.GeometricFigures;
public class TestingClass {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(new Point(0,0),new Point(6,0),new Point(6,5),new Point(0,5));
        Circle circle = new Circle(new Point(0,0),5);
        Point okPoint = new Point(0,3);
        Point nokPoint = new Point(0,6);
        System.out.println(Calculator.RectangleArea(rectangle));
        System.out.println(Calculator.CircleInRectangle(rectangle,circle,okPoint));
        System.out.println(Calculator.CircleInRectangle(rectangle,circle,nokPoint));

    }
}
