package _11_DSA_Stack_Queue.Op_EXC_4_Demerging_Su_dung_Queue;

class Employee {
    String name;
    String gender;
    String dateOfBirth;

    public Employee(String name, String gender, String dateOfBirth) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return name + " - " + gender + " - " + dateOfBirth;
    }
}
