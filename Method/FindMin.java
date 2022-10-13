package Method;

import java.util.Scanner;

public class FindMin {

    public static void main(String[] args) {

        int[] array = createArray();
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }

        System.out.println("Số nhỏ nhất trong mảng là: " + min);
    }

    // METHOD NEW ARRAY AND RETURN ARRAY
    public static int[] createArray() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập độ dài của mảng = ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần vị trí " + i + ": ");
            array[i] = scanner.nextInt();
        }

        return array;
    }

}