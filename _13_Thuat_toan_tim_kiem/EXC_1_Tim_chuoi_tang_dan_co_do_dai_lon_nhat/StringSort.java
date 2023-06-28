package _13_Thuat_toan_tim_kiem.EXC_1_Tim_chuoi_tang_dan_co_do_dai_lon_nhat;

import java.util.Arrays;
import java.util.Scanner;

public class StringSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String input = scanner.nextLine();
        scanner.close();

        char[] charArray = input.toCharArray();
        Arrays.sort(charArray);

        StringBuilder sortedString = new StringBuilder();
        char prevChar = '\0';
        for (char c : charArray) {
            if (c != prevChar) {
                sortedString.append(c);
                prevChar = c;
            }
        }

        System.out.println("Sorted String: " + sortedString.toString());
    }
}





