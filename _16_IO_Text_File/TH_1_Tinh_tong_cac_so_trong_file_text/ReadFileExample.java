package _16_IO_Text_File.TH_1_Tinh_tong_cac_so_trong_file_text;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileExample {
    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        ReadFileExample readfileEx = new ReadFileExample();
        readfileEx.readFileText(path);
    }

    public void readFileText(String filePath) {
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            int sum = 0;
            int lineNumber = 1;

            while ((line = br.readLine()) != null) {
                try {
                    int number = Integer.parseInt(line);
                    sum += number;
                    lineNumber++;
                } catch (NumberFormatException e) {
                    System.err.println("Lỗi: Dòng " + lineNumber + " không chứa số nguyên");
                }
            }

            br.close();

            System.out.println("Tổng = " + sum);
        } catch (FileNotFoundException e) {
            System.err.println("Lỗi: File không tồn tại");
        } catch (IOException e) {
            System.err.println("Lỗi: Không thể đọc file");
        }
    }
}

