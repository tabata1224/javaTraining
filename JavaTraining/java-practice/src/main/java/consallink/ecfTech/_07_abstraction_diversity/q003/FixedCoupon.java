package consallink.ecfTech._07_abstraction_diversity.q003;

public class FixedCoupon implements Coupon {
    int discountAmount;

    FixedCoupon(int discountAmount) {
        this.discountAmount = discountAmount;
    }
    public int discount(int amount) {
        return amount - discountAmount;
    }
}
