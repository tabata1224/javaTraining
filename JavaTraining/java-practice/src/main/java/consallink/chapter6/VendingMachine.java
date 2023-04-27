package consallink.chapter6;

import java.util.Scanner;

public class VendingMachine {
    private int sumMoney = 0; //投入した金額
    private String scanDrink; //入力されたドリンクの番号
    private Drink[] drinkStock;//飲料をストックする
    private int minPrice; //一番安い飲料の値段

    //コンストラクタ
    VendingMachine(Drink[] drinkStock) {
        this.drinkStock = drinkStock;
    }

    //自販機メソッド
    public void start() {
        Scanner sc = new Scanner(System.in);

        findMinPrice();

        receiptMoney(sc);

        boolean canBuy = display();
        if (canBuy) {
            buyDrink(sc);
        }

        dischargeChange();

        sc.close();
    }

    //一般の表示
    private void print(String str) {
        System.out.print("\n" + str + "\n");
    }

    //商品の表示
    private void printItem(Drink drink, int drinkNumber) {
        System.out.println(drinkNumber + 1 + " : " + drink.name + " : " + drink.price + "円");
    }

    //一番安い飲料の値段を見つける
    private void findMinPrice() {
        minPrice = drinkStock[0].price;
        for (int i = 1; i < drinkStock.length; i++) {
            if (drinkStock[i].price < minPrice) {
                minPrice = drinkStock[i].price;
            }
        }
    }

    //お金の受け取りの処理
    private void receiptMoney(Scanner sc) {
        int scanMoney;
        print("お金を入れて\n何円入れる？");
        try {
            scanMoney = Integer.parseInt(sc.nextLine());
            sumMoney += scanMoney;
            print("----------------------------------------------------------------");
            print("投入金額:" + sumMoney + "円");
        } catch (NumberFormatException e) {
            print("数字を入力して");
            receiptMoney(sc);
            return;
        }

        while (true) {
            print("まだお金入れる？ (y / n)");
            String scanFinish = sc.nextLine();
            print("----------------------------------------------------------------");
            if ("y".equals(scanFinish)) {
                receiptMoney(sc);
                return;
            } else if ("n".equals(scanFinish)) {
                return;
            }
        }
    }

    //購入可能な飲料を表示
    private boolean display() {
        if (sumMoney < minPrice) {
            // 買えない時の表示処理
            if (sumMoney == 0) {
                print("お金を入れてないから何も買えない");
            } else {
                print("買える飲料が無いので" + sumMoney + "円返金");
                sumMoney = 0;
            }
            return false;
        }
        print("買える飲料");
        for (int i = 0; i < drinkStock.length; i++) {
            if (drinkStock[i].price <= sumMoney) {
                printItem(drinkStock[i], i);
                drinkStock[i].isBuy = true;
            }
        }
        return true;
    }

    //購入処理
    private void buyDrink(Scanner sc) {
        print("買う飲料の番号を入力するか「r」と入力（返金される）");
        scanDrink = sc.next();
        print("----------------------------------------------------------------");
        if ("r".equals(scanDrink)) {
            return;
        }
        try {
            int chooseNumber = Integer.parseInt(scanDrink) - 1;
            if (chooseNumber < 0 || drinkStock.length <= chooseNumber
                    || !drinkStock[chooseNumber].isBuy) {
                print("その番号の飲料は無い");
            } else if ((drinkStock[chooseNumber].isBuy)) {
                print(drinkStock[chooseNumber].name + "を買った");
                sumMoney -= drinkStock[chooseNumber].price;
                return;
            }

        } catch (NumberFormatException e) {
            print("数字を入力して");
        }
        display();
        buyDrink(sc);
    }

    //おつり処理
    private void dischargeChange() {
        if ("r".equals(scanDrink)) {
            print(sumMoney + "円返金");
        } else if (0 < sumMoney) {
            print("おつりは" + sumMoney + "円");
        }
        sumMoney = 0;
    }
}
