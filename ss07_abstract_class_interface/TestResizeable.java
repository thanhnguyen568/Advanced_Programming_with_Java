package ss7_abstract_class_interface;

public class TestResizeable {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2);
        shapes[1] = new Rectangle(3, 4);
        shapes[2] = new Square(5);

        System.out.println("info the Circle: ");
        System.out.println(shapes[0]);
        ((Circle) shapes[0]).reSize(50);

        System.out.println("info the Rectangle: ");
        System.out.println(shapes[1]);
        ((Rectangle) shapes[1]).reSize(25);

        System.out.println("info the Square: ");
        System.out.println(shapes[2]);
        ((Square) shapes[2]).reSize(75);
    }
}
