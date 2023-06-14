package _6_Ke_thua.EXC_4_Thiet_ke_va_trien_khai_lop_Triangle$;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side1 length: ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter side2 length: ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter side3 length: ");
        double side3 = scanner.nextDouble();

        System.out.print("Enter triangle color: ");
        String color = scanner.next();

        Triangle triangle = new Triangle(side1, side2, side3, color);

        System.out.println("Triangle information:");
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());

        scanner.close();
    }
}
