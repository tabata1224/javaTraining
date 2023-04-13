package consallink.chapter4.Training4_4.section1;

public class Exam4_4_1 {

    public static void main(String[] args) {
        execute();
    }

    public static void execute() {

        /*
         * 以下のプログラミングを記述してください。
         * 1.Inspection4_4_1クラスからインスタンスを生成してください。
         * 2.作成したインスタンスのフィールドに100を代入してください。
         * 3.作成したインスタンスを利用してmethod()メソッドを呼び出してください。
         * 
         * 実行結果は以下のようにしてください。
         * メソッドが実行されました
         * numberには100が保存されています
         */
        Inspection4_4_1 inspection4_4_1 = new Inspection4_4_1();
        inspection4_4_1.number = 100;
        inspection4_4_1.method();
    }

}
