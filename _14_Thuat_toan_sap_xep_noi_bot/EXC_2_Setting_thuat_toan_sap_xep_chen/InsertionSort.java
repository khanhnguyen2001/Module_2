package _14_Thuat_toan_sap_xep_noi_bot.EXC_2_Setting_thuat_toan_sap_xep_chen;

public class InsertionSort {
    public static void main(String[] args) {
        int[] list = {5, 3, 8, 4, 2};

        System.out.println("Original array:");
        printArray(list);

        insertionSort(list);

        System.out.println("Sorted array:");
        printArray(list);
    }

    public static void insertionSort(int[] list) {
        int n = list.length;

        for (int i = 1; i < n; i++) {
            int key = list[i];
            int j = i - 1;

            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j = j - 1;
            }

            list[j + 1] = key;
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

