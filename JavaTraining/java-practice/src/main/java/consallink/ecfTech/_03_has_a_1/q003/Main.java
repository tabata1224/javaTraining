package consallink.ecfTech._03_has_a_1.q003;

public class Main {
    public static void main(String[] args) {
        Node n1 = new Node(5);
        Node n2 = new Node(8);
        Node n3 = new Node(12);
        Node n4 = new Node(7);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        //各ノードの値を表示する
        Node now = n1;
        while (now != null) {
            now.display();
            now = now.next;
        }
    }

}
