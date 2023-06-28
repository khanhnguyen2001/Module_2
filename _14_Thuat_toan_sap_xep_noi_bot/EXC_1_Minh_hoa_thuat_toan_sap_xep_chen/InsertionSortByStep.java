package _14_Thuat_toan_sap_xep_noi_bot.EXC_1_Minh_hoa_thuat_toan_sap_xep_chen;

public class InsertionSortByStep {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};

        System.out.println("Original array:");
        printArray(arr);

        insertionSortByStep(arr);

        System.out.println("Sorted array:");
        printArray(arr);
    }

    public static void insertionSortByStep(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            arr[j + 1] = key;

            System.out.println("After pass " + i + ":");
            printArray(arr);
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

