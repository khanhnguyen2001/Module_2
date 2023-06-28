package _13_Thuat_toan_tim_kiem.Op_EXC_1_Tim_kiem_nhi_phan_su_dung_de_quy;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Enter the value to search:");
        int value = scanner.nextInt();

        // Sort the array
        Arrays.sort(array);

        int index = binarySearch(array, 0, array.length - 1, value);
        if (index != -1) {
            System.out.println("The value " + value + " is found at index " + index);
        } else {
            System.out.println("The value " + value + " is not found in the array.");
        }
    }

    public static int binarySearch(int[] array, int left, int right, int value) {
        if (left > right) {
            return -1; // Value not found
        }

        int middle = (left + right) / 2;

        if (array[middle] == value) {
            return middle; // Value found at middle index
        } else if (value > array[middle]) {
            return binarySearch(array, middle + 1, right, value); // Search in the right half
        } else {
            return binarySearch(array, left, middle - 1, value); // Search in the left half
        }
    }
}

