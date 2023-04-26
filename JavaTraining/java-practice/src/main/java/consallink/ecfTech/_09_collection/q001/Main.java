package consallink.ecfTech._09_collection.q001;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("りんご");
        fruits.add("みかん");
        fruits.add("バナナ");
        fruits.add("ぶどう");

        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }
    }
}
