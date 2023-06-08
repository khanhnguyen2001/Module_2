package _4_Lop_va_doi_tuong_trong_Java.TH_1_Lop_hinh_chu_nhat;

public class Rectangle {
    double width, height;

    public Rectangle() {
    }

    public Rectangle(double with, double height) {
        this.width = with;
        this.height = height;
    }

    //Dien tich hcn
    public double getArea() {
        return this.width * this.height;
    }

    //Chu vi hcn
    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Hinh chu nhat {" + "with = " + width + ", height = " + height + "}";
    }
}
