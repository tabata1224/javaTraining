package consallink.ecfTech._04_has_a_2.q002;

public class Member {
    String name;
    Coupon coupon;

    Member(String name) {
        this.name = name;
    }

    public void setCoupon(Coupon coupon) {
        this.coupon = coupon;
    }

    public int useCoupon(int price) {
        return (int) (price * this.coupon.rate);
    }
}
