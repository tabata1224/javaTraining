package consallink.chapter0.debug;

public class DebugTest {

    public static void main(String[] args) {

        int num = 1;

        num++; // この時のnumの中身は「1」である
        num = stepIn(num);
        num += 83; // この時のnumの中身は「」である
        num = num - (17 * 3); // この時のnumの中身は「」である
        num = 390 * 234 + num;

        System.out.println("最終結果は" + num);
    }

    public static int stepIn(int num) {
        return num - 43; // この時のnumの中身は「」である
    }

}
