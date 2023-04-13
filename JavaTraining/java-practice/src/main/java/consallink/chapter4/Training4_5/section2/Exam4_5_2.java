package consallink.chapter4.Training4_5.section2;

public class Exam4_5_2 {

    public static void main(String[] args) {
        execute();
    }

    public static void execute() {

        /*
         * 以下のプログラミングを記述してください
         * 1.Inspection4_5_2クラスからインスタンスを生成してください
         * 2.「param01」メソッドを引数（10）で呼び出してください
         * 3.「param02」メソッドを引数（0.9）で呼び出してください
         * 4.「param03」メソッドを引数（"文字列"）で呼び出してください
         * 
         * 実行結果は以下のようにしてください。
         * 10を受け取りました
         * 0.9を受け取りました
         * 文字列を受け取りました
         */
        Inspection4_5_2 inspection4_5_2 = new Inspection4_5_2();
        inspection4_5_2.param01(10);
        inspection4_5_2.param02(0.9);
        inspection4_5_2.param03("文字列");
    }

}
