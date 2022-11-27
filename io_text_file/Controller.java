package io_text_file;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Controller {
    private static final String READ_PATH = "D:\\CodeGym\\Module2_Advanced_Programming_with_Java\\src\\io_text_file\\data\\animal.csv";
    private static final String WRITE_PATH = "D:\\CodeGym\\Module2_Advanced_Programming_with_Java\\src\\io_text_file\\data\\writeAnimal.csv";
    static Scanner scanner = new Scanner(System.in);
    static int choice;

    public static void displayMenu() {
        do {
            System.out.println("Main Menu");
            System.out.println("1.Animal Management");
            System.out.println("2.Exit");
        } while (choice < 0 || choice > 2);

        switch (choice) {
            case 1:
                System.out.println("Animal Management: ");
                animalManagement();
                break;
            case 2:
                System.exit(0);
                break;
        }
    }

    public static void animalManagement() {

        do {
            System.out.println("1.Create a new ");
            System.out.println("2.Display list ");
            System.out.println("3.Update a ");
            System.out.println("4.Delete a ");
            System.out.println("5.Exit");
            choice = Integer.parseInt(scanner.nextLine());
        } while (choice < 0 || choice > 5);

        switch (choice) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                System.out.println("Exit successful.");
                System.exit(0);
                break;
        }
    }

    public static void main(String[] args) throws IOException {

        List<Animal> animals = ReadFileUtil.readFile(READ_PATH);
        for (Animal animal : animals) {
            System.out.println(animal);
        }

        WriteFileUtil.writeAnimalFile(WRITE_PATH, animals);
    }

}
