package consallink.chapter4.Training4_6.section2;

/*
 * 指示に従ってクラスを完成させてください。
 * 
 * フィールド 【アクセス修飾子】private 【型】String 【変数名】action 【初期値】なし
 * 
 * メソッド ※処理内容内の引数名や{{ 計算結果 }}は適切に処理に置き換えてください。
 * 
 * 【メソッド名】setAction 【戻り値】void 【引数】String a 【処理内容】 actionフィールドにaを設定する
 * 設定できる値は「"飛ぶ"」「"走る"」「"歩く"」「"しゃべる"」のみ それ以外の値が来た場合は「"そのアクションは現在設定できません"」と表示する
 * 
 * 【メソッド名】act 【戻り値】void 【引数】なし 【処理内容】 「action + "ことを練習中です"」と表示する
 * actionが「null」の場合は「"現在アクションは設定されていません"」と表示する
 */

public class Inspection4_6_2 {
    private String action;

    public void setAction(String a) {
        if (a == "飛ぶ" || a == "走る" || a == "歩く" || a == "しゃべる") {
            action = a;
        } else {
            System.out.println("そのアクションは現在設定できません");
        }
    }

    public void act() {
        if (action == null) {
            System.out.println("現在アクションは設定されていません");
        } else {
            System.out.println(action + "ことを練習中です");
        }
    }
}
