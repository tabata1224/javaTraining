package consallink.ecfTech._06_inheritance_2.q002;

public class SeniorMember extends Member {
    SeniorMember() {
        super("シニア会員");
    }

    public int getMonthlyFee() {
        return (int) (super.getMonthlyFee() * 0.7);
    }
}
