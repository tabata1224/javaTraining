package consallink.ecfTech._07_abstraction_diversity.q001;

public class Armor extends Item {
    Armor(String name, int value) {
        super(name, value);
    }

    public void use() {
        System.out.println(name + "を身に着けた");
        System.out.println("守備力が" + value + "上がった");
    }

}
