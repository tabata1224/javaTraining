package consallink.ecfTech._03_has_a_1.q001;

public class Menu {
    String name;
    int price;

    Menu(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void display() {
        System.out.println(this.name + "：" + this.price + "円");
    }
}
