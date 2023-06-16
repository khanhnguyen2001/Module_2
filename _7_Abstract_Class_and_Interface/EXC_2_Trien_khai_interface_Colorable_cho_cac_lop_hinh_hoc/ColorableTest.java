package _7_Abstract_Class_and_Interface.EXC_2_Trien_khai_interface_Colorable_cho_cac_lop_hinh_hoc;

public class ColorableTest {
    public static void main(String[] args) {
        Object[] shapes = new Object[4];
        shapes[0] = new Square(5.0);
        shapes[1] = new Square(7.5);
        shapes[2] = new Square(3.0);
        shapes[3] = new Square(4.0);

        for (Object shape : shapes) {
            if (shape instanceof Colorable) {
                System.out.println(shape);
                System.out.println("Area: " + getFormattedArea(shape));
                ((Colorable) shape).howToColor();
            } else {
                System.out.println(shape);
                System.out.println("Area: " + getFormattedArea(shape));
                System.out.println("Not colorable.");
            }
            System.out.println();
        }
    }

    private static String getFormattedArea(Object shape) {
        if (shape instanceof Square) {
            return String.format("%.2f", ((Square) shape).getArea());
        }
        return "";
    }
}
