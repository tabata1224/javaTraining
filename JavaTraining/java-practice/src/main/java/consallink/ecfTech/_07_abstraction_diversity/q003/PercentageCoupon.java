package consallink.ecfTech._07_abstraction_diversity.q003;

public class PercentageCoupon implements Coupon {
    double rate;

    PercentageCoupon(double rate) {
        this.rate = rate;
    }

    public int discount(int amount) {
        return (int) (this.rate * amount);
    }
}
