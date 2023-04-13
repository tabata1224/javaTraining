package consallink.chapter4.Training4_5.section4;

/*
 * 指示に従ってクラスを完成させてください。
 * 
 *  フィールド
 * 【型】int 【変数名】count 【初期値】なし
 * 
 * メソッド
 * ※処理内容内の引数名や{{ 計算結果 }}は適切に処理に置き換えてください。
 * 
 * 【メソッド名】countUp
 * 【戻り値】void
 * 【引数】なし
 * 【処理内容】countフィールドをインクリメントする
 * 
 * 【メソッド名】countDowns
 * 【戻り値】void
 * 【引数】なし
 * 【処理内容】countフィールドをデクリメントする
 * 
 * 【メソッド名】print
 * 【戻り値】void
 * 【引数】なし
 * 【処理内容】「"現在のカウントは" + count + "です"」を表示する
 */

public class Inspection4_5_4 {
    int count;

    public void countUp(){
        count++;
    }
    public void countDown(){
        count--;
    }
    public void print(){
        System.out.println("現在のカウントは" + count + "です");
    }
}
