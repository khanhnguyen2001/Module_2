package _11_DSA_Stack_Queue.EXC_1_Dao_nguoc_phan_tu_trong_mang_so_nguyen_su_dung_stack;

import java.util.Stack;

public class ReverseArrayUsingStack {
    public static void reverseArray(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        // Đưa các phần tử của mảng vào Stack
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }

        // Lấy các phần tử từ Stack và đưa vào mảng ban đầu
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Mảng ban đầu:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        reverseArray(arr);

        System.out.println("\nMảng sau khi đảo ngược:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

