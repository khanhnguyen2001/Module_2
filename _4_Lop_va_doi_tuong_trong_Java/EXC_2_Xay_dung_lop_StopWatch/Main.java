package _4_Lop_va_doi_tuong_trong_Java.EXC_2_Xay_dung_lop_StopWatch;
import java.util.Arrays;
import java.util.Random;

    public class Main {
        public static void main(String[] args) {
            // Tạo mảng ngẫu nhiên
            int[] array = generateRandomArray(100000);

            // Tạo đối tượng StopWatch
            StopWatch stopWatch = new StopWatch();

            // Bắt đầu đo thời gian
            stopWatch.start();

            // Sắp xếp mảng
            selectionSort(array);

            // Kết thúc đo thời gian
            stopWatch.stop();

            // In ra thời gian thực thi
            System.out.println("Thời gian thực thi: " + stopWatch.getElapsedTime() + "ms");
        }

        // Hàm sắp xếp chọn (selection sort)
        public static void selectionSort(int[] array) {
            int n = array.length;

            for (int i = 0; i < n - 1; i++) {
                int minIndex = i;

                for (int j = i + 1; j < n; j++) {
                    if (array[j] < array[minIndex]) {
                        minIndex = j;
                    }
                }

                int temp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = temp;
            }
        }

        // Hàm tạo mảng ngẫu nhiên
        public static int[] generateRandomArray(int size) {
            int[] array = new int[size];
            Random random = new Random();

            for (int i = 0; i < size; i++) {
                array[i] = random.nextInt();
            }

            return array;
        }
    }

