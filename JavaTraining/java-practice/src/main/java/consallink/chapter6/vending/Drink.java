package consallink.chapter6.vending;

public class Drink {

    public int price;
    public String name;
    public boolean isBuy = false;

    Drink(String name, int price) {
        this.name = name;
        
        this.price = price;
    }
}
