package consallink.ecfTech._06_inheritance_2.q002;

public class Main {
    public static void main(String[] args) {
        Member sei = new Member("正会員");
        SeniorMember senior = new SeniorMember();
        LimitedMember daytime = new LimitedMember("デイタイム会員", 10, 20);
        LimitedMember night = new LimitedMember("ナイト会員", 20, 9);

        System.out.println("各会員料金");
        System.out.println(sei.getName() + ":" + sei.getMonthlyFee());
        System.out.println(senior.getName() + ":" + senior.getMonthlyFee());
        System.out.println(daytime.getName() + ":" + daytime.getMonthlyFee());
        System.out.println(night.getName() + ":" + night.getMonthlyFee());
        System.out.println();
        System.out.println("各会員の22時の利用");
        System.out.println(sei.getName() + ":" + sei.isUsable(22));
        System.out.println(senior.getName() + ":" + senior.isUsable(22));
        System.out.println(daytime.getName() + ":" + daytime.isUsable(22));
        System.out.println(night.getName() + ":" + night.isUsable(22));
    }
}
