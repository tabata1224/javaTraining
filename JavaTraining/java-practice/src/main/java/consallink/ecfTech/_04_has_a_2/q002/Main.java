package consallink.ecfTech._04_has_a_2.q002;

public class Main {
    public static void main(String[] args) {
        Member taro = new Member("タロウ");
        Member hanako = new Member("ハナコ");

        Coupon silver = new Coupon("シルバー", 0.2);
        Coupon gold = new Coupon("ゴールド", 0.5);

        taro.setCoupon(silver);
        hanako.setCoupon(gold);

        //①taroの持つuseCouponメソッドを呼び出します。引数は2000とします。
        //　戻り値は、変数payを宣言して受け取ります。
        int pay = taro.useCoupon(2000);
        System.out.println("割引額は" + pay + "円です。");

        //②hanakoの持つuseCouponメソッドを呼び出します。引数は2000とします。
        //　戻り値は、変数payで受け取ります。
        pay = hanako.useCoupon(2000);
        System.out.println("割引額は" + pay + "円です。");
    }
}
