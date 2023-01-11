package ss3_method;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {

        int[][] array = createArray();
        int max = array[0][0];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }

        System.out.println("Phần tử lớn nhất trong ma trận = " + max);
    }

    // METHOD NEW ARRAY AND RETURN ARRAY 2D
    public static int[][] createArray() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số dòng i của mảng = ");
        int row = scanner.nextInt();
        System.out.print("Nhập số cột j của mảng = ");
        int col = scanner.nextInt();

        int[][] array = new int[row][col];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Nhập phần tử vị trí " + "[" + i + "]" + "[" + j + "]" + ": ");
                array[i][j] = scanner.nextInt();
            }
        }

        return array;
    }

}