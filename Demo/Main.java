package Demo;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(2.5);
        Circle circle2 = new Circle(3.0);
        Circle circle3 = new Circle(1.8);

        System.out.println("Số vòng kết nối được tạo: " + Circle.getNumberOfCircles());

        System.out.println("Diện tích hình tròn 1: " + circle1.calculateArea());
        System.out.println("Chu vi hình tròn 1: " + circle1.calculatePerimeter());

        System.out.println("Diện tích hình tròn 2: " + circle2.calculateArea());
        System.out.println("Chu vi hình tròn 2: " + circle2.calculatePerimeter());

        System.out.println("Diện tích hình tròn 3: " + circle3.calculateArea());
        System.out.println("Chu vi hình tròn 3: " + circle3.calculatePerimeter());

        System.out.println("Bán kính tối đa giữa các vòng tròn: " + Circle.getMaxRadius());

        System.out.println("Tổng diện tích hình tròn: " + Circle.getTotalArea());
    }
}

