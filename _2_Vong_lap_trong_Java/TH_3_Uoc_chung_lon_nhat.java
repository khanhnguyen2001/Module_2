package _2_Vong_lap_trong_Java;

import java.util.Scanner;

public class TH_3_Uoc_chung_lon_nhat {
    public static void main(String[] args) {
        System.out.println("Chương trình tìm ước chung lớn nhất!");

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào số a: ");
        int a = sc.nextInt();

        System.out.println("Nhập vào số b: ");
        int b = sc.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0) {
            System.out.println("No greatest common factor");
        }

        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }

        System.out.println("Greatest common factor: " + a);


//        if (a == 0 && b == 0) {
//            System.out.println(a + " và " + b + " không có ước chung lớn nhất!");
//        }
//
//        if (a == 0 || b == 0) {
//            if (a != 0) {
//                System.out.println("Ước chung lớn nhất của " + a + " và " + b + " là: " + Math.abs(a));
//            } else if (b != 0) {
//                System.out.println("Ước chung lớn nhất của " + a + " và " + b + " là: " + Math.abs(b));
//            }
//        }
//
//        while (a != b) {
//            if (a > b) {
//                a = a - b;
//                System.out.println("Ước chung lớn nhất của " + a + " và " + b + " là: " + a);
//            } else {
//                b = b - a;
//                System.out.println("Ước chung lớn nhất của " + a + " và " + b + " là: " + b);
//            }
//        }
//        System.out.println("Ước chung lớn nhất của " + a + " và " + b + " là: " + a);
    }
}
