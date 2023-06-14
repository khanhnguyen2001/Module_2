package _6_Ke_thua.EXC_3_Lop_Point_va_MoveablePoint;

public class Main {
    public static void main(String[] args) {
        // Test Point
        Point point = new Point(2.5f, 3.7f);
        System.out.println("Point:");
        System.out.println("Coordinates: " + point.toString());
        System.out.println("X coordinate: " + point.getX());
        System.out.println("Y coordinate: " + point.getY());

        // Test MovablePoint
        MoveablePoint moveablePoint = new MoveablePoint(1.2f, 4.6f, 0.8f, 1.3f);
        System.out.println("\nMovablePoint:");
        System.out.println("Coordinates: " + moveablePoint.toString());
        System.out.println("X coordinate: " + moveablePoint.getX());
        System.out.println("Y coordinate: " + moveablePoint.getY());
        System.out.println("X speed: " + moveablePoint.getXSpeed());
        System.out.println("Y speed: " + moveablePoint.getYSpeed());

        // Set new coordinates for MovablePoint
        moveablePoint.setXY(5.3f, 2.1f);
        System.out.println("\nNew coordinates for MovablePoint: " + moveablePoint.getXY());

        // Set new speed for MovablePoint
        moveablePoint.setSpeed(2.0f, 3.5f);
        System.out.println("New speed for MovablePoint: " + moveablePoint.getSpeed());

        // Move MovablePoint and display new coordinates
        System.out.println("\nMoving MovablePoint...");
        moveablePoint.move();
        System.out.println("New coordinates after move: " + moveablePoint.getXY());
    }
}


