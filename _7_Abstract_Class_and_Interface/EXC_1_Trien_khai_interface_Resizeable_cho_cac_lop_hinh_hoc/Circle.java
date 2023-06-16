package _7_Abstract_Class_and_Interface.EXC_1_Trien_khai_interface_Resizeable_cho_cac_lop_hinh_hoc;

class Circle implements Resizeable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void resize(double percent) {
        radius *= (1 + percent / 100);
    }

    @Override
    public String toString() {
        return "Circle{radius=" + radius + "}";
    }
}

