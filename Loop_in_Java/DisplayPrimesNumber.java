package Loop_in_Java;

import java.util.Scanner;

public class DisplayPrimesNumber {

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

        System.out.print("Nhập n số nguyên tố đâu tiên = ");
        int numbers = scanner.nextInt();

        System.out.println(numbers + " số nguyên tố đầu tiên là:");

        int count = 0;
        int index = 2;
        while (count < numbers) {
            if (isPrimeNumber(index)) {
                System.out.print(index + " ");
                count++;
            }
            index++;
        }
    }

}