package ss13_sorting_algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    static Scanner scanner = new Scanner(System.in);

    public static void insertionSort(int[] array) {
        int pos, x;

        for (int i = 1; i < array.length; i++) { //đoạn array[0] đã sắp xếp
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1]; // đổi chỗ
                pos--;
            }
            array[pos] = x;
        }
    }

    public static int[] createArray(int size) {
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần tử vị trí " + i + ": ");
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static void main(String[] args) {
        System.out.print("Input size of array: ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] array = createArray(size);

        System.out.println("Array after insertion sort:");
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
