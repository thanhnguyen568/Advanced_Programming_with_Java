package ss7_abstract_class_interface;

public class TestResizeable {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[6];
        shapes[0] = new Circle(2);
        shapes[1] = new Rectangle(3, 4);
        shapes[2] = new Square(5);
        shapes[3] = new Circle();
        shapes[4] = new Rectangle();
        shapes[5] = new Square();

        System.out.println("info the Circle");
        System.out.println(shapes[0]);
        ((Circle) shapes[0]).reSize(50);

    }
}
