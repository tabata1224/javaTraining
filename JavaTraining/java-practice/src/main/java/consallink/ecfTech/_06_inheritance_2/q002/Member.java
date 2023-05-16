package consallink.ecfTech._06_inheritance_2.q002;

public class Member {
    private String name;
    private int MonthlyFee;

    public Member(String name) {
        this.name = name;
        this.MonthlyFee = 8000;
    }

    public String getName() {
        return this.name;
    }

    public int getMonthlyFee() {
        return this.MonthlyFee;
    }

    public boolean isUsable(int hour) {
        return true;
    }
}
