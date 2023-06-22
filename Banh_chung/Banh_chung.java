package Banh_chung;//import java.util.Scanner;
//
//public class Banh_chung.Banh_chung {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int[] d = new int[5];
//        int N = scanner.nextInt();
//        scanner.nextLine(); // Đọc ký tự newline sau khi đọc số N
//        for (String num : scanner.nextLine().split(" ")) {
//            int x = Integer.parseInt(num);
//            d[x] = d[x] + 1;
//        }
//
//        int res = d[4] + d[3] + d[2] / 2;
//        d[1] -= d[3];
//        if (d[2] % 2 > 0) {
//            res++;
//            d[1] -= 2;
//        }
//        if (d[1] > 0) {
//            res += (d[1] + 3) / 4;
//        }
//
//        System.out.println(res);
//    }
//}

import java.util.Scanner;

public class Banh_chung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] groupSizes = new int[N];
        for (int i = 0; i < N; i++) {
            groupSizes[i] = scanner.nextInt();
        }

        int minCakes = calculateMinCakes(N, groupSizes);
        System.out.println(minCakes);
    }

    private static int calculateMinCakes(int N, int[] groupSizes) {
        int[] count = new int[5]; // Số lượng nhóm có từ 0 đến 4 thành viên

        // Đếm số lượng nhóm với từng số thành viên
        for (int i = 0; i < N; i++) {
            count[groupSizes[i]]++;
        }

        int minCakes = count[4] + count[3] + count[2] / 2;
        count[1] -= count[3];

        if (count[2] % 2 != 0) {
            minCakes++;
            count[1] -= 2;
        }

        if (count[1] > 0) {
            minCakes += (count[1] + 3) / 4;
        }

        return minCakes;
    }
}

