package consallink.chapter3;

public class Training3_6 {
    public static void main(String[] args) {
        // 実行したい練習問題のコメントアウトを外そう
        //practice1();
        //practice2();
        //practice3();
        //practice4();
        practice5();
    }

    public static void practice1() {

        /*
         * 以下の配列を作成してください(newでも初期化子でも可)。
         * 
         * データ型：String[]
         * 配列名：jp_week
         * データ："日","月","火","水","木","金","土"
         * 
         * 
         * データ型：String[]
         * 配列名：en_week
         * データ："Sun.","Mon.","Tue.","Wed.","Thu.","Fri.","Sat."
         * 
         * 「○曜日は英語では○です」という表示を全曜日分表示されるようにしてください。
         * ただし、配列とループ文を利用して表示してください。
         * 
         * 実行結果は以下のようにしてください。
         * 日曜日は英語ではSun.です
         * 月曜日は英語ではMon.です
         * 火曜日は英語ではTue.です
         * 水曜日は英語ではWed.です
         * 木曜日は英語ではThu.です
         * 金曜日は英語ではFri.です
         * 土曜日は英語ではSat.です
         */
        String[] jp_week = {"日","月","火","水","木","金","土"};
        String[] en_week = {"Sun.","Mon.","Tue.","Wed.","Thu.","Fri.","Sat."};

        for(int i = 0;i < jp_week.length;i++){
            System.out.println(jp_week[i] + "曜日は英語では" + en_week[i] + "です");
        }
    }

    public static void practice2() {

        /*
         * 以下の配列を作成してください(newでも初期化子でも可)。
         * 
         * データ型：int[]
         * 配列名：numbers
         * データ：21,54,19,68,49,37,3,15,34,6
         * 
         * データ型：int
         * 変数名：min
         * 
         * データ型：int
         * 変数名：max
         * 
         * numbers配列内で最も小さい数値と最も大きい数値を検索し表示してください。
         * （最小値はminという変数に格納し表示）
         * （最小値はmaxという変数に格納し表示）
         * 
         * 実行結果は以下のようにしてください。
         * 配列内の最も小さい数値は「3」です
         * 配列内の最も大きい数値は「68」です
         */

        // System.out.println("配列内の最も小さい数値は「" + min + "」です");
        // System.out.println("配列内の最も大きい数値は「" + max + "」です");
        int[] numbers = {21,54,19,68,49,37,3,15,34,6};
        int min = numbers[0];
        int max = numbers[0];
        for(int i = 0;i < numbers.length;i++){
            if(numbers[i] < min){
                min = numbers[i];
            }
            if(max < numbers[i]){
                max = numbers[i];
            }
        }
        System.out.println("配列内の最も小さい数値は「" + min + "」です");
        System.out.println("配列内の最も大きい数値は「" + max + "」です");
    }

    public static void practice3() {

        /*
         * 以下の配列を作成してください(newでも初期化子でも可)。
         * 
         * データ型：int[]
         * 配列名：numbers
         * データ：32,79,35,25,82,77,34,16,61,39
         * 
         * numbers配列内で偶数と奇数を検索し表示してください。
         * 
         * 実行結果は以下のようにしてください。
         * 配列内の偶数は以下の数値です
         * 32
         * 82
         * 34
         * 16
         * 配列内の奇数は以下の数値です
         * 79
         * 35
         * 25
         * 77
         * 61
         * 39
         */
        int[] numbers = {32,79,35,25,82,77,34,16,61,39};

        System.out.println("配列内の偶数は以下の数値です");
        // 偶数を表示する処理
        for(int i= 0;i < numbers.length;i++){
            if(numbers[i] % 2 == 0){
                System.out.println(numbers[i]);
            }
        }

        System.out.println("配列内の奇数は以下の数値です");
        // 奇数を表示する処理
        for(int i= 0;i < numbers.length;i++){
            if(numbers[i] % 2 != 0){
                System.out.println(numbers[i]);
            }
        }
    }

    public static void practice4() {

        /*
         * 以下の配列を2次元配列で作成してください(newでも初期化子でも可)。
         * データ型：String[][]
         * 配列名：week
         * データ：以下の2つの配列を組み合わせた二次元配列
         * {"日","月","火","水","木","金","土"}
         * {"Sun.","Mon.","Tue.","Wed.","Thu.","Fri.","Sat."}
         * 
         * 「○曜日は英語では○です」という表示を全曜日分表示されるようにしてください。
         * ただし、配列とループ文を利用して表示してください。
         * 
         * 実行結果は以下のようにしてください。
         * 日曜日は英語ではSun.です
         * 月曜日は英語ではMon.です
         * 火曜日は英語ではTue.です
         * 水曜日は英語ではWed.です
         * 木曜日は英語ではThu.です
         * 金曜日は英語ではFri.です
         * 土曜日は英語ではSat.です
         */
        String[][] week = {{"日","月","火","水","木","金","土"},{"Sun.","Mon.","Tue.","Wed.","Thu.","Fri.","Sat."}};
        for(int i = 0;i < 7;i++){
            System.out.println(week[0][i] + "曜日は英語では" + week[1][i] + "です");
        }
    }

    public static void practice5() {

        /*
         * 以下のプログラムを完成させてください。
         * specified_color(コメントアウトを解除して使用)で指定された色が見つかった場合、
         * 対応する英語の色を表示できるようにしてください。
         * また、指定の色が見つかったらループは終了するようにしてください。
         * 
         * 例：specified_colorが黄の場合、Yellowが表示される
         * 
         * 実行結果は以下のようにしてください。
         * Purple
         */
        
        String[][] colors = {{"赤", "青", "黄", "緑", "白", "黒", "灰", "紫"},
                {"Red", "Blue", "Yellow", "Green", "White", "Black", "Gray", "Purple"}};

        // 日本語の指定色
        int colorNumber;
        String specified_color = "紫";
        for(colorNumber = 0; colorNumber < colors[0].length; colorNumber++){
            if(specified_color == colors[0][colorNumber]){
                break;
            }
        }
        System.out.println(colors[1][colorNumber]);
    }
}
