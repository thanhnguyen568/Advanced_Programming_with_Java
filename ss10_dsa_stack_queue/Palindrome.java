package ss10_dsa_stack_queue;

import java.util.*;

public class Palindrome {

    public static boolean checkPalindrome(String inputStr) {
        boolean check = true;
        String[] str = inputStr.split("");
        Stack<String> stack = new Stack();
        Queue<String> queue = new LinkedList<>();
        /**
         * Viết hoa từng phần tử và thêm vào stack và queue
         */
        for (String e : str) {
            e = e.toUpperCase();
            stack.push(e);
            queue.add(e);
        }
        /**
         * Nếu từng phần tử không bằng nhau thì thoát vòng lặp
         */
        while (!stack.empty()) {
            if (!stack.pop().equals(queue.remove())) {
                check = false;
                break;
            }
        }
        return check;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //  Able was I ere I saw Elba
        System.out.print("Input string: ");
        String str = scanner.nextLine();
        if(!checkPalindrome(str)){
            System.out.println("not Palindrome.");
        }else {
            System.out.println("is Palindrome.");
        }
    }

}
