package consallink.chapter6.vending;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Drink> drinkStock = new ArrayList<Drink>();

        try {
            File file = new File(
                    "/workspaces/Java-training/JavaTraining/java-practice/src/main/java/consallink/chapter6/vending/drink.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String str = null;
            while ((str = br.readLine()) != null) {
                String[] nums = str.split(" ");
                drinkStock.add(new Drink(nums[0], Integer.parseInt(nums[1])));
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }

        VendingMachine vendingMachine = new VendingMachine(drinkStock);

        vendingMachine.start();
    }
}
