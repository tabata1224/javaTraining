package consallink.chapter4.Training4_3.section1;

public class Exam4_3_1 {

    public static void main(String[] args) {
        execute();
    }

    public static void execute() {

        /*
         * 以下のプログラミングを記述します。
         * 1.「Inspection4_3_1」クラスからインスタンスを生成します。
         * 2.作成したインスタンスを利用して各種メソッドを呼び出します。
         * 
         * 実行結果は以下のようにしてください。
         * method01()が実行されました
         * method02()が実行されました
         */

        // インスタンス生成.
        Inspection4_3_1 inspection4_3_1 = new Inspection4_3_1();
        // 一つ目のメソッド呼び出し
        inspection4_3_1.method01();
        // 二つ目のメソッド呼び出し
        inspection4_3_1.method02();
    }

}
