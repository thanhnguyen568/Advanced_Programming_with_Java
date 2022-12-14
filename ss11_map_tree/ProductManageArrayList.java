package ss11_map_tree;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductManageArrayList {
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
        System.out.print("Input ID: ");
        id = Integer.parseInt(scanner.nextLine());
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
            System.out.println("Remove successful " + productList.get(id));
            productList.remove(id);
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

        System.out.println("-----Test display");
        displayList();

        System.out.println("-----Test add");
        addProduct();

        System.out.print("-----Test edit id: ");
        int edit = Integer.parseInt(scanner.nextLine());
        editItem(edit);

        System.out.print("-----Test remove id: ");
        int remove = Integer.parseInt(scanner.nextLine());
        removeItem(remove);

        System.out.print("-----Test display id: ");
        int displayOne = Integer.parseInt(scanner.nextLine());
        displayProduct(displayOne);
    }
}
