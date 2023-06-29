package _16_IO_Text_File.EXC_1_Copy_file_text;

import java.io.*;

public class FileCopyProgram {
    public static void main(String[] args) {
        String sourceFilePath = "C:\\CodeGym\\BaiTap\\Module_2\\src\\Text\\source.txt"; // Đường dẫn của tệp nguồn
        String targetFilePath = "C:\\CodeGym\\BaiTap\\Module_2\\src\\Text\\target.txt"; // Đường dẫn của tệp đích

        try {
            File sourceFile = new File(sourceFilePath);
            File targetFile = new File(targetFilePath);

            // Kiểm tra nếu tệp nguồn không tồn tại
            if (!sourceFile.exists()) {
                System.out.println("Tệp nguồn không tồn tại.");
                return;
            }

            // Kiểm tra nếu tệp đích đã tồn tại
            if (targetFile.exists()) {
                System.out.println("Tệp đích đã tồn tại.");
                return;
            }

            FileReader fileReader = new FileReader(sourceFile);
            FileWriter fileWriter = new FileWriter(targetFile);

            int character;
            int characterCount = 0;

            // Đọc ký tự từ tệp nguồn và ghi vào tệp đích
            while ((character = fileReader.read()) != -1) {
                fileWriter.write(character);
                characterCount++;
            }

            fileReader.close();
            fileWriter.close();

            System.out.println("Sao chép tệp thành công.");
            System.out.println("Số ký tự trong tệp: " + characterCount);
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi trong quá trình sao chép tệp.");
            e.printStackTrace();
        }
    }
}

