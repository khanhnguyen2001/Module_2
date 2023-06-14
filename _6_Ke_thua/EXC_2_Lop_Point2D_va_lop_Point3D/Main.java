package _6_Ke_thua.EXC_2_Lop_Point2D_va_lop_Point3D;

public class Main {
    public static void main(String[] args) {
        // Test Point2D
        Point2D point2D = new Point2D(2.5f, 3.7f);
        System.out.println("Point2D:");
        System.out.println("Coordinates: " + point2D.toString());
        System.out.println("X coordinate: " + point2D.getX());
        System.out.println("Y coordinate: " + point2D.getY());

        // Test Point3D
        Point3D point3D = new Point3D(1.2f, 4.6f, 2.8f);
        System.out.println("\nPoint3D:");
        System.out.println("Coordinates: " + point3D.toString());
        System.out.println("X coordinate: " + point3D.getX());
        System.out.println("Y coordinate: " + point3D.getY());
        System.out.println("Z coordinate: " + point3D.getZ());

        // Set new coordinates for Point3D
        point3D.setXYZ(5.3f, 2.1f, 6.7f);
        System.out.println("\nNew coordinates for Point3D: " + point3D.getXYZ());

        // Test getXY() for Point2D and Point3D
        float[] xy2D = point2D.getXY();
        System.out.println("\nPoint2D - XY coordinates: (" + xy2D[0] + ", " + xy2D[1] + ")");

        float[] xyz3D = point3D.getXYZ();
        System.out.println("Point3D - XYZ coordinates: (" + xyz3D[0] + ", " + xyz3D[1] + ", " + xyz3D[2] + ")");
    }
}

