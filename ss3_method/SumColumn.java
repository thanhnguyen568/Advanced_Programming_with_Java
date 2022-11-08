package ss3_method;

import java.util.Scanner;

public class SumColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Index cột cần tính tổng = ");
        int colSum = scanner.nextInt();
        double[][] array = createArray();
        double sum = 0;

        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                sum += array[row][colSum];
            }
            System.out.println("Tổng của cột vị trí index" + colSum + ": " + sum);
            break;
        }

    }

    // METHOD NEW ARRAY AND RETURN ARRAY 2D
    public static double[][] createArray() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số dòng i của mảng = ");
        int row = scanner.nextInt();
        System.out.print("Nhập số cột j của mảng = ");
        int column = scanner.nextInt();

        double[][] array = new double[row][column];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Nhập phần tử vị trí " + "[" + i + "]" + "[" + j + "]" + ": ");
                array[i][j] = scanner.nextInt();
            }
        }

        return array;
    }
}