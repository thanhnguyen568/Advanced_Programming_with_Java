package Method;

import java.util.Scanner;

public class MainDiagonal {
    public static void main(String[] args) {

        int[][] array = createArray();
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    sum += array[i][j];
                }
            }

        }

        System.out.println("Tổng đường chéo chính là: " + sum);
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
