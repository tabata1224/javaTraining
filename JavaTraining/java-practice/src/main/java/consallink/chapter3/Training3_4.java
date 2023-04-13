package consallink.chapter3;

public class Training3_4 {

    public static void main(String[] args) {
        // 実行したい練習問題のコメントアウトを外そう
        practice1();
        practice2();
        practice3();
        practice4();
    }

    public static void practice1() {

        /*
         * 以下のfor文の()内を編集して、1から10までの数字を1行ずつ表示されるようにfor文を作成してください。
         * 表示は数字のみで改行して表示してください。
         */
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

    }

    public static void practice2() {

        /*
         * 以下に1から100までの数値を足していくwhile文を記述してください。
         * 
         * 実行結果は以下のようにしてください
         * 合計は{{ result }}です
         */

        // カウント用の変数を宣言する
        // 【型】int 【変数名】count 【初期値】1

        int result = 0;
        int count = 1;

        // while文を記述
        while (count <= 100) {
            result = result + count;
            count++;
        }
        System.out.println("合計は" + result + "です");
    }

    public static void practice3() {

        /*
         * 以下の実行結果になるように、ループ文を使用して処理を記述してください。
         * 2 4 8 16 32 64 
         */
        for (int result = 2; result <= 64; result = result * 2) {
            System.out.print(result + " ");
        }
        System.out.println("");
    }

    public static void practice4() {

        /*
         * 以下の実行結果になるように、ループ文を使用して処理を記述してください。
         * 100 50 25 12 6 3 1 
         */
        for (int result = 100; 1 <= result; result = result / 2) {
            System.out.print(result + " ");
        }
        System.out.println("");
    }
}
