package consallink.chapter4.Training4_6.section4;

/*
 * 指示に従ってクラスを完成させてください。
 * 
 * フィールド 【アクセス修飾子】private 【型】int[] 【変数名】numbers 【初期値】なし
 * 
 * メソッド ※処理内容内の引数名や{{ 計算結果 }}は適切に処理に置き換えてください。
 * 
 * 【メソッド名】コンストラクタ 【引数】なし 【処理内容】numbers配列に1-10までの数値を格納する
 * 
 * 【メソッド名】コンストラクタ 【戻り値】void 【引数】int n 【処理内容】 引数nで指定した数値から10個分の数値をnumbers配列に格納する 例：n=12の場合は12-21まで
 * 
 * 【メソッド名】print 【戻り値】void 【引数】なし 【処理内容】 numbers配列の情報を半角スペース区切りで表示する
 * 
 * 【メソッド名】getNumbers 【戻り値】int[] 【引数】なし 【処理内容】 numbers配列をreturnする
 */

public class Inspection4_6_4 {
    private int[] numbers;

    public Inspection4_6_4() {
        numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
    }

    public Inspection4_6_4(int n) {
        numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = n + i;
        }
    }

    public void print() {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i != numbers.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    public int[] getNumbers() {
        return numbers;
    }
}
