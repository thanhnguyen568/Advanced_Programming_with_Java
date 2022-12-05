package ss19_string_regex;

import java.util.Scanner;

public class ValidateClasses {
    private static final String CLASS_REGEX = "^[C|P|A]+[0-9]{4}[G|H|I|K|L|M]$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String classes;
        do {
            System.out.print("Input class name:");
            classes = scanner.nextLine();
        } while (!classes.matches(CLASS_REGEX));
    }
}
