package ss19_string_regex;

import java.util.Scanner;

public class ValidatePhone {
    private static final String PHONE_REGEX = "^[(](84)[)][-][(][0][0-9]{9}[)]$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String phoneNumber;
        do {
            System.out.print("Input phone number:");
            phoneNumber = scanner.nextLine();
        } while (!phoneNumber.matches(PHONE_REGEX));
    }
}
