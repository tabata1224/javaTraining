package consallink.ecfTech._04_has_a_2.q003;

public class Main {
    public static void main(String[] args) {
        Message msg1 = new Message("今日はいい天気。散歩でも行こうかな");
        msg1.setReaction(new Reaction("(^ ^)", 3));
        msg1.setReaction(new Reaction("(^o^)d", 2));
        msg1.setReaction(new Reaction("(- -;)", 0));

        Message msg2 = new Message("あれ～、買ったばかりの消しゴムがない");
        msg2.setReaction(new Reaction("(^ ^)", 1));
        msg2.setReaction(new Reaction("(^o^)d", 0));
        msg2.setReaction(new Reaction("(- -;)", 3));

        //①msg1のdisplayメソッドを呼び出す
        msg1.display();
        System.out.println();

        //②msg2のdisplayメソッドを呼び出す
        msg2.display();
    }
}
