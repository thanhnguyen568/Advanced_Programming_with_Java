package ss7_abstract_class_interface;

public class Circle extends Shape implements Resizeable {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * this.radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + super.toString();
    }

    @Override
    public void reSize(double percent) {
        System.out.println("Area before resize= " + getArea());
        double newRadius = percent * getRadius() / 100;
        System.out.println("Area after resizing: " + Math.pow(newRadius, 2) * Math.PI);
    }

}
