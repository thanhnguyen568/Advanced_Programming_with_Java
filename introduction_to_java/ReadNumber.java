package introduction_to_java;

import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        int numbers;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter your number: ");
            numbers = scanner.nextInt();
            System.out.println("Your number: " + numbers);
        } while (numbers > 999 || numbers < 0);

        if (numbers < 10) {
            switch (numbers) {
                case 0:
                    System.out.println("Your number is Zero");
                    break;
                case 1:
                    System.out.println("Your number is One");
                    break;
                case 2:
                    System.out.println("Your number is Tow");
                    break;
                case 3:
                    System.out.println("Your number is Three");
                    break;
                case 4:
                    System.out.println("Your number is Four");
                    break;
                case 5:
                    System.out.println("Your number is Five");
                    break;
                case 6:
                    System.out.println("Your number is Six");
                    break;
                case 7:
                    System.out.println("Your number is Seven");
                    break;
                case 8:
                    System.out.println("Your number is Eight");
                    break;
                case 9:
                    System.out.println("Your number is Nine");
                    break;
            }
        } else if (numbers < 20) {
            int ones = numbers - 10;
            switch (ones) {
                case 0:
                    System.out.println("Your number is Ten");
                    break;
                case 1:
                    System.out.println("Your number is Eleven");
                    break;
                case 2:
                    System.out.println("Your number is Tween");
                    break;
                case 3:
                    System.out.println("Your number is Thirteen");
                    break;
                case 4:
                    System.out.println("Your number is Fourteen");
                    break;
                case 5:
                    System.out.println("Your number is Fifteen");
                    break;
                case 6:
                    System.out.println("Your number is Sixteen");
                    break;
                case 7:
                    System.out.println("Your number is Seventeen");
                    break;
                case 8:
                    System.out.println("Your number is Eighteen");
                    break;
                case 9:
                    System.out.println("Your number is Nineteen");
                    break;
                default:
                    System.out.println("out of ability");
                    break;
            }
        } else if (numbers < 100) {
            int tens = numbers / 10;
            int ones = numbers - tens * 10;

            switch (tens) {
                case 2:
                    switch (ones) {
                        case 0:
                            System.out.println("Your number is Twenty");
                            break;
                        case 1:
                            System.out.println("Your number is Twenty one");
                            break;
                        case 2:
                            System.out.println("Your number is Twenty Tow");
                            break;
                        case 3:
                            System.out.println("Your number is Twenty Three");
                            break;
                        case 4:
                            System.out.println("Your number is Twenty Four");
                            break;
                        case 5:
                            System.out.println("Your number is Twenty Five");
                            break;
                        case 6:
                            System.out.println("Your number is Twenty Six");
                            break;
                        case 7:
                            System.out.println("Your number is Twenty Seven");
                            break;
                        case 8:
                            System.out.println("Your number is Twenty Eight");
                            break;
                        case 9:
                            System.out.println("Your number is Twenty Nine");
                            break;
                    }
                    break;
                case 3:
                    switch (ones) {
                        case 0:
                            System.out.println("Your number is Thirty");
                            break;
                        case 1:
                            System.out.println("Your number is Thirty one");
                            break;
                        case 2:
                            System.out.println("Your number is Thirty Tow");
                            break;
                        case 3:
                            System.out.println("Your number is Thirty Three");
                            break;
                        case 4:
                            System.out.println("Your number is Thirty Four");
                            break;
                        case 5:
                            System.out.println("Your number is Thirty Five");
                            break;
                        case 6:
                            System.out.println("Your number is Thirty Six");
                            break;
                        case 7:
                            System.out.println("Your number is Thirty Seven");
                            break;
                        case 8:
                            System.out.println("Your number is Thirty Eight");
                            break;
                        case 9:
                            System.out.println("Your number is Thirty Nine");
                            break;
                    }
                    break;
            }
        }

    }

}

