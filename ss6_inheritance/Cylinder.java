package ss6_inheritance;

import java.util.Scanner;

public class Cylinder extends Circle {

    private double height;

    public Cylinder() {
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * this.height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + getRadius() +
                ", color=" + getColor() +
                ", area=" + getArea() +
                ", height=" + getHeight() +
                ", volume=" + getVolume() +
                '}';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cylinder cylinder = new Cylinder();

        System.out.print("Input radius of Circle = ");
        cylinder.setRadius(scanner.nextDouble());

        System.out.print("Input color of Circle = ");
        cylinder.setColor(scanner.next());

        System.out.print("Input height of Cylinder = ");
        cylinder.height = scanner.nextDouble();

        System.out.print("Information of Cylinder = ");
        System.out.println(cylinder);

//        Cylinder cylinder = new Cylinder(4,"blue",5);
//        System.out.print("Information of Cylinder = ");
//        System.out.println(cylinder);
    }

}
