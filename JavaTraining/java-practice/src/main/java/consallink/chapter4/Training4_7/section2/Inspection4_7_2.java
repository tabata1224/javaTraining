package consallink.chapter4.Training4_7.section2;

/*
 * 指示に従ってクラスを完成させてください。
 * 
 * SuperInspection4_7_2クラスを継承する
 * 
 * メソッド ※処理内容内の引数名や{{ 計算結果 }}は適切に処理に置き換えてください。
 * 
 * 【メソッド名】execute 【戻り値】double 【引数】int number, int count 【処理内容】
 * 第一引数の数値(%)を第二引数分繰り返したときに、何パーセントの確率で当選するかを戻り値で返す 例えば、30(%)を3回繰り返すと、65.7(%)がリターンされる
 * ※乗算は親クラスのメソッドを使用すること
 */

public class Inspection4_7_2 extends SuperInspection4_7_2 {
    double execute(int number, int count) {
        double probability = number / 100.0;
        probability = 1 - probability;
        return 100 * (1 - power(probability, count));
    }
}
