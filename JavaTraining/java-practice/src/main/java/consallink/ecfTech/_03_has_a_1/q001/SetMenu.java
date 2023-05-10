package consallink.ecfTech._03_has_a_1.q001;

public class SetMenu {
    String name;
    Menu sandwitch;
    Menu drink;

    SetMenu(String name, Menu sandwitch, Menu drink) {
        this.name = name;
        this.sandwitch = sandwitch;
        this.drink = drink;
    }

    public void display() {
        System.out.println(this.name + "セット");
        System.out.println("---");
        sandwitch.display();
        drink.display();
        System.out.println("---");
        System.out.println("セット価格：" + (int) (0.8 * (this.sandwitch.price + this.drink.price)) + "円");
    }
}
