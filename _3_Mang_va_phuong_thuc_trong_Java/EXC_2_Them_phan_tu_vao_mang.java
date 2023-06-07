package _3_Mang_va_phuong_thuc_trong_Java;
import java.util.Arrays;
import java.util.Scanner;

public class EXC_2_Them_phan_tu_vao_mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Khai báo và khởi tạo mảng
        int[] array = new int[10]; // Mảng gồm 10 phần tử
        Arrays.fill(array, 0); // Gán giá trị mặc định 0 cho các phần tử

        // Bước 2: Nhập phần tử cần chèn
        System.out.print("Nhập phần tử cần chèn: ");
        int X = scanner.nextInt();

        // Bước 3: Nhập vị trí cần chèn
        System.out.print("Nhập vị trí cần chèn (0-9): ");
        int index = scanner.nextInt();

        // Bước 4: Kiểm tra vị trí cần chèn
        if (index < 0 || index >= array.length) {
            System.out.println("Không thể chèn phần tử vào mảng.");
            return;
        }

        // Bước 5: Thực hiện chèn phần tử vào mảng
        for (int i = array.length - 1; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = X;

        // Bước 6: In ra mảng
        System.out.println("Mảng sau khi chèn phần tử " + X + " vào vị trí " + index + ":");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }


//        // Bước 1: Khai báo và khởi tạo mảng
//        int[] array = {1, 2, 3, 4, 5};
//        int N = array.length;
//
//        // Bước 2: Nhập phần tử cần chèn
//        System.out.print("Nhập phần tử cần chèn: ");
//        int X = scanner.nextInt();
//
//        // Bước 3: Nhập vị trí cần chèn
//        System.out.print("Nhập vị trí cần chèn: ");
//        int index = scanner.nextInt();
//
//        // Bước 4: Kiểm tra vị trí cần chèn
//        if (index < 0 || index > array.length) {
//            System.out.println("Không thể chèn phần tử vào mảng.");
//            return;
//        }
//
//        // Bước 5: Chèn phần tử vào mảng
//        int[] newArray = new int[N + 1];
//        for (int i = 0; i < index; i++) {
//            newArray[i] = array[i];
//        }
//        newArray[index] = X;
//        for (int i = index + 1; i < newArray.length; i++) {
//            newArray[i] = array[i - 1];
//        }
//
//        // Bước 6: In ra mảng mới
//        System.out.println("Mảng sau khi chèn phần tử " + X + " vào vị trí " + index + ":");
//        for (int i = 0; i < newArray.length; i++) {
//            System.out.print(newArray[i] + " ");
//        }
    }
}
