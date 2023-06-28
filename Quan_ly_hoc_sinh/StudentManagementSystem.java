package Quan_ly_hoc_sinh;

import java.util.List;
import java.util.Scanner;

public class StudentManagementSystem {
    private static final String DATA_FILE_PATH = "C:\\CodeGym\\BaiTap\\Module_2\\src\\Text\\data.csv";

    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager(DATA_FILE_PATH);
        studentManager.loadDataFromFile();

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("===== Menu =====");
            System.out.println("1. Thêm học sinh");
            System.out.println("2. Sửa học sinh");
            System.out.println("3. Xóa học sinh");
            System.out.println("4. Tìm kiếm học sinh theo tên");
            System.out.println("5. Hiển thị danh sách học sinh");
            System.out.println("6. Lưu dữ liệu vào file");
            System.out.println("7. Thoát");
            System.out.print("Nhập vào số: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.println("Enter student details:");
                    System.out.print("Nhập ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Nhập họ tên: ");
                    String fullName = scanner.nextLine();
                    System.out.print("Nhập tuổi: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Nhập quê quán: ");
                    String hometown = scanner.nextLine();
                    Student newStudent = new Student(id, fullName, age, hometown);
                    studentManager.addStudent(newStudent);
                    System.out.println("Sinh viên được thêm thành công!");
                    break;
                case 2:
                    System.out.print("Nhập ID học sinh cần chỉnh sửa: ");
                    String editId = scanner.nextLine();
                    System.out.println("Nhập chi tiết sinh viên được cập nhập:");
                    System.out.print("Nhập họ tên mới: ");
                    String newFullName = scanner.nextLine();
                    System.out.print("Nhập tuổi mới: ");
                    int newAge = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Nhập quê quán mới: ");
                    String newHometown = scanner.nextLine();
                    Student updatedStudent = new Student(editId, newFullName, newAge, newHometown);
                    studentManager.editStudent(editId, updatedStudent);
                    System.out.println("Thông tin học sinh được cập nhật thành công!");
                    break;
                case 3:
                    System.out.print("Nhập ID học sinh muốn xóa: ");
                    String deleteId = scanner.nextLine();
                    studentManager.deleteStudent(deleteId);
                    System.out.println("Student deleted successfully.");
                    break;
                case 4:
                    System.out.print("Enter name keyword to search: ");
                    String keyword = scanner.nextLine();
                    List<Student> searchResults = studentManager.searchStudentsByName(keyword);
                    if (searchResults.isEmpty()) {
                        System.out.println("No students found.");
                    } else {
                        System.out.println("Search results:");
                        for (Student student : searchResults) {
                            System.out.println(student);
                        }
                    }
                    break;
                case 5:
                    studentManager.displayAllStudents();
                    break;
                case 6:
                    studentManager.saveDataToFile();
                    break;
                case 7:
                    System.out.println("Quitting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
            System.out.println();
        } while (choice != 7);

        scanner.close();
    }
}
