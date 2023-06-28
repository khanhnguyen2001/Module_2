package _15_Xy_li_ngoai_le_va_Debug.TH_3_Su_dung_lop_NumberFormatException;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập x: ");
        int x = scanner.nextInt();
        System.out.println("Hãy nhập y: ");
        int y = scanner.nextInt();
        CalculationExample calc = new CalculationExample();
        calc.calculate(x, y);
    }

    private void calculate(int x, int y) {
        try {
            int sum = x + y;
            int difference = x - y;
            int product = x * y;
            int quotient = x / y;
            System.out.println("Tổng x + y = " + sum);
            System.out.println("Hiệu x - y = " + difference);
            System.out.println("Tích x * y = " + product);
            System.out.println("Thương x / y = " + quotient);
        } catch (ArithmeticException e) {
            System.err.println("Xảy ra lỗi: " + e.getMessage());
        }
    }
}

