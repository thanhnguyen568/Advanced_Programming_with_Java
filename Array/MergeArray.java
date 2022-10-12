package Array;

import java.util.Arrays;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập độ dài mảng arrayA = ");
        int sizeA = scanner.nextInt();
        int[] arrayA = CreateArray(sizeA);

        System.out.print("Nhập độ dài mảng arrayB = ");
        int sizeB = scanner.nextInt();
        int[] arrayB = CreateArray(sizeB);

        System.out.print("Mảng arrayA là: ");
        System.out.println(Arrays.toString(arrayA));

        System.out.print("Mảng arrayB là: ");
        System.out.println(Arrays.toString(arrayB));

        int sizeMer = sizeA + sizeB;
        int[] arrayMerged = new int[sizeMer];

        //ASSIGNMENT A -> MER
        for (int i = 0; i < sizeA; i++) {
            arrayMerged[i] = arrayA[i];
        }

        //ASSIGNMENT B -> MER
        for (int i = sizeA; i < sizeMer; i++) {
            arrayMerged[i ] = arrayB[i- sizeA]; //i-size để i chạy từ 0
        }

        System.out.print("Mảng arrayMerged là: ");
        System.out.println(Arrays.toString(arrayMerged));

    }

    // METHOD NEW ARRAY AND RETURN ARRAY
    public static int[] CreateArray(int size) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần vị trí " + i + ": ");
            array[i] = scanner.nextInt();
        }

        return array;
    }

}