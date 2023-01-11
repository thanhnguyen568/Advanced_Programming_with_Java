package ss2_loop_array_in_java;

import java.util.Scanner;

public class DelElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;

        do {
            System.out.print("Nhập độ dài của mảng = ");
            size = scanner.nextInt();
        } while (size <= 0);

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần tử vị trí " + i + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Nhập số nguyên cần xóa x = ");
        int numberX = scanner.nextInt();

        int indexI, indexJ;
        for (indexI = indexJ = 0; indexI < size; indexI++) {
            if (array[indexI] != numberX) {
                array[indexJ] = array[indexI];  //mang cung 1 mang chay index j
                indexJ++;
            }
        }
        size = indexJ;

        System.out.println("Mảng còn lại sau khi xóa phần tử " + numberX + " là: ");
        for (indexI = 0; indexI < size; indexI++) {
            System.out.print(array[indexI] + "\t");
        }
    }

}