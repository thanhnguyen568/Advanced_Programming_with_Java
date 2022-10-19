package loop_in_java;

import java.util.Scanner;

public class DisplayShape {

    public static void PrintRectangle(int height, int width) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        System.out.println();
    }

    public static void PrintTriangleBotLeft(int height, int width) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        System.out.println();
    }

    public static void PrintTriangleTopLeft(int height, int width) {
        for (int i = 0; i < height; i++) {
            for (int j = i; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input height = ");
        int height = scanner.nextInt();
        System.out.print("Input width = ");
        int width = scanner.nextInt();
        System.out.println();

        PrintRectangle(height, width);
        PrintTriangleBotLeft(height, width);
        PrintTriangleTopLeft(height, width);
    }

}