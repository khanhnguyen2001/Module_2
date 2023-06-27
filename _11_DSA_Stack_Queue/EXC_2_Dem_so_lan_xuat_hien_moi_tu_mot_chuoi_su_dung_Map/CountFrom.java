package _11_DSA_Stack_Queue.EXC_2_Dem_so_lan_xuat_hien_moi_tu_mot_chuoi_su_dung_Map;

import java.util.Scanner;
import java.util.TreeMap;

public class CountFrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String input = scanner.nextLine();

        TreeMap<String, Integer> wordMap = new TreeMap<>();

        // Tách các từ trong chuỗi và thêm vào TreeMap
        String[] words = input.split("\\s+");
        for (String word : words) {
            // Chuyển từ thành chữ hoa hoặc chữ thường
            String key = word.toLowerCase();

            // Kiểm tra xem từ đã tồn tại trong TreeMap hay chưa
            if (wordMap.containsKey(key)) {
                // Tăng số lượng từ lên 1 nếu từ đã tồn tại
                int count = wordMap.get(key);
                wordMap.put(key, count + 1);
            } else {
                // Thêm từ vào TreeMap với số lượng mặc định là 1
                wordMap.put(key, 1);
            }
        }

        // Hiển thị map gồm từ và số lượng
        System.out.println("Kết quả:");
        for (String word : wordMap.keySet()) {
            int count = wordMap.get(word);
            System.out.println(word + ": " + count);
        }
    }
}

