package ss16_io_text_file.copy_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CopyFileText {
    static Scanner scanner = new Scanner(System.in);
    private static final String FILE_PATH_SOURCE = "D:\\CodeGym\\Module2_Advanced_Programming_with_Java\\src\\ss16_io_text_file\\data\\sourcefile.csv";
    private static final String FILE_PATH_TARGET = "D:\\CodeGym\\Module2_Advanced_Programming_with_Java\\src\\ss16_io_text_file\\data\\targetfile.csv";
    private static  List<Fruit> fruitArrayList = new ArrayList<>();

    public static List<Fruit> readCSV(String file_Patch) throws IOException {
        List<Fruit> fruitsList = new ArrayList<>();
        FileReader fileReader = new FileReader(file_Patch);
        BufferedReader buffer = new BufferedReader(fileReader);

        String line;
        String[] temp;
        Fruit fruits;

        while ((line = buffer.readLine()) != null) {
            temp = line.split(",");
            int no = Integer.parseInt(temp[0]);
            String name = temp[1];
            int price = Integer.parseInt(temp[2]);

            fruits = new Fruit(no, name, price);
            fruitsList.add(fruits);
        }
        buffer.close();
        return fruitsList;
    }

    public static void writeCSV(Fruit fruits) throws IOException {
        FileWriter fileWriter = new FileWriter(FILE_PATH_TARGET,true);
        BufferedWriter buffer = new BufferedWriter(fileWriter);
        buffer.write(fruits.getNo() + "," + fruits.getName() + "," + fruits.getPrice() + "\n");
        buffer.close();
    }

    public static Fruit information() {
        System.out.println("Input no.: ");
        int no = Integer.parseInt(scanner.nextLine());
        System.out.println("Input name: ");
        String name = scanner.nextLine();
        System.out.println("Input price: ");
        int price = Integer.parseInt(scanner.nextLine());

        return new Fruit(no, name, price);
    }

    public static void createNew() throws IOException {
        System.out.println("Create a new fruit...");
        Fruit fruit = information();
        // add vào List
        fruitArrayList.add(fruit);
        // Ghi vào file
        writeCSV(fruit);
        System.out.println("Create a new fruit successful.");
    }

    public static void updateObject() throws IOException {
        int id;

        do {
            System.out.print("Input no. wanna edit=");
            id = Integer.parseInt(scanner.nextLine());
        } while (id < 1000);

        boolean found = false;
        for (int i = 0; i < fruitArrayList.size(); i++) {
            if (id == fruitArrayList.get(i).getNo()) {
                fruitArrayList.set(i, information());
                found = true;
                System.out.println("Edit successful!");
            }
        }
        if (!found) {
            System.out.println("Not found");
        }
        //..
    }

    public static void main(String[] args) throws IOException {

        fruitArrayList = readCSV(FILE_PATH_SOURCE);

        for (Fruit item : fruitArrayList) {
            // Đọc file
            System.out.println(item);
            // Ghi file
            writeCSV(item);
        }

//        createNew();
        updateObject();
    }

}
