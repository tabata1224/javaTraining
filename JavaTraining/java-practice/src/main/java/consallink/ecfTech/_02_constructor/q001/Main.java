package consallink.ecfTech._02_constructor.q001;

public class Main {
    public static void main(String[] args) {
        Item i1 = new Item("コーヒー", 120);
        Item i2 = new Item("オレンジジュース", 150);

        i1.display();
        i2.display();
    }
}
