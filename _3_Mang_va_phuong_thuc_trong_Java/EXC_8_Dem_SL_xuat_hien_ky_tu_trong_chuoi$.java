package _3_Mang_va_phuong_thuc_trong_Java;

import java.util.Scanner;

public class EXC_8_Dem_SL_xuat_hien_ky_tu_trong_chuoi$ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Khai báo và gán giá trị cho chuỗi
        String str = "Hello World";

        // Bước 2: Nhập ký tự từ bàn phím
        System.out.print("Nhập ký tự cần đếm: ");
        char character = scanner.next().charAt(0);

        // Bước 3: Khởi tạo biến đếm
        int count = 0;

        // Bước 4: Duyệt qua từng ký tự trong chuỗi và đếm số lần xuất hiện
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == character) {
                count++;
            }
        }

        // Bước 5: In ra giá trị biến đếm
        System.out.println("Số lần xuất hiện của ký tự " + character + " trong chuỗi là: " + count);

    }
}
