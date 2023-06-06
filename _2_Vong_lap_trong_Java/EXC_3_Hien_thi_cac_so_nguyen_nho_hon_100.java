package _2_Vong_lap_trong_Java;

import java.util.Scanner;

public class EXC_3_Hien_thi_cac_so_nguyen_nho_hon_100 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Hiển thị ra các số nguyên tố nhỏ hơn 100: ");
        for (int i = 2; i < 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    //Kiểm tra số nguyên tố
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
