package ss16_io_text_file;

public class Fruit {
    private int no;
    private String name;
    private int price;

    public Fruit() {
    }

    public Fruit(int no, String name, int price) {
        this.no = no;
        this.name = name;
        this.price = price;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fruits{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
