package consallink.ecfTech._08_exception.q002;

public class Main {
    public static void main(String[] args) {
        try {
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);
            System.out.println(x / y);
        } catch (ArithmeticException e) {
            System.out.println("割る数が0になっています");
        } catch (Exception e) {
            System.out.println("引数は2つの数値を指定してください");
        } finally {
            System.out.println("プログラムを終了します");
        }
    }
}
