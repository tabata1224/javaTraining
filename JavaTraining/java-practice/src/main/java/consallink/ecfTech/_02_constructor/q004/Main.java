package consallink.ecfTech._02_constructor.q004;

public class Main {
    public static void main(String[] args) {
        //ここにプログラムを書きます。
        Daikei d1 = new Daikei(12, 8, 5);
        Daikei d2 = new Daikei(8, 4, 10);

        System.out.println(d1.getMenseki());
        System.out.println(d2.getMenseki());
    }
}
