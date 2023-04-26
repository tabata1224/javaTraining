package consallink.chapter6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        VendingMachine vendingMachine = new VendingMachine();

        Scanner sc = new Scanner(System.in);

        vendingMachine.money(sc);

        vendingMachine.display();

        vendingMachine.buyDrink(sc);

        vendingMachine.changeDischarge();

        sc.close();
    }
}
