package ss11_map_tree;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManage {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Product> productList = new ArrayList();

    static {
        productList.add(new Product(0, "apple", 1000));
        productList.add(new Product(1, "banana", 1100));
        productList.add(new Product(2, "cake", 1200));
    }

    static int id = 2;

    static Product inputInfo() {
        System.out.println("Information a Product:");
        id++;
        System.out.print("Input product name: ");
        String productName = scanner.nextLine();
        System.out.print("Input price: ");
        double price = Double.parseDouble(scanner.nextLine());

        return new Product(id, productName, price);
    }

    public static void addProduct() {
        Product temp = inputInfo();
        productList.add(temp);
        System.out.println("Create a product successful");
        displayList();
    }

    public static void displayList() {
        System.out.println("Product list: ");
        if (productList.size() == 0) {
            System.out.println("List is Empty");
        } else {
            for (int i = 0; i < productList.size(); i++) {
                System.out.println(productList.get(i));
            }
        }
    }

    public static void removeItem(int id) {
        if (!productList.contains(productList.get(id))) {
            System.out.println("Not found");
        } else {
            productList.remove(id);
            System.out.println("Remove successful " + productList.get(id));
        }
        displayList();
    }

    public static void editItem(int id) {
        if (!productList.contains(productList.get(id))) {
            System.out.println("Not found");
        } else {
            productList.set(id, inputInfo());
            System.out.println("Edit a product have id: " + id + " successful");
        }
        displayList();
    }

    public static void displayProduct(int id) {
        if (!productList.contains(productList.get(id))) {
            System.out.println("Not found");
        } else {
            System.out.println(productList.get(id));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Test display");
        displayList();
        System.out.println("-----");

        System.out.println("Test add");
        addProduct();
        System.out.println("-----");

        System.out.println("Test edit id 1");
        int edit = Integer.parseInt(scanner.nextLine());
        editItem(edit);
        System.out.println("-----");

        System.out.println("Test remove id 2");
        removeItem(2);

        System.out.println("Test display id 0");
        displayProduct(0);
        displayProduct(1);
    }
}
