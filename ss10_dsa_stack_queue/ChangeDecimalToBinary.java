package ss10_dsa_stack_queue;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class ChangeDecimalToBinary {

    public static ArrayList<Integer> numBinary(int numDecimal) {
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        while (numDecimal > 0) {
            stack.push(numDecimal % 2);
            numDecimal /= 2;
        }

        while (!stack.isEmpty()) {
            arrayList.add(stack.pop());
        }

        return arrayList;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Deciaml: ");
        int number = Integer.parseInt(scanner.nextLine());
        Object[] arr = numBinary(number).toArray();

        System.out.print("Output Binary: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

}
