package introduction_to_java;

import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final int RATE = 23000;
        int amountUSD;
        int amountVND;

        System.out.println("Nhap so USD: ");
        amountUSD = scanner.nextInt();
        System.out.println("So tien VND la: ");
        amountVND = amountUSD * RATE;
        System.out.println(amountVND);

    }

}
