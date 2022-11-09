package ss10_dsa_stack_queue;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Reverse {

    public static ArrayList<Integer> reverseArray(ArrayList<Integer> integerArrayList) {
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        /**
         * Duyệt từng phần tử của arraylist truyền vào.
         * push từng element vào stack.
         */
        for (Integer integer : integerArrayList) {
            stack.push(integer);
        }

        /**
         * pop từng element.
         * add và lại arraylist.
         */
        while (!stack.empty()) {
            arrayList.add(stack.pop());
        }
        return arrayList;
    }

    public static String reverseString(String inputStr) {
        String[] str = inputStr.split("");
        Stack<String> wStack = new Stack<>();
        ArrayList<String> mWord = new ArrayList<>();
        String strings = "";
        /**
         * Duyệt từng phần tử của string  truyền vào.
         * push từng element vào stack.
         */
        for (String e : str) {
            wStack.push(e);
        }
        /**
         * pop từng element.
         * add và lại arraylist.
         */
        while (!wStack.empty()) {
            mWord.add(wStack.pop());
        }
        /**
         * Duyệt từng phần tử của arraylist.
         * + từng element vào strings.
         */
        for (String elements : mWord) {
            strings += elements;
        }
        return strings;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> integerArrayList = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            integerArrayList.add(i);
        }

        System.out.println("Array list before= " + integerArrayList);
        System.out.println("Array list after reverse= " + reverseArray(integerArrayList));
        System.out.println();

        System.out.print("Input string= ");
        String str = scanner.nextLine();
        System.out.println("String before= " + str);
        System.out.println("String reverse= " + reverseString(str));
    }
}
