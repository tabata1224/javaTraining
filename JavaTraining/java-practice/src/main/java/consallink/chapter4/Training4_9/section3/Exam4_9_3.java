package consallink.chapter4.Training4_9.section3;

public class Exam4_9_3 {

    public static void main(String[] args) {
        execute("太郎", "プードル", "白");
        execute("太郎", "ゴールデンレトリバー", "赤");
    }

    public static void execute(String name, String type, String color) {

        /*
         * 以下のプログラミングを記述してください
         * 1.Dogクラスからインスタンスを生成してください
         * 2.インスタンスには引数（name, type, color）の値をセットしてください
         * 3.セットされたデータを表示してください
         */
        Dog dog = new Dog(name, type, color);
        dog.info();
    }
}
