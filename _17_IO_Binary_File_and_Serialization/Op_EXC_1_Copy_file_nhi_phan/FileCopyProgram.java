package _17_IO_Binary_File_and_Serialization.Op_EXC_1_Copy_file_nhi_phan;

import java.io.*;

public class FileCopyProgram {
    public static void main(String[] args) {
        // Lấy đường dẫn của tệp nguồn và tệp đích từ dòng lệnh
        if (args.length < 2) {
            System.out.println("Vui lòng cung cấp tệp nguồn và tệp đích.");
            return;
        }

        String sourceFile = args[0];
        String targetFile = args[1];

        try {
            // Kiểm tra xem tệp nguồn có tồn tại hay không
            File file = new File(sourceFile);
            if (!file.exists()) {
                System.out.println("Tệp nguồn không tồn tại.");
                return;
            }

            // Kiểm tra xem tệp đích đã tồn tại hay không
            File target = new File(targetFile);
            if (target.exists()) {
                System.out.println("Tệp đích đã tồn tại.");
                return;
            }

            // Tạo luồng đọc và luồng ghi
            FileInputStream inputStream = new FileInputStream(file);
            FileOutputStream outputStream = new FileOutputStream(target);

            // Sao chép dữ liệu từ tệp nguồn đến tệp đích
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            // Đóng luồng
            inputStream.close();
            outputStream.close();

            System.out.println("Sao chép tệp thành công.");

            // Hiển thị số byte trong tệp đích
            long fileSize = target.length();
            System.out.println("Số byte trong tệp đích: " + fileSize);
        } catch (IOException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
}

