package _2_Vong_lap_trong_Java;

import java.util.Scanner;

public class TH_2_Tinh_tien_lai_cho_vay {
    public static void main(String[] args) {
        System.out.println("Ứng dụng tính tiền lãi cho vay!");
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số lượng tiền gửi: ");
        double so_tien_gui = sc.nextDouble();

        System.out.println("Nhập tỉ lệ lãi suất theo tháng: ");
        double ti_le_lai_suat_theo_thang = sc.nextFloat();

        System.out.println("Nhập số tháng cho vay: ");
        int so_thang_gui = sc.nextInt();

        double tong_tien_lai = 0;
        for(int i = 0; i < so_thang_gui; i++){
            tong_tien_lai += so_tien_gui * (ti_le_lai_suat_theo_thang/100)/12 * so_thang_gui;
        }
        System.out.println("Tổng tiền lãi là : " + tong_tien_lai);
    }
}
