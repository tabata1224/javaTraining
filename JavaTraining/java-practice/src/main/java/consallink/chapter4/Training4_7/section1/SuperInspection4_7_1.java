package consallink.chapter4.Training4_7.section1;

/*
 * 指示に従ってクラスを完成させてください。
 * 
 * メソッド ※処理内容内の引数名や{{ 計算結果 }}は適切に処理に置き換えてください。
 * 
 * 【メソッド名】search 【戻り値】int 【引数】String[] array, int start, String data 【処理内容】
 * 第一引数の配列内に第三引数の文字列が含まれているかどうかをチェックする 第二引数は検索をスタートする配列番号の位置
 * 検索にヒットした場合は配列番号を、検索にヒットしなかった場合は-1を戻り値として返す
 */

public class SuperInspection4_7_1 {
    public int search(String[] array, int start, String data) {
        int answer = -1;
        for (int i = start; i < array.length; i++) {
            if (array[i].equals(data)) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}
