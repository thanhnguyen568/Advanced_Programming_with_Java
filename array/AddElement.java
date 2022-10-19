package array;

import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size;

        do {
            System.out.print("Nhập độ dài của mảng = ");
            size = scanner.nextInt();
        } while (size <= 0);

        int[] array = new int[size];

        for (int i = 0; i < size - 1; i++) {
            System.out.print("Nhập phần tử vị trí " + i + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Nhập số nguyên cần chèn x = ");
        int numberX = scanner.nextInt();

        System.out.print("Nhập vị trí cần chèn j = ");
        int indexJ = scanner.nextInt();  //1

        //1 2 3 4 0
        //2 => 10
        //1 2 10 3 4

        for (int i = size - 1; i > indexJ; i--) {
            array[i] = array[i - 1];
        }
        array[indexJ] = numberX;

        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i]);
        }
    }

}
