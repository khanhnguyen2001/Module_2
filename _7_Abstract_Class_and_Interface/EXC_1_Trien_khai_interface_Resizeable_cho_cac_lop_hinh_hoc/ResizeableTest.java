package _7_Abstract_Class_and_Interface.EXC_1_Trien_khai_interface_Resizeable_cho_cac_lop_hinh_hoc;

import java.util.Random;
public class ResizeableTest {
    public static void main(String[] args) {
        Random random = new Random();

        Resizeable[] shapes = new Resizeable[3];
        shapes[0] = new Circle(3.0);
        shapes[1] = new Rectangle(4.0, 5.0);
        shapes[2] = new Square(6.0);

        System.out.println("Before resizing:");
        for (Resizeable shape : shapes) {
            System.out.println(shape);
            System.out.println("Area: " + getFormattedArea(shape));
        }

        System.out.println("\nAfter resizing:");
        for (Resizeable shape : shapes) {
            double percent = random.nextDouble() * 100;
            shape.resize(percent);
            System.out.println(shape);
            System.out.println("Area: " + getFormattedArea(shape));
        }
    }

    private static String getFormattedArea(Resizeable shape) {
        return String.format("%.2f", shape.getArea());
    }
}
