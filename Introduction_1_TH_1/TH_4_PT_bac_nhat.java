package Introduction_1_TH_1;

import java.util.Scanner;

public class TH_4_PT_bac_nhat {
    public static void main(String[] args) {
        System.out.println("Chương trình giải Phương trình bậc nhất!");
        System.out.println("Phương trình bậc nhất có dạng: ax + b = c. Vui lòng nhập các hằng số a, b, c để tính: ");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập hằng số a: ");
        double a = scanner.nextDouble();

        System.out.println("Nhập hằng số b: ");
        double b = scanner.nextDouble();

        System.out.println("Nhập hằng số c: ");
        double c = scanner.nextDouble();

        if (a == 0) {
            if (b == c) {
                System.out.println("Phương trình có vô số nghiệm!");
            } else {
                System.out.println("Phương trình vô nghiệm!");
            }
        } else {
            if (b == 0) {
                System.out.println("Phương trình có một nghiệm: x = 0");
            } else {
                System.out.println("Phương trih có nghiệm: x = " + (c - b) / a);
            }
        }
    }
}
