package ss6_inheritance;

import java.util.Scanner;

public class TestTwoThreeDimensional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PointTwoDimensional pointTwoDimensional = new PointTwoDimensional((float) 2 / 3, (float) 8 / 8);
        System.out.println(pointTwoDimensional);

        PointTwoDimensional pointTwoDimensionalA = new PointTwoDimensional();
        pointTwoDimensionalA.setX((float) 8 / 8);
        pointTwoDimensionalA.setY((float) 2 / 3);
        System.out.println(pointTwoDimensionalA);

        PointThreeDimensional pointThreeDimensionalA = new PointThreeDimensional();
        System.out.println(pointThreeDimensionalA);

        PointThreeDimensional pointThreeDimensional = new PointThreeDimensional((float) 1 / 2, (float) 2 / 3, (float) 3 / 4);
        pointThreeDimensional.setX((float) 10/2);
        pointThreeDimensional.setY((float) 22/11);
        System.out.println(pointThreeDimensional);
    }
}
