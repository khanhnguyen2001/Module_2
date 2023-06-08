package _4_Lop_va_doi_tuong_trong_Java.EXC_1_QuadraticEquation_PTB2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = 0;

        while (a == 0) {
            System.out.print("Nhập giá trị a (a != 0): ");
            a = scanner.nextDouble();

            if (a == 0) {
                System.out.println("Giá trị a không được bằng 0. Vui lòng nhập lại.");
            } else {
                System.out.print("Nhập giá trị b: ");
                double b = scanner.nextDouble();

                System.out.print("Nhập giá trị c: ");
                double c = scanner.nextDouble();

                QuadraticEquation equation = new QuadraticEquation(a, b, c);

                double discriminant = equation.getDiscriminant();
                double root1 = equation.getRoot1();
                double root2 = equation.getRoot2();

                System.out.println("Discriminant: " + discriminant);

                if (Double.isNaN(root1) && Double.isNaN(root2)) {
                    System.out.println("Phương trình không có nghiệm thực.");
                } else {
                    System.out.println("Nghiệm thứ nhất là: " + root1);
                    System.out.println("Nghiệm thứ hai là: " + root2);
                }
            }
        }
    }
}
