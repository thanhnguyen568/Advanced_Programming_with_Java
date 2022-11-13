package ss10_dsa_stack_queue;

import java.util.*;

public class CountByTreeMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> countStr = new TreeMap<>();
        Queue<String> queue = new LinkedList<>();
        /**
         * Input String
         */
        System.out.print("Input String: ");
        String inputStr = scanner.nextLine();
        String[] str = inputStr.split("");
        /**
         * Remove spaces, UpperCaser, add LinkedList
         */
        for (int i = 0; i < str.length; i++) {
            if (!str[i].equals(" ")) {
                str[i] = str[i].toUpperCase();
                queue.add(str[i]);
            }
        }
        System.out.println(queue);
        /**
         *
         */
        int count = 1;
        for (String key : queue) {
            if (!queue.contains(key)) {
                countStr.put(key, count);
            } else {
                countStr.put(key,count++);
            }
        }

        for (Map.Entry<String, Integer> item : countStr.entrySet()) {
            System.out.printf("%s - %s\n", item.getKey(), item.getValue());
        }

    }

}
