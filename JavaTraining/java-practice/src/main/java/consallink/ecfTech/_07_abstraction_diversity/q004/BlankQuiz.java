package consallink.ecfTech._07_abstraction_diversity.q004;

public class BlankQuiz extends Quiz {
    int blankCount;

    BlankQuiz(String main, int blankCount) {
        super(main);
        this.blankCount = blankCount;
    }

    public void displayHeade() {
        System.out.println("「次の文の空欄を埋めなさい」");
    }

    public void displayMain() {
        super.displayMain();
        for (int i = 1; i <= this.blankCount; i++) {
            System.out.println(i + ". ______________");
        }
    }
}
