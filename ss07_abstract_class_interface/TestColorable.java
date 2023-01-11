package ss7_abstract_class_interface;

public class TestColorable {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Rectangle(3, 4);
        shapes[1] = new Square(5);

        System.out.println("info the Square: ");
        System.out.println(shapes[0]);
        ((Square) shapes[1]).reSize(100);
        ((Square) shapes[1]).howToColor();
    }
}
