package ss6_inheritance;

import java.util.Scanner;

public class TestCylinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cylinder cylinder = new Cylinder();

        System.out.print("Input radius of Circle = ");
        cylinder.setRadius(scanner.nextDouble());

        System.out.print("Input color of Circle = ");
        cylinder.setColor(scanner.next());

        System.out.print("Input height of Cylinder = ");
        cylinder.setHeight(scanner.nextDouble());

        System.out.print("Information of Cylinder = ");
        System.out.println(cylinder);
    }
}
