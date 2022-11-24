package ss16_io_text_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFileText {
    private static final String FILE_PATH_SOURCE = "D:\\CodeGym\\Module2_Advanced_Programming_with_Java\\src\\ss16_io_text_file\\data\\sourcefile.csv";
    private static final String FILE_PATH_TARGET = "D:\\CodeGym\\Module2_Advanced_Programming_with_Java\\src\\ss16_io_text_file\\data\\targetfile.csv";

    public static List<Fruit> readCSV() throws IOException {
        List<Fruit> fruitsList = new ArrayList<>();
        FileReader fileReader = new FileReader(FILE_PATH_SOURCE);
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

    public static void main(String[] args) throws IOException {
        List<Fruit> fruitList = readCSV();

        for (Fruit item: fruitList){
            // Đọc file
            System.out.println(item);
            // Viết file
            writeCSV(item);
        }
    }

}
