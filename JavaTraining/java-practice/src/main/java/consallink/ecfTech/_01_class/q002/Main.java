package consallink.ecfTech._01_class.q002;

public class Main {
    public static void main(String[] args) {
        Shop s1 = new Shop();
        Shop s2 = new Shop();
        s1.name = "パン屋";
        s1.sale = 100000;
        s2.name = "洋服屋";
        s2.sale = 150000;
        System.out.println("パン屋 売上:" + s1.sale);
        System.out.println("洋服屋 売上:" + s2.sale);
    }
}
