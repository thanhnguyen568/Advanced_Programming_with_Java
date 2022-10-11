package Loop_in_Java;

import java.util.Scanner;

public class DisplayPrimes100 {
    public static boolean isPrimeNumber(int n) {

        if (n < 2) {
            return false;
        } else if (n == 2) {
            return true;
        } else if (n % 2 == 0) {
            return false;
        } else {
            for (int i = 3; i <= Math.sqrt(n); i += 2) {
                if (n % i == 0) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hiển thị số nguyên tố nhỏ hơn n = ");
        int n = scanner.nextInt();

        System.out.println("Hiển thị số nguyên tố nhỏ hơn: " + n);
        for (int i = 2; i < n; i++) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }

}
