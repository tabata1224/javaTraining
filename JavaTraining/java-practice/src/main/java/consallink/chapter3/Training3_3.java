package consallink.chapter3;

public class Training3_3 {

    public static void main(String[] args) {
        // 実行したい練習問題のコメントアウトを外そう
        practice1();
        practice2();
        practice3();
    }

    public static void practice1() {

        /*
         * 以下の変数を作成してください。表示や演算には作成した変数を利用すること。
         * 【型】String 【変数名】student_name 【初期値】"田中"
         * 【型】int 【変数名】japanese_score 【初期値】85
         * 【型】int 【変数名】mathematical_score 【初期値】66
         * 【型】double 【変数名】average_score 【初期値】国語の点数と数学の点数の平均値
         */

        String student_name = "田中";
        int japanese_score = 85;
        int mathematical_score = 66;
        double average_score = (japanese_score + mathematical_score) / 2.0;

        // 国語の点数を表示して下さい
        // 出力結果指示：「田中さんの国語の点数は85点です。」
        System.out.println(student_name + "さんの国語の点数は" + japanese_score + "点です。");

        // 数学の点数を表示して下さい
        // 出力結果指示：「田中さんの数学の点数は66点です。」
        System.out.println(student_name + "さんの数学の点数は" + mathematical_score + "点です。");

        // 国語と数学の平均点を表示して下さい
        // 出力結果指示：「田中さんの平均点は75.5点です。」
        System.out.println(student_name + "さんの平均点は" + average_score + "点です。");

        /*
         * 以下のifを作成して下さい
         * 出力結果指示：
         * 平均点が65点以上の場合、「合格です。」と表示
         * 平均点が65点に満たないの場合、「不合格です。」と表示
         */
        if (65 <= average_score) {
            System.out.println("合格です。");
        } else {
            System.out.println("不合格です。");
        }
    }

    public static void practice2() {

        /*
         * practice1のプログラムを更に改善してみましょう。
         * コメント以外の処理をコピーしてから作業をしてください。
         * 
         * 指示1：平均点によって表示を変更するif文を以下のように変更してください。
         * 平均点が80点以上の場合、表示内容「高得点！おめでとう。」
         * 平均点が65点以上で79点以下の場合、表示内容「もう少しで高得点。」
         * 平均点が35点以上で64点以下の場合、表示内容「もう少し頑張りましょう。」
         * 平均点が34点以下の場合、表示内容「追試です。」
         * 
         * 指示2：国語と数学の平均点を任意で変更し、全ての結果が表示されることを確認してください。
         */

        String student_name = "田中";
        int japanese_score = 85;
        int mathematical_score = 66;
        double average_score = (japanese_score + mathematical_score) / 2.0;

        System.out.println(student_name + "さんの国語の点数は" + japanese_score + "点です。");

        System.out.println(student_name + "さんの数学の点数は" + mathematical_score + "点です。");

        System.out.println(student_name + "さんの平均点は" + average_score + "点です。");

        if (80 <= average_score) {
            System.out.println("高得点！おめでとう。");
        } else if (65 <= average_score) {
            System.out.println("もう少しで高得点。");
        } else if (35 <= average_score) {
            System.out.println("もう少し頑張りましょう。");
        } else {
            System.out.println("追試です。");
        }
    }

    public static void practice3() {

        /*
         * 自販機を模したプログラム
         * この自販機では500円、100円、50円、10円の硬貨しか扱えないものとし、
         * お釣りも上記の硬貨を組み合わせたものとなります。
         * 自販機の飲み物は全て160円とします。
         */

        // 投入金額
        int entry_amount = 1000;
        int medal_500 = 0; //500円玉   
        int medal_100 = 0; //100円玉
        int medal_50 = 0; //50円玉
        int medal_10 = 0; //10円玉

        System.out.println("投入金額は" + entry_amount + "円です");

        if (entry_amount == 160) {
            System.out.println("ドリンクが購入できました【お釣りなし】");
        } else if (160 < entry_amount) {
            entry_amount = entry_amount - 160;
            System.out.println("ドリンクが購入できました【お釣りあり】");

            medal_500 = entry_amount / 500;
            entry_amount = entry_amount - 500 * medal_500;
            System.out.println("500円：" + medal_500 + "枚");

            medal_100 = entry_amount / 100;
            entry_amount = entry_amount - 100 * medal_100;
            System.out.println("100円：" + medal_100 + "枚");

            medal_50 = entry_amount / 50;
            entry_amount = entry_amount - 50 * medal_50;
            System.out.println("50円：" + medal_50 + "枚");

            medal_10 = entry_amount / 10;
            entry_amount = entry_amount - 10 * medal_10;
            System.out.println("10円：" + medal_10 + "枚");
        } else {
            System.out.println("金額が足りません");
        }
        /*
         * 条件分岐を利用して以下を表示してください。
         * 投入金額が160円の場合、表示内容「ドリンクが購入できました【お釣りなし】」
         * 投入金額が160円より多い場合、表示内容「ドリンクが購入できました【お釣りあり】」
         * 投入金額が160円より少ない場合、表示内容「金額が足りません」
         * 
         * お釣りがある場合は上記の表示後に、以下の形式で枚数を表示してください。
         * 500円：{{ 枚数 }}枚
         * 100円：{{ 枚数 }}枚
         * 50円：{{ 枚数 }}枚
         * 10円：{{ 枚数 }}枚
         * 
         * プログラムを作成後、投入金額を任意で変更し、全ての結果が表示されることを確認してください。
         */
    }
}
