package _7_Abstract_Class_and_Interface.EXC_2_Trien_khai_interface_Colorable_cho_cac_lop_hinh_hoc;

class Square implements Colorable {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public double getArea() {
        return side * side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }

    @Override
    public String toString() {
        return "Square{side=" + side + "}";
    }
}
