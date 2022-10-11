package Array;

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

        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần thứ vị trí " + i + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Nhập số nguyên cần chèn x = ");
        int x = scanner.nextInt();

        System.out.print("Nhập vị trí cần chèn j = ");
        int j = scanner.nextInt();  //1

        int[] newArray = new int[size + 1];
        int i;
        for ( i = 0; i <= j; i++) {
            newArray[i] = array[i];
            newArray[j] = x;
        }
        for ( i = j + 1; i < size + 1; i++) {
            newArray[i] = array[j];
            j++;
        }
        System.out.println(newArray[i]);
    }
    
}
