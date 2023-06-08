package _4_Lop_va_doi_tuong_trong_Java.EXC_1_QuadraticEquation_PTB2;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        if (a == 0) {
            throw new IllegalArgumentException("Giá trị a không được bằng 0");
        }

        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        double discriminant = getDiscriminant();
        if (discriminant < 0) {
            return Double.NaN; // NaN: Not a Number
        } else {
            return (-b + Math.sqrt(discriminant)) / (2 * a);
        }
    }

    public double getRoot2() {
        double discriminant = getDiscriminant();
        if (discriminant < 0) {
            return Double.NaN; // NaN: Not a Number
        } else {
            return (-b - Math.sqrt(discriminant)) / (2 * a);
        }
    }
}
