package ss6_inheritance;

import java.util.Scanner;

public class Circle {

    private static double radius;
    private static String color;


    public Circle() {
    }

    public Circle(double radius, String color) {
        Circle.radius = radius;
        Circle.color = color;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        Circle.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        Circle.color = color;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + getRadius() +
                ", color='" + getColor() +
                "', area=" + getArea() +
                '}';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Circle circle = new Circle();

        System.out.print("Input radius of Circle = ");
        radius = scanner.nextDouble();

        System.out.print("Input color of Circle = ");
        color = scanner.next();

        System.out.print("Information of Circle = ");
        System.out.println(circle);
    }

}
