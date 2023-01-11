package ss6_inheritance;

public class Circle {

    private double radius;
    private String color;


    public Circle() {
        System.out.println("Constructed a Circle with Circle()");
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
        System.out.println("Constructed a Circle with Circle(double radius, String color)");
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color +
                '}';
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

}
