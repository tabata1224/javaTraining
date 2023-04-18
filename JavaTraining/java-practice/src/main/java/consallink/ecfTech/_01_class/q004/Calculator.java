package consallink.ecfTech._01_class.q004;

public class Calculator {
    double tax;

    public void setTax(double tax) {
        this.tax = tax;
    }

    public int calc(int price) {
        return (int) (price + price * this.tax);
    }
}
