package day05;

public class Product {
    private String name;
    private Type type;
    private int price;

    public Product(String name, Type type, int price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }
}
