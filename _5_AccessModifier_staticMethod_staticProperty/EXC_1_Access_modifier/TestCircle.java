package _5_AccessModifier_staticMethod_staticProperty.EXC_1_Access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(2.5);

        System.out.println("Circle 1 - Radius: " + circle1.getRadius());
        System.out.println("Circle 1 - Area: " + circle1.getArea());

        System.out.println("Circle 2 - Radius: " + circle2.getRadius());
        System.out.println("Circle 2 - Area: " + circle2.getArea());

        // Thay đổi access modifier cho các phương thức getRadius() và getArea()
        // circle1.getRadius(); // Lỗi: Phương thức getRadius() không thể truy cập vì nó đã được thay đổi access modifier
        // circle1.getArea(); // Lỗi: Phương thức getArea() không thể truy cập vì nó đã được thay đổi access modifier
    }
}
