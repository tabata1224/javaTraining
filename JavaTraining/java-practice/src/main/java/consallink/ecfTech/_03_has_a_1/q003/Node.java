package consallink.ecfTech._03_has_a_1.q003;

public class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
    }

    public void display() {
        System.out.println(this.value);
    }
}
