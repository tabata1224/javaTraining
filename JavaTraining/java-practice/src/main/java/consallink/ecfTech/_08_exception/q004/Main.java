package consallink.ecfTech._08_exception.q004;

public class Main {
    public static void main(String[] args) {
        try {
            double weight = Double.parseDouble(args[0]);
            double height = Double.parseDouble(args[1]);
            System.out.println("BMI = " + getBMI(weight, height));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("2つの数値を指定してください");
        }
    }

    public static double getBMI(double weight, double height) {
        if (weight < 0 || height < 0) {
            throw new IllegalArgumentException("負の数を用いることはできません");
        }
        return weight / (height * height);
    }
}
