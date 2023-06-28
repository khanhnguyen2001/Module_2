package Quan_ly_hoc_sinh;

class Student {
    private String id;
    private String fullName;
    private int age;
    private String hometown;

    public Student(String id, String fullName, int age, String hometown) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.hometown = hometown;
    }

    public String getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String getHometown() {
        return hometown;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Full Name: " + fullName + ", Age: " + age + ", Hometown: " + hometown;
    }
}
