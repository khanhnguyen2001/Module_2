package _1_Introduction;

import java.util.Scanner;

public class EXC_3_Doc_so_thanh_chu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên không âm có tối đa 3 chữ số: ");
        int number = scanner.nextInt();

        if (number < 0 || number > 999) {
            System.out.println("Số không hợp lệ.");
        } else {
            String result = "";
            String[] ones = {"", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};
            String[] tens = {"", "mười", "hai mươi", "ba mươi", "bốn mươi", "năm mươi", "sáu mươi", "bảy mươi", "tám mươi", "chín mươi"};
            String[] hundreds = {"", "một trăm", "hai trăm", "ba trăm", "bốn trăm", "năm trăm", "sáu trăm", "bảy trăm", "tám trăm", "chín trăm"};

            if (number == 0) {
                result = "Không";
            } else if (number < 10) {
                result = ones[number];
            } else if (number < 100) {
                int unit = number % 10;
                int ten = number / 10;
                result = tens[ten] + " " + ones[unit];
            } else {
                int unit = number % 10;
                int ten = (number % 100) / 10;
                int hundred = number / 100;
                result = hundreds[hundred] + " " + tens[ten] + " " + ones[unit];
            }

            System.out.println("Số bạn nhập là: " + result);
        }
    }
}
