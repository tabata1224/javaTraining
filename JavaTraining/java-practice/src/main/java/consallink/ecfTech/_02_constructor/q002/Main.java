package consallink.ecfTech._02_constructor.q002;

public class Main {
    public static void main(String[] args) {
        Shop s1 = new Shop("A町店", 150000);
        Shop s2 = new Shop("B公園前店", 180000);
        Shop s3 = new Shop();

        s1.display();
        s2.display();
        s3.display();
    }
}
