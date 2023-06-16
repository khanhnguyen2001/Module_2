package _7_Abstract_Class_and_Interface.EXC_1_Trien_khai_interface_Resizeable_cho_cac_lop_hinh_hoc;

class Square implements Resizeable {
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
    public void resize(double percent) {
        side *= (1 + percent / 100);
    }

    @Override
    public String toString() {
        return "Square{side=" + side + "}";
    }
}
