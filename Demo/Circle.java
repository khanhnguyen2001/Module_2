package Demo;

public class Circle {
    private static int count = 0;
    private int id;
    private double radius;
    private static final double PI = 3.14;
    private static double maxRadius = 0;
    private static double totalArea = 0;

    public Circle(double radius) {
        this.id = ++count;
        this.radius = radius;
        if (radius > maxRadius) {
            maxRadius = radius;
        }
        totalArea += calculateArea();
    }

    public static int getNumberOfCircles() {
        return count;
    }

    public double calculateArea() {
        return PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * PI * radius;
    }

    public static double getMaxRadius() {
        return maxRadius;
    }

    public static double getTotalArea() {
        return totalArea;
    }
}

