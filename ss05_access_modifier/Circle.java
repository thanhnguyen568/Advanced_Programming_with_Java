package ss5_access_modifier;

public class Circle {
    private double radius = 1.0;
    private final String COLOR = "red";

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    private String getColor() {
        return COLOR;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + COLOR + '\'' +
                '}';
    }

}
