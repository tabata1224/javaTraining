package consallink.chapter4.Training4_3.section4;

/*
 * 指示に従ってクラスを完成させてください。
 * 
 * メソッド ※処理内容内の引数名や{{ 計算結果 }}は適切に処理に置き換えてください。
 * 
 * 【メソッド名】divi 【戻り値】double 【引数】double x, double y 【処理内容】xとyを除算し、その結果をreturnする
 * 
 * 【メソッド名】check 【戻り値】boolean 【引数】String x, String y 【処理内容】xとyの文字列を比較し、その結果をbooleanでreturnする
 * 
 * 【メソッド名】sum 【戻り値】int 【引数】int[] array 【処理内容】引数で受け取った配列内の値を全て加算した結果をreturnする
 */

public class Inspection4_3_4 {

    // メソッド
    public double divi(double x, double y) {
        return x / y;
    }

    public boolean check(String x, String y) {
        return (x == y);
    }

    public int sum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum = sum + num;
        }
        return sum;
    }
}
