package consallink.chapter6;

public class Main {
    public static void main(String[] args) {

        Drink iro = new Drink("いろはす", 110);
        Drink cola = new Drink("コーラ", 160);
        Drink mon = new Drink("モンスター", 210);
        Drink pokari = new Drink("ポカリ", 130);
        Drink coffee = new Drink("コーヒー", 300);

        Drink[] drinkStock = {iro, cola, mon, pokari, coffee};

        VendingMachine vendingMachine = new VendingMachine(drinkStock);

        vendingMachine.start();
    }
}
