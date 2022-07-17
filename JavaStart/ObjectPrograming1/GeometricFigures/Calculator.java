package JavaStart.ObjectPrograming1.GeometricFigures;

public class Calculator {
    public static double RectangleArea(Rectangle rectangle) {

        double a = Math.sqrt(Math.pow(rectangle.getPointB().getPointX() - rectangle.getPointA().getPointX(), 2) +
                Math.pow(rectangle.getPointB().getPointY() - rectangle.getPointA().getPointY(), 2));

        double b = Math.sqrt(Math.pow(rectangle.getPointC().getPointX() - rectangle.getPointB().getPointX(), 2) +
                Math.pow(rectangle.getPointC().getPointY() - rectangle.getPointB().getPointY(), 2));

        return Math.round(a * b);
    }
}
