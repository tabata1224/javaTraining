package consallink.ecfTech._02_constructor.q002;

public class Shop {
    String name;
    int sales;

    Shop(String name, int sales) {
        this.name = name;
        this.sales = sales;
    }

    Shop() {
        this.name = "出店予定";
        this.sales = 0;
    }

    public void display() {
        System.out.println(name + ":売上高" + sales + "円");
    }
}
