package Array;

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
            System.out.print("Nhập phần thứ vị trí " + i + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Nhập số nguyên cần xóa x = ");
        int x = scanner.nextInt();

        int i, j;
        for (i = j = 0; i < size; i++) {
            if (array[i] != x) {
                array[j] = array[i];  //mang cung 1 mang chay index j
                j++;
            }
        }
        size = j;

        System.out.println("Mảng còn lại sau khi xóa phần tử " + x + " là: ");
        for (i = 0; i < size; i++) {
            System.out.print(array[i] + "\t");
        }
    }

}