package io_text_file;

public class Animal {
    private int id;
    private String name;
    private String weight;

    public Animal() {
    }

    public Animal(int id, String name, String weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getInfo() {
        String data;
        return data = String.format("%s,%s,%s \n", getId(), getName(), getWeight());
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }
}
