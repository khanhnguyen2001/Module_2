package _5_AccessModifier_staticMethod_staticProperty.EXC_2_Xay_dung_lop_chi_ghi_trong_Java;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Default Name: " + student.name);
        System.out.println("Default Classes: " + student.classes);

        student.setName("Alice");
        student.setClasses("C03");
        System.out.println("Updated Name: " + student.name);
        System.out.println("Updated Classes: " + student.classes);
    }
}

