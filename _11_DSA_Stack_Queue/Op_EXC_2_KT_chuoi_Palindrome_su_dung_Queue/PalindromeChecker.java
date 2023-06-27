package _11_DSA_Stack_Queue.Op_EXC_2_KT_chuoi_Palindrome_su_dung_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        Queue<Character> queue = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLetter(c)) {
                queue.add(c);
            }
        }

        while (queue.size() > 1) {
            if (queue.remove() != ((LinkedList<Character>) queue).removeLast()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str = "Able was I ere I saw Elba";
        boolean isPalindrome = isPalindrome(str);

        if (isPalindrome) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}

