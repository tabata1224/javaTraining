package consallink.chapter4.Training4_7.section1;

public class Exam4_7_1 {

    public static void main(String[] args) {
        execute("営業");
    }

    public static void execute(String data) {

        /*
         * 以下のプログラミングを記述してください
         * 1.String配列「array」を宣言し、{"営業","システム","人事","総務","管理","営業"}の値で初期値を設定してください
         * 2.Inspection4_7_1クラスからインスタンスを生成してください
         * 3.「search」メソッドを引数（array, 0, data）呼び出し、戻り値は任意の変数に保存してください
         * 4.任意の変数を利用し、検索結果「{{ 戻り値 }} + "件ヒットしました"」を表示してください
         * 5.SuperInspection4_7_1クラスからインスタンスを生成してください
         * 6.「search」メソッドを引数（array, 0, data）呼び出し、戻り値は任意の変数に保存してください
         * 7.任意の変数を利用し、検索結果「{{ 戻り値 }} + "番目にありました"」を表示してください
         * 
         * 実行結果は以下のようにしてください。
         * 2件ヒットしました
         * 0番目にありました
         */
        String[] array = {"営業","システム","人事","総務","管理","営業"};
        Inspection4_7_1 inspection4_7_1 = new Inspection4_7_1();
        int count = inspection4_7_1.search(array, 0, data);
        System.out.println(count + "件ヒットしました");

        SuperInspection4_7_1 superInspection4_7_1 = new SuperInspection4_7_1();
        int number = superInspection4_7_1.search(array, 0, data);
        System.out.println(number + "番目にありました");
        }


    }