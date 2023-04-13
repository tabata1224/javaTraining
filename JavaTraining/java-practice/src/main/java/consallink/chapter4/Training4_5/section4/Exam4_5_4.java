package consallink.chapter4.Training4_5.section4;

public class Exam4_5_4 {

    public static void main(String[] args) {
        execute();
    }

    public static void execute() {

        /*
         * 以下のプログラミングを記述してください
         * 1.Inspection4_5_4クラスからインスタンスを生成してください
         * 2.「countUp」メソッドを3回呼び出してください
         * 3.「countDown」メソッドを1回呼び出してください
         * 4.「print」メソッドを呼び出してください
         * 
         * 実行結果は以下のようにしてください。
         * 現在のカウントは2です
         */
        Inspection4_5_4 inspection4_5_4 = new Inspection4_5_4();
        inspection4_5_4.countUp();
        inspection4_5_4.countUp();
        inspection4_5_4.countUp();
        inspection4_5_4.countDown();
        inspection4_5_4.print();

    }

}
