package consallink.ecfTech._07_abstraction_diversity.q003;

public class FixedCoupon implements Coupon {
    private int discountAmount;

    public FixedCoupon(int discountAmount) {
        this.discountAmount = discountAmount;
    }

    public int discount(int amount) {
        return amount - this.discountAmount;
    }
}
