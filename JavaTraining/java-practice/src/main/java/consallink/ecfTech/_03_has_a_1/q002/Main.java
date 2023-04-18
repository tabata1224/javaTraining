package consallink.ecfTech._03_has_a_1.q002;

public class Main {
    public static void main(String[] args) {
        Yusha taro = new Yusha("タロウ", 20, 10);
        taro.displayStatus();
        System.out.println("---");
        taro.buki = new Buki("鉄の剣", 10);
        taro.displayStatus();
    }
}
