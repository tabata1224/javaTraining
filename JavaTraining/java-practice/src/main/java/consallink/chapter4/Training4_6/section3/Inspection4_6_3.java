package consallink.chapter4.Training4_6.section3;

/*
 * 指示に従ってクラスを完成させてください。
 * 
 * フィールド 【アクセス修飾子】private 【型】int[] 【変数名】numbers 【初期値】なし
 * 
 * メソッド ※処理内容内の引数名や{{ 計算結果 }}は適切に処理に置き換えてください。
 * 
 * 【メソッド名】setNumbers 【戻り値】void 【引数】int a 【処理内容】numbers配列の0番目に引数の値を格納する
 * 
 * 【メソッド名】setNumbers 【戻り値】void 【引数】int a, int b 【処理内容】 numbers配列に引数aからbまでの値を順序良く格納する
 * 例：5,10の場合は5から10の6つが配列に格納される 引数のデータがa >= bとなっている場合は、 「”setNumbers(int a, int b)の引数はa <
 * bとなるように設定してください”」と表示する
 * 
 * 【メソッド名】print 【戻り値】void 【引数】なし 【処理内容】 numbers配列の情報を半角スペース区切りで表示する
 */

public class Inspection4_6_3 {
    private int[] numbers;

    public void setNumbers(int a) {
        numbers = new int[1];
        numbers[0] = a;
    }

    public void setNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("setNumbers(int a, int b)の引数はa < bとなるように設定してください");
        } else {
            numbers = new int[b - a + 1];
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = a+i;
            }
        }
    }

    public void print() {
        System.out.println("現在配列には以下の数値が保存されています");
        for (int i = 0;i < numbers.length ;i++) {
            System.out.print(numbers[i]);
            if(i != numbers.length - 1){
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
