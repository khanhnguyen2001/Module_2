package Quan_ly_hoc_sinh;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class StudentManager {
    private List<Student> students;
    private String dataFile;

    public StudentManager(String dataFile) {
        this.students = new ArrayList<>();
        this.dataFile = dataFile;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void editStudent(String id, Student newStudent) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(id)) {
                students.set(i, newStudent);
                break;
            }
        }
    }

    public void deleteStudent(String id) {
        students.removeIf(student -> student.getId().equals(id));
    }

    public List<Student> searchStudentsByName(String keyword) {
        List<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (student.getFullName().toLowerCase().contains(keyword.toLowerCase())) {
                result.add(student);
            }
        }
        return result;
    }

    public void displayAllStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void saveDataToFile() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(dataFile))) {
            for (Student student : students) {
                writer.println(student.getId() + "," + student.getFullName() + "," + student.getAge() + "," + student.getHometown());
            }
            System.out.println("Data saved to file.");
        } catch (IOException e) {
            System.out.println("Error saving data to file: " + e.getMessage());
        }
    }

    public void loadDataFromFile() {
        students.clear();
        try (Scanner scanner = new Scanner(new File(dataFile))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    String id = parts[0];
                    String fullName = parts[1];
                    int age = Integer.parseInt(parts[2]);
                    String hometown = parts[3];
                    Student student = new Student(id, fullName, age, hometown);
                    students.add(student);
                }
            }
            System.out.println("Data loaded from file.");
        } catch (FileNotFoundException e) {
            System.out.println("Data file not found: " + e.getMessage());
        }
    }
}
