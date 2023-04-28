package consallink.chapter6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        Drink[] drinkStock = new Drink[5];

        try {
            File file = new File(
                    "/workspaces/Java-training/JavaTraining/java-practice/src/main/java/consallink/chapter6/drink.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String str = null;
            int n = 0;
            while ((str = br.readLine()) != null) {
                String[] nums = str.split(" ");
                drinkStock[n] = new Drink(nums[0], Integer.parseInt(nums[1]));
                n++;
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
