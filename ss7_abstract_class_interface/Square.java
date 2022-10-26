package ss7_abstract_class_interface;

public class Square extends Shape implements Resizeable,Colorable {
    private double side = 1;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public String toString() {
        return "Square with side="
                + getSide()
                + super.toString();
    }

    @Override
    public void reSize(double percent) {
        System.out.println("Area before resize= " + getArea());
        double newSide = percent * side / 100;
        System.out.println("Area after resizing: " + newSide * newSide);
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
