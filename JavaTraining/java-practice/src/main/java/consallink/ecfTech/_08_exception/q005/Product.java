package consallink.ecfTech._08_exception.q005;

public class Product {
    String name;
    int price;

    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return this.name + ":" + this.price + "円";
    }
}
