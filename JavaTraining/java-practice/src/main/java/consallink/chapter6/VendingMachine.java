package consallink.chapter6;

import java.util.Scanner;

public class VendingMachine {

    public int sumMoney = 0;//投入した金額
    public String scanDrink; //入力されたドリンク
    int count = 0;//購入可能な商品の数

    public String[] drinkArray = new String[3];//飲料を格納する配列

    Drink iro = new Drink("いろはす", 110, 1);
    Drink cola = new Drink("コーラ", 160, 2);
    Drink mon = new Drink("モンスター", 210, 3);

    //お金の受け取りの処理
    public void money(Scanner sc) {
        int scanMoney = 0;
        while (true) {
            Print.print("お金を入れて\n何円入れる？");
            try {
                scanMoney = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                Print.print("数字を入力して");
            }

            sumMoney = sumMoney + scanMoney;
            scanMoney = 0;
            Print.print("投入金額:" + sumMoney + "円");

            while (true) {
                Print.print("まだお金入れる？ (y / n):");
                String scanFinish = sc.nextLine();
                if ("n".equals(scanFinish)) {
                    return;
                } else if ("y".equals(scanFinish)) {
                    break;
                }
            }
        }
    }

    //購入可能な飲料を表示
    public void display() {
        if (iro.price <= sumMoney) {
            Print.print("買える飲料");
            Print.printItem(iro.drinkNumber, iro.name, iro.price);
            count++;
        }
        if (cola.price <= sumMoney) {
            Print.printItem(cola.drinkNumber, cola.name, cola.price);
            count++;
        }
        if (mon.price <= sumMoney) {
            Print.printItem(mon.drinkNumber, mon.name, mon.price);
            count++;
        }
    }

    //飲料を選び購入
    public void buyDrink(Scanner sc) {
        if (sumMoney < iro.price) {
            if (sumMoney == 0) {
                Print.print("お金を入れてないから何も買えない");
                return;
            } else {
                Print.print("買える飲料のないので" + sumMoney + "円返金");
                sumMoney -= sumMoney;
                return;
            }
        } else {
            while (true) {
                Print.print("買う飲料の番号を入力するか「r」と入力（返金される）");
                scanDrink = sc.next();
                if (scanDrink.equals(String.valueOf(iro.drinkNumber)) && 1 <= count) {
                    Print.print(iro.name + "を買った");
                    this.sumMoney -= iro.price;
                    return;
                } else if (scanDrink.equals(String.valueOf(cola.drinkNumber)) && 2 <= count) {
                    Print.print(cola.name + "を買った");
                    this.sumMoney -= cola.price;
                    return;
                } else if (scanDrink.equals(String.valueOf(mon.drinkNumber)) && 3 <= count) {
                    Print.print(mon.name + "を買った");
                    this.sumMoney -= mon.price;
                    return;
                } else if ("r".equals(scanDrink)) {
                    return;
                } else {
                    Print.print("その番号の飲料はない");
                }
            }
        }
    }

    //おつり処理
    public void changeDischarge() {
        if ("r".equals(scanDrink)) {
            Print.print(sumMoney + "円返金");
            sumMoney -= sumMoney;
        } else if (0 < sumMoney) {
            Print.print("おつりは" + sumMoney + "円");
            sumMoney -= sumMoney;
        }
    }
}
