package consallink.ecfTech._07_abstraction_diversity.q001;

public class Main {
    public static void main(String[] args) {
        Item[] items = {new Buki("鉄の剣", 20), new Armor("皮の服", 10)};
        for (Item item : items) {
            item.use();
        }
    }
}
