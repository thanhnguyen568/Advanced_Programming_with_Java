package ss10_dsa_stack_queue;

import java.util.*;

public class CountByTreeMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input String: ");
        String inputStr = scanner.nextLine();
        String[] str = inputStr.split("");

        /**
         * UpperCaser
         */
        for (int i = 0; i < str.length; i++) {
            if (!str[i].equals(" ")) {
                str[i] = str[i].toUpperCase();
            }
        }
        System.out.println(Arrays.toString(str));
        /**
         *  Check key and update value
         */
        Map<String, Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < str.length; i++) {
            if (!treeMap.containsKey(str[i]) && str[i] != " " ) {
                treeMap.put(str[i], 1);
            } else {
                treeMap.put(str[i], treeMap.get(str[i])+1);
            }
        }
        /**
         * Display treemap
         */
        System.out.println("Display treemap: ");
        for (Map.Entry<String, Integer> item : treeMap.entrySet()) {
            System.out.printf("%s - %s\n", item.getKey(), item.getValue());
        }
    }
}
