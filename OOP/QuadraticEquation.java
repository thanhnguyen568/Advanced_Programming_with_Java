package OOP;

import java.util.Scanner;

public class QuadraticEquation {
    private final double NUMBERA;
    private final double NUMBERB;
    private final double NUMBERC;
    double delta, rootFirst, rootSecond;

    public QuadraticEquation(double numberA, double numberB, double numberC) {
        this.NUMBERA = numberA;
        this.NUMBERB = numberB;
        this.NUMBERC = numberC;
    }

    public double getDiscriminant() {
        delta = Math.pow(NUMBERB, 2) - 4 * NUMBERA * NUMBERC;
        return delta;
    }

    public double getRootFirst() {
        return rootFirst = (-NUMBERB + Math.pow(delta, 0.5)) / 2 * NUMBERA;
    }

    public double getRootSecond() {
        return rootSecond = (-NUMBERB - Math.pow(delta, 0.5)) / 2 * NUMBERA;
    }

    @Override
    public String toString() {
        return "QuadraticEquation{" +
                "delta=" + delta +
                ", rootFirst=" + rootFirst +
                ", rootSecond=" + rootSecond +
                '}';
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
