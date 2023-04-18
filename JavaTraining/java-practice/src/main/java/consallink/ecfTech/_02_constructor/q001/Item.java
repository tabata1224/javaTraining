package consallink.ecfTech._02_constructor.q001;

public class Item {
    String name;
    int price;

    Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void display() {
        System.out.println(name + ":" + price + "円");
    }
}
