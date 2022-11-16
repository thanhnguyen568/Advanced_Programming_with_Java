package ss12_searching_algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập độ dài mảng: ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần tử vị trí " + i + ": ");
            array[i] = scanner.nextInt();
        }

        sortASC(array);
        System.out.print("Dãy số được sắp xếp tăng dần: ");
        show(array);
        System.out.println();

        System.out.print("Nhập phần tử cần tìm: ");
        int value = scanner.nextInt();
        System.out.println(Arrays.binarySearch(array,value));
        System.out.println(binarySearch(array,array[0],array.length-1,value));
    }

    public static void sortASC(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static void show(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int binarySearch(int[] array, int left, int right, int value) {

        while (left <= right) {
            int middle = (left + right) / 2;

            if (array[middle] == value) {
                return middle;
            } else if (array[middle] < value) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }

}
