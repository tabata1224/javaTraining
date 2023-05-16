package consallink.ecfTech._07_abstraction_diversity.q001;

public abstract class Item {
    public String name;
    public int value;

    public Item(String name, int value) {
        this.name = name;
        this.value = value;
    }

    abstract void use();
}
