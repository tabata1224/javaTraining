package consallink.chapter6;

import java.util.List;
import java.util.Scanner;

public class VendingMachine {
    private int sumMoney = 0; //投入した金額
    private String scanDrink; //入力されたドリンクの番号
    private List<Drink> drinkStock;//飲料をストックする
    private int minPrice; //一番安い飲料の値段

    //コンストラクタ
    VendingMachine(List<Drink> drinkStock) {
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

    private String builder(String... strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s);
        }
        return sb.toString();
    }

    //一番安い飲料の値段を見つける
    private void findMinPrice() {
        this.minPrice = this.drinkStock.get(0).price;
        for (int i = 1; i < this.drinkStock.size(); i++) {
            if (this.drinkStock.get(i).price < this.minPrice) {
                this.minPrice = this.drinkStock.get(i).price;
            }
        }
    }

    //お金の受け取りの処理
    private void receiptMoney(Scanner sc) {
        int scanMoney;
        System.out.println("お金を入れて\n何円入れる？");
        try {
            scanMoney = Integer.parseInt(sc.nextLine());
            this.sumMoney += scanMoney;
            System.out.println(builder("\n",
                    "----------------------------------------------------------------"));
            System.out.println(builder("\n", "投入金額:", String.valueOf(this.sumMoney), "円"));
        } catch (NumberFormatException e) {
            System.out.println(builder("\n",
                    "----------------------------------------------------------------"));
            System.out.println(builder("\n", "数字を入力して"));
            receiptMoney(sc);
            return;
        }

        while (true) {
            System.out.println(builder("\n", "まだお金入れる？ (y / n)"));
            String scanFinish = sc.nextLine();
            System.out.println(builder("\n",
                    "----------------------------------------------------------------"));
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
        if (this.sumMoney < this.minPrice) {
            // 買えないときの表示処理
            if (this.sumMoney <= 0) {
                System.out.println(builder("\n", "お金を入れてないから何も買えない"));
            } else {
                System.out.println(
                        builder("\n", "買える飲料が無いので" + String.valueOf(this.sumMoney) + "円返金"));
                this.sumMoney = 0;
            }
            return false;
        }
        //買えるときの表示処理
        System.out.println(builder("\n", "買える飲料"));
        for (int i = 0; i < this.drinkStock.size(); i++) {
            if (this.drinkStock.get(i).price <= this.sumMoney) {
                System.out.println(
                        builder("\n", String.valueOf(i + 1), ":", this.drinkStock.get(i).name,
                                String.valueOf(this.drinkStock.get(i).price), "円"));
                this.drinkStock.get(i).isBuy = true;
            }
        }
        return true;
    }

    //購入処理
    private void buyDrink(Scanner sc) {
        System.out.println(builder("\n", "買う飲料の番号を入力するか「r」と入力（返金される）"));
        this.scanDrink = sc.next();
        System.out.println(
                builder("\n", "----------------------------------------------------------------"));
        if ("r".equals(this.scanDrink)) {
            return;
        }
        try {
            int chooseNumber = Integer.parseInt(this.scanDrink) - 1;
            if (0 <= chooseNumber && chooseNumber < this.drinkStock.size()
                    && this.drinkStock.get(chooseNumber).isBuy) {
                System.out.println(builder(this.drinkStock.get(chooseNumber).name, "を買った"));
                this.sumMoney -= this.drinkStock.get(chooseNumber).price;
                return;
            }
            System.out.println(builder("\n", "その番号の飲料は無い"));

        } catch (NumberFormatException e) {
            System.out.println(builder("\n", "数字を入力して"));
        }
        display();
        buyDrink(sc);
    }

    //返金処理
    private void dischargeChange() {
        if ("r".equals(this.scanDrink)) {
            System.out.println(builder(String.valueOf(this.sumMoney), "円返金"));
        } else if (0 < this.sumMoney) {
            System.out.println(builder("おつりは", String.valueOf(this.sumMoney), "円"));
        }
        this.sumMoney = 0;
    }
}
