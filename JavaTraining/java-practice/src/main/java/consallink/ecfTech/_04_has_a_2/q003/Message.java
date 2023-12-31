package consallink.ecfTech._04_has_a_2.q003;

public class Message {
    String sentence;
    Reaction[] reactions = new Reaction[3];
    int count;

    Message(String sentence) {
        this.sentence = sentence;
    }

    public void setReaction(Reaction reaction) {
        this.reactions[this.count] = reaction;
        this.count++;
    }

    public void display() {
        System.out.println(sentence);
        System.out.println("----------");
        for (int i = 0; i < this.count; i++) {
            this.reactions[i].display();
            System.out.print(" ");
        }
        System.out.println();
    }
}
