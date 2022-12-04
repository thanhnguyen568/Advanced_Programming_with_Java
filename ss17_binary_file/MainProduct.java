package ss17_binary_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainProduct {
    static Scanner scanner = new Scanner(System.in);
    private static final String FILE_PATH = "D:\\CodeGym\\Module2_Advanced_Programming_with_Java\\src\\ss17_binary_file\\product.txt";

    public static void main(String[] args) {
        List<MyProduct> myProductList = new ArrayList<>();
        myProductList.add(new MyProduct(1, "Mazda3", "Mazda", 20000, "JP"));
        myProductList.add(new MyProduct(2, "K3", "Kia", 10000, "KR"));
        myProductList.add(new MyProduct(3, "Mercedes", "Germany", 10000, "GER"));
        writeFile(FILE_PATH, myProductList);

        int choice;
        do {
            try {
                System.out.println("1.Display product");
                System.out.println("2.Create a new product");
                System.out.println("3.Find product by codeProduct");
                System.out.print("Input option:");
                choice = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.err.println("Wrong number format");
                choice = Integer.parseInt(scanner.nextLine());
            }
        } while (choice < 0 | choice > 3);
    }

    public static List<MyProduct> readFile(String FILE_PATH) {
        List<MyProduct> myProductList = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(FILE_PATH);
            ObjectInputStream ois = new ObjectInputStream(fis);
            myProductList = (List<MyProduct>) ois.readObject();
            ois.close();
            fis.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return myProductList;
    }

    public static void writeFile(String FILE_PATH, List<MyProduct> myProductList) {
        try {
            FileOutputStream fos = new FileOutputStream((FILE_PATH));
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(myProductList);
            oos.close();
            fos.close();
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
