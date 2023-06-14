package _6_Ke_thua.EXC_1_Lop_circle_va_lop_Cylinder;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println(circle1);
        System.out.println("Area: " + circle1.getArea());

        Circle circle2 = new Circle(2.5, "blue");
        System.out.println(circle2);
        System.out.println("Area: " + circle2.getArea());

        Cylinder cylinder1 = new Cylinder();
        System.out.println(cylinder1);
        System.out.println("Volume: " + cylinder1.getVolume());

        Cylinder cylinder2 = new Cylinder(3.0, "green", 5.0);
        System.out.println(cylinder2);
        System.out.println("Volume: " + cylinder2.getVolume());
    }

}
