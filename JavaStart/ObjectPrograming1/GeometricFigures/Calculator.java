package JavaStart.ObjectPrograming1.GeometricFigures;

public class Calculator {
    public static double RectangleArea(Rectangle rectangle) {
        double a = Math.sqrt(Math.pow(rectangle.getPointB().getPointX() - rectangle.getPointA().getPointX(), 2) +
                Math.pow(rectangle.getPointB().getPointY() - rectangle.getPointA().getPointY(), 2));
        double b = Math.sqrt(Math.pow(rectangle.getPointC().getPointX() - rectangle.getPointB().getPointX(), 2) +
                Math.pow(rectangle.getPointC().getPointY() - rectangle.getPointB().getPointY(), 2));
        return Math.round(a * b);
    }

    public static boolean CircleInRectangle(Rectangle rectangle, Circle circle, Point point){
        double a = Math.sqrt(Math.pow(rectangle.getPointB().getPointX() - rectangle.getPointA().getPointX(), 2) +
                Math.pow(rectangle.getPointB().getPointY() - rectangle.getPointA().getPointY(), 2));
        double b = Math.sqrt(Math.pow(rectangle.getPointC().getPointX() - rectangle.getPointB().getPointX(), 2) +
                Math.pow(rectangle.getPointC().getPointY() - rectangle.getPointB().getPointY(), 2));

        double result = (Math.pow((circle.getS().getPointX() - point.getPointX()),2)+Math.pow((circle.getS().getPointY() - point.getPointY()),2));
        double radius = Math.pow(circle.getR(),2);
        return result <= radius;
    }


}
