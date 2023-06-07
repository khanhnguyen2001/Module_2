package _3_Mang_va_phuong_thuc_trong_Java;

import java.util.Scanner;

public class EXC_1_Xoa_phan_tu_khoi_mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Khai báo và khởi tạo mảng
        int[] array = {1, 2, 3, 4, 5};
        int N = array.length;

        // Bước 2: Nhập phần tử cần xoá
        System.out.print("Nhập phần tử cần xoá: ");
        int X = scanner.nextInt();

        // Bước 3: Tìm phần tử cần xoá và chỉ ra vị trí nếu có
        int index_del = -1;
        for (int i = 0; i < N; i++) {
            if (array[i] == X) {
                index_del = i;
                break;
            }
        }

        if (index_del == -1) {
            System.out.println("Phần tử không tồn tại trong mảng.");
            return;
        }

        // Bước 4: Xoá phần tử
        for (int i = index_del; i < N - 1; i++) {
            array[i] = array[i + 1];
        }

        N--;

        // Bước 5: In ra mảng sau khi xoá
        System.out.println("Mảng sau khi xoá phần tử " + X + ":");
        for (int i = 0; i < N; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
