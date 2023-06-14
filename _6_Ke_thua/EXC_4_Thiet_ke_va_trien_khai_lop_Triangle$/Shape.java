package _6_Ke_thua.EXC_4_Thiet_ke_va_trien_khai_lop_Triangle$;

public abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract String toString();
}

