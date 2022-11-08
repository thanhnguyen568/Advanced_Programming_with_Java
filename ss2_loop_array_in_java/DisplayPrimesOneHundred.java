package ss2_loop_array_in_java;

import java.util.Scanner;

public class DisplayPrimesOneHundred {
    public static boolean isPrimeNumber(int numbers) {

        if (numbers < 2) {
            return false;
        } else if (numbers == 2) {
            return true;
        } else if (numbers % 2 == 0) {
            return false;
        } else {
            for (int i = 3; i <= Math.sqrt(numbers); i += 2) {
                if (numbers % i == 0) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hiển thị số nguyên tố nhỏ hơn n = ");
        int numbers = scanner.nextInt();

        System.out.println("Hiển thị số nguyên tố nhỏ hơn: " + numbers);
        for (int i = 2; i < numbers; i++) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }

}
