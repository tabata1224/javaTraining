package consallink.chapter2;

public class Training2_6 {

    public static void main(String[] args) {
        // 実行したい練習問題のコメントアウトを外そう
        //practice1();
        practice2();
    }

    public static void practice1() {

        // 以下の変数を作成してください
        // 【型】String 【変数名】name 【初期値】"パソコン" 【補足】商品名
        String name = "パソコン";

        // 【型】int 【変数名】pcPrice 【初期値】123500 【補足】値段
        int pcPrice = 123500;

        // 【型】int 【変数名】pcNumber 【初期値】13 【補足】購入台数
        int pcNumber = 13;
        // 【修飾子】final 【型】double 【変数名】TAX_RATE 【初期値】1.08 【補足】消費税[
        final double TAX_RATE = 1.08;

        // 
        // 実行結果は以下のようにしてください。
        // パソコンを13台購入します。
        // 合計は1605500円です。
        // 税込み価格は1733940円です。

        // 適切な個所に変数を利用して出力を追加してください
        // ただし、税込み価格の小数点は表示しないものとします
        System.out.println(name + "を" + pcNumber + "台購入します。");
        System.out.println("合計は" + pcPrice * pcNumber + "円です。");
        System.out.println("税込み価格は" + Math.round(pcPrice * pcNumber * TAX_RATE) + "円です。");
    }

    public static void practice2() {

        // 以下の変数を作成してください
        // 【型】char 【変数名】hiragana 【初期値】'あ'
        char hiragana = 'あ';

        // 【型】int 【変数名】code 【初期値】「hiragana」のデータをintへキャストして代入
        int code = (int)hiragana;
        // 
        // 実行結果は以下のようにしてください。
        // 変数hiraganaには「あ」が保存されています。
        // 「あ」の文字コードは12354
        // codeの文字コードをインクリメントすると「ぃ」となります。

        // 適切な個所に変数を利用して出力を追加してください
        System.out.println("変数hiraganaには「" + hiragana + "」が保存されています。");
        System.out.println("「" + hiragana + "」の文字コードは" + code);

        // codeにインクリメントおよびキャストを行って出力に追加してください
        System.out.println("codeの文字コードをインクリメントすると「" + (char)++code + "」となります。");
    }
}
