package _11_DSA_Stack_Queue.Op_EXC_4_Demerging_Su_dung_Queue;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class EmployeeDataOrganization {
    public static void main(String[] args) {
        Queue<Employee> femaleQueue = new LinkedList<>();
        Queue<Employee> maleQueue = new LinkedList<>();

        try {
            // Đọc dữ liệu từ file
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                String name = data[0];
                String gender = data[1];
                String dateOfBirth = data[2];

                Employee employee = new Employee(name, gender, dateOfBirth);

                if (gender.equalsIgnoreCase("female")) {
                    femaleQueue.add(employee);
                } else if (gender.equalsIgnoreCase("male")) {
                    maleQueue.add(employee);
                }
            }
            reader.close();

            // Ghi dữ liệu đã sắp xếp vào file
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            while (!femaleQueue.isEmpty()) {
                writer.write(femaleQueue.poll().toString() + "\n");
            }
            while (!maleQueue.isEmpty()) {
                writer.write(maleQueue.poll().toString() + "\n");
            }
            writer.close();

            System.out.println("Dữ liệu đã được tổ chức lại thành công.");
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi đọc hoặc ghi file: " + e.getMessage());
        }
    }
}

