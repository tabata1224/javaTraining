package consallink.chapter4.Training4_7.section1;

/*
 * 指示に従ってクラスを完成させてください。
 * 
 * SuperInspection4_7_1クラスを継承する
 * 
 * メソッド ※処理内容内の引数名や{{ 計算結果 }}は適切に処理に置き換えてください。
 * 
 * 【メソッド名】search（オーバーライドして作成） 【戻り値】int 【引数】String[] array, int start, String data 【処理内容】
 * 第一引数の配列内に第三引数の文字列が含まれているかどうかをチェックする 第二引数は検索をスタートする配列番号の位置
 * ただし、親クラスのsearch()と違い、重複データも考慮する為、戻り値は以下のように変更する 検索にヒットした場合はヒットした件数を、検索にヒットしなかった場合は0を戻り値として返す
 */

public class Inspection4_7_1 extends SuperInspection4_7_1 {
    public int search(String[] array, int start, String data) {
        int count = 0;
        for (int i = start; i < array.length; i++) {
            if (array[i] == data) {
                count++;
            }
        }
        return count;
    }
}
