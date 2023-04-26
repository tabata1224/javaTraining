package consallink.chapter6;

public class Print {
    //一般の表示
    public static void print(String str) {
        System.out.print("\n" + str + "\n");
    }

    //商品の表示
    public static void printItem(int drinkNumber, String name, int price) {
        System.out.println(drinkNumber + " : " + name + " : " + price + "円");
    }
}
