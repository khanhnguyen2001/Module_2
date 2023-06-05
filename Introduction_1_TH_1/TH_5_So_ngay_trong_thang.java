package Introduction_1_TH_1;

import java.util.Scanner;

public class TH_5_So_ngay_trong_thang {
    public static void main(String[] args) {
        System.out.println("Chương trình tính số ngày của một tháng trong năm!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập tháng bạn cần kiểm tra (Yêu cầu nhập số từ 1 đến 12): ");
        int thang = scanner.nextInt();

        String soNgay;
        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                soNgay = "31";
                break;

            case 2:
                soNgay = "28 hoặc 29";
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                soNgay = "30";
                break;

            default:
                soNgay = "";
        }
        if (!soNgay.equals("")) {  //Kiểm tra xem biến soNgay có rỗng hay không
            System.out.printf("Tháng '%d' có %s ngày!", thang , soNgay);
        }
        else System.out.print("Đầu vào không hợp lệ!");
        }
    }
