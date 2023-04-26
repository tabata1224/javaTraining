package consallink.chapter3;

public class Training3_8 {

    public static void main(String[] args) {
        // 実行したい練習問題のメソッドを記述しよう
        practice1(5);
        practice1(10);
        practice1(-1);
        practice2(7);
        practice2(10);
        practice2(-1);
        practice3(10000000);
        practice4(16);
        practice5(30, 10);
        practice5(12, 3);
        practice5(30, 8);
    }

    public static void practice1(int num) {

        /*
         * 引数に渡された値まで、1から順番に数値を表示するプログラムを作成してください。
         * 引数の値が正の整数値ではない場合は、「引数には正の整数値を設定してください」と表示してください。
         * 引数が正しい場合は、その数字まで表示するループ処理を行ってください。
         * 
         * 実行結果例：引数が「5」の場合
         * 1 2 3 4 5 
         * 
         * 実行結果例：引数が「10」の場合
         * 1 2 3 4 5 6 7 8 9 10 
         * 
         * 実行結果例：引数が「-1」の場合
         * 引数には正の整数値を設定してください
         */
        if (num <= 0) {
            System.out.print("引数には正の整数値を設定してください");
        } else {
            for (int i = 1; i <= num; i++) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    /*
     * ここからの問題はAPIなどの既に作られたプログラムを利用すれば簡単に実装できてしまいます。
     * 練習だと思って、一部を除いて基本構文のみで作成してください。
     */

    public static void practice2(int num) {

        /*
         * 引数に渡された値が素数であるかどうかを判定するプログラムを作成してください。
         * 引数に渡される値が2以下の場合は、「引数には3以上の数値を設定してください」と表示してください。
         * 
         * 実行結果例：引数が「7」の場合
         * 7は素数です
         * 
         * 実行結果例：引数が「10」の場合
         * 10は素数ではありません
         * 
         * 実行結果例：引数が「-1」の場合
         * 引数には3以上の数値を設定してください
         */
        boolean prime = true; //素数かどうか
        if (num < 3) {
            System.out.println("引数には3以上の数値を設定してください");
        } else {
            for (int i = 2; i * i < num; i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.println(num + "は素数です");
            } else {
                System.out.println(num + "は素数ではありません");
            }
        }
    }

    public static void practice3(int num) {

        /*
         * 引数に渡された値を3桁区切りにして表示するプログラムを作成してください。
         * 引数に渡される値は必ず正の整数値とします。負のパターンを考える必要はありません。
         * 
         * 実行結果例：引数が「123」の場合
         * 123
         * 
         * 実行結果例：引数が「1234」の場合
         * 1,234
         * 
         * 実行結果例：引数が「1234567」の場合
         * 1,234,567
         */

        //別解としてString.formatを使う方法がある。
        String str = String.valueOf(num);
        StringBuilder strb = new StringBuilder(str);
        str = strb.reverse().toString();
        String[] strArray = str.split("");
        String resultStr = "";
        int count = 0;

        for (String s : strArray) {
            if (count != 0 && count % 3 == 0) {
                resultStr = resultStr + ",";
            }
            resultStr = resultStr + s;
            count++;
        }
        strb = new StringBuilder(resultStr);
        resultStr = strb.reverse().toString();
        System.out.println(resultStr);
    }

    public static void practice4(int num) {

        /*
         * 引数に渡される値を2進数に変換して表示するプログラムを作成してください。
         * 引数に渡される値は必ず正の整数値とします。負のパターンを考える必要はありません。
         * 
         * 実行結果例：引数が「4」の場合
         * 100
         * 
         * 実行結果例：引数が「5」の場合
         * 101
         * 
         * 実行結果例：引数が「7」の場合
         * 111
         */

        //別解としてInteger.toBinaryStringを使う方法がある。
        String binaryNumber = "";

        while (0 < num) {
            binaryNumber = binaryNumber + (num % 2);
            num = num / 2;
        }
        StringBuilder strb = new StringBuilder(binaryNumber);
        binaryNumber = strb.reverse().toString();
        System.out.println(binaryNumber);
    }

    public static void practice5(int foot, int num) {

        /*
         * ツル（足が２本）とカメ（足が４本）が全部で10匹おり、足を合計すると30本です。
         * ツルとカメはそれぞれ何匹になるでしょうか？ただし、ツルとカメはそれぞれ１匹以上いるものとします。
         * 
         * ベースとなるプログラムは用意されているので、
         * コメントアウトを解除してまるつき数字の箇所を埋めてプログラムを完成させてください。
         * 計算が合わないパターンは何も表示しないものとします。
         * 
         * 実行結果例：「foot」が「30」、「num」が「6」の場合
         * ツル=5,カメ=5
         * 
         * 実行結果例：「foot」が「30」、「num」が「8」の場合
         * ツル=1,カメ=7
         * 
         * 実行結果例：「foot」が「12」、「num」が「3」の場合
         * 
         */

        // iをカメの数としてループを回す
        for (int i = 1; i < num; i++) {
            int kame_foot = 4;
            int turu_foot = 2;
            if (foot == ((kame_foot * i) + (turu_foot * (num - i)))) {
                System.out.print("ツル=" + (num - i));
                System.out.println(",カメ=" + i);
            }
        }
    }
}
