package _1_Introduction;

import java.util.Scanner;

public class EXC_2_Chuyen_doi_tien_te {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mời bạn nhập số tiền Đôla muốn quy đổi sang tiền việt: ");
        double tienDo = scanner.nextDouble();

        double tienViet = 23500;
        double quydoi;
        quydoi  = tienDo * 23500;

        System.out.println("Số tiền bạn muốn chuyển đổi từ tiền Đô la sang tiền việt là: " + quydoi + " VNĐ!");

    }
}
