package OOP;

import java.util.Scanner;

public class QuadraticEquation {
    private final double numberA, numberB, numberC;
    double delta, rootFirst, rootSecond;

    public QuadraticEquation(double numberA, double numberB, double numberC) {
        this.numberA = numberA;
        this.numberB = numberB;
        this.numberC = numberC;
    }

    public double getDiscriminant() {
        delta = Math.pow(numberB, 2) - 4 * numberA * numberC;
        return delta;
    }

    public double getRootFirst() {
        return rootFirst = (-numberB + Math.pow(delta, 0.5)) / 2 * numberA;
    }

    public double getRootSecond() {
        return rootSecond = (-numberB - Math.pow(delta, 0.5)) / 2 * numberA;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numberA, numberB, numberC;

        System.out.print("input number A = ");
        numberA = scanner.nextDouble();
        System.out.print("input number B = ");
        numberB = scanner.nextDouble();
        System.out.print("input number C = ");
        numberC = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(numberA, numberB, numberC);
        System.out.println("Delta = " + quadraticEquation.getDiscriminant());

        if (quadraticEquation.getDiscriminant() < 0) {
            System.out.println("The equation has no roots");
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("The equation has one root: " + quadraticEquation.getRootFirst());
        } else {
            System.out.println("The equation has two roots: " + quadraticEquation.getRootFirst() + " and " + quadraticEquation.getRootSecond());
        }

    }

}
