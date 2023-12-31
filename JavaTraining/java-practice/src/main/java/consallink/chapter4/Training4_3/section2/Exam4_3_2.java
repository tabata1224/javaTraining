package consallink.chapter4.Training4_3.section2;

public class Exam4_3_2 {

    public static void main(String[] args) {
        execute();
    }

    public static void execute() {

        /*
         * 以下のプログラミングを記述します。
         * 1.「Inspection4_3_2」クラスからインスタンスを生成します。
         * 2.作成したインスタンスを利用して各種メソッドを呼び出します。
         * 
         * 実行結果は以下のようにしてください。
         * 3を受け取りました
         * 1.584を受け取りました
         * プログラムを受け取りました
         * 5と4.1を受け取りました
         * 5と4を掛け算すると20となります
         * 5.2と4.3を割り算すると1.2093023255813955となります
         * numberの値は「199」です
         * nameの値は「言語」です
         */

        // インスタンス生成
        Inspection4_3_2 inspection4_3_2 = new Inspection4_3_2();
        // 一つ目のメソッド呼び出し（引数：3）
        inspection4_3_2.param01(3);
        // 二つ目のメソッド呼び出し（引数：1.584）
        inspection4_3_2.param02(1.584);
        // 三つ目のメソッド呼び出し（引数："プログラム"）
        inspection4_3_2.param03("プログラム");
        // 四つ目のメソッド呼び出し（引数：5, 4.1）
        inspection4_3_2.param04(5, 4.1);
        // 五つ目のメソッド呼び出し（引数：5, 4）
        inspection4_3_2.param05(5, 4);
        // 六つ目のメソッド呼び出し（引数：5.2, 4.3）
        inspection4_3_2.param06(5.2, 4.3);
        // 七つ目のメソッド呼び出し（引数：199, "言語"）
        inspection4_3_2.param07(199, "言語");
    }

}
