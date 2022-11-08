package ss3_method;

import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strings = createArray();

        System.out.print("Nhập ký tự cần đếm = ");
        String character = scanner.next();

        int count = 0;

        for (int i = 0; i < strings.length; i++) {
            if (character.equals(strings[i])) {
                count++;
            }
        }

        System.out.println("Số lần xuất hiện ký tự trong chuỗi = " + count);
    }

    // METHOD NEW ARRAY AND RETURN ARRAY
    public static String[] createArray() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập độ dài của chuỗi = ");
        int size = scanner.nextInt();
        String[] array = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần tử vị trí " + i + ": ");
            array[i] = scanner.next();
        }

        return array;
    }

}
