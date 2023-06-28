package _13_Thuat_toan_tim_kiem.Op_EXC_2_Tim_chuoi_lien_tiep_co_do_dai_lon_nhat;

import java.util.Arrays;
import java.util.Scanner;

public class LongestSubstringSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        String longestSubstring = findLongestSubstring(inputString);
        System.out.println("Longest substring with sorted characters: " + longestSubstring);
    }

    public static String findLongestSubstring(String inputString) {
        String[] substrings = inputString.split(" ");
        Arrays.sort(substrings, (a, b) -> b.length() - a.length());

        return substrings[0];
    }
}

