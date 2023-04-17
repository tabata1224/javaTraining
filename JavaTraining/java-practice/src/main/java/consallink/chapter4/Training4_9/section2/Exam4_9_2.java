package consallink.chapter4.Training4_9.section2;

public class Exam4_9_2 {
    public static void main(String[] args) {
        execute("hoge", false);
    }

    public static void execute(String country, boolean isKana) {

        /*
         * 以下のプログラミングを記述してください
         * 1.ThanksConverterクラスからインスタンスを生成してください
         * 2.生成したインスタンスを利用して引数で渡される国のありがとうを表示してください
         * 3.表示の方法は実行結果を参考にしてください
         * 
         * 実行結果は以下のようにしてください。
         * 引数が（"ita", false）の場合
         * itaのありがとう
         * Grazie
         * 
         * 引数が（"fra", true）の場合
         * fraのありがとう
         * メルシー
         * 
         * 引数が（"hoge", false）の場合
         * hogeのありがとう
         * 該当なし
         */

        ThanksConverter thanksConverter = new ThanksConverter();
        System.out.println(country + "のありがとう");
        System.out.println(thanksConverter.convert(country, isKana));
    }
}
