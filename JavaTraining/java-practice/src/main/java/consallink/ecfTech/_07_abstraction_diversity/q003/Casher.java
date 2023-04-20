package consallink.ecfTech._07_abstraction_diversity.q003;

public class Casher {
    public static int payment(int amount, Coupon coupon) {
        return coupon.discount(amount);
    }
}
