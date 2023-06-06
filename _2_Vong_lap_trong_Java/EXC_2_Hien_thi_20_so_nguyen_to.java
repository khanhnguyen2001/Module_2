package _2_Vong_lap_trong_Java;

import java.util.Scanner;

public class EXC_2_Hien_thi_20_so_nguyen_to {
    public static void main(String[] args) {
        System.out.println("Chương trình hiển thị 20 số nguyên tố đầu tiên!");

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số lượng số nguyên tố cần in ra: ");
        int numbers = sc.nextInt();

        int count = 0;
        int N = 2;

        System.out.println("Số nguyên tố:");
        while (count < numbers) {
            if (isPrime(N)) {
                System.out.print(N + " ");
                count++;
            }
            N++;
        }
        sc.close();
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
