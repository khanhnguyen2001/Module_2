package _2_Vong_lap_trong_Java;

import java.util.Scanner;

public class TH_1_Kiemtra_so_nguyen_to {
    public static void main(String[] args) {

        System.out.println("Chương trình kiểm tra số nguyên tố!");
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào một số: ");
        int number = sc.nextInt();

        if (number < 2) {
            System.out.println(number + " không phải số nguyên tố!");
        } else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(number + " là số nguyên tố!");
            else
                System.out.println(number + " không phải số nguyên tố!");
        }
    }
}
