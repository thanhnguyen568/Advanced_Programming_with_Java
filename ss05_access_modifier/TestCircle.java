package ss5_access_modifier;

public class TestCircle {
    public static void main(String[] args) {

        Circle circleA = new Circle(4.0);
        Circle circleB = new Circle();

        System.out.print("Information of circleA: ");
        System.out.println(circleA);
        System.out.print("Radius of circleA: ");
        System.out.println(circleA.getRadius());
        System.out.print("Area of circleA: ");
        System.out.println(circleA.getArea());
        System.out.println();

        System.out.print("Information of circleB: ");
        System.out.println(circleB);
        System.out.print("Radius of circleB: ");
        System.out.println(circleB.getRadius());
        System.out.print("Area of circleB: ");
        System.out.println(circleB.getArea());
        System.out.println();
        /**
         *      Truy xuất phương thức getColor() bị lỗi do đã cài phạm vi truy cập là private trong cùng class.
         *      Đổi lại các pham vi truy cập khác như: public, protected, default sẽ truy cập được.
         *
         *         System.out.print("color of circleB: ");
         *         System.out.println(circleB.getColor());
         */

    }
}
