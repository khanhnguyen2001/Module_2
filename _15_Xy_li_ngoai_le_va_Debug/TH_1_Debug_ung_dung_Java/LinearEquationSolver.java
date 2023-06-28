package _15_Xy_li_ngoai_le_va_Debug.TH_1_Debug_ung_dung_Java;

import java.util.Scanner;

public class LinearEquationSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Giải phương trình bậc nhất ax + b = 0");

        System.out.print("Nhập giá trị của a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhập giá trị của b: ");
        double b = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            double x = -b / a;
            System.out.println("Nghiệm của phương trình là: x = " + x);
        }

        scanner.close();
    }
}

