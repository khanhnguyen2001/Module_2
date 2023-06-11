package _5_AccessModifier_staticMethod_staticProperty.EXC_1_Access_modifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
        // Hàm tạo không có tham số
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
