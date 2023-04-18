package consallink.ecfTech._01_class.q001;

public class Main {
    public static void main(String[] args) {
        Item ringo = new Item();
        Item banana = new Item();
        ringo.name = "リンゴ";
        ringo.price = 150;
        banana.name = "バナナ";
        banana.price = 100;
        System.out.println(ringo.name);
        System.out.println(ringo.price);
        System.out.println(banana.name);
        System.out.println(banana.price);
    }
}
