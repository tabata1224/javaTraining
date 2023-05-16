package consallink.ecfTech._07_abstraction_diversity.q004;

public class BlankQuiz extends Quiz {
    private int blankCount;

    public BlankQuiz(String main, int blankCount) {
        super(main);
        this.blankCount = blankCount;
    }

    public void displayHeader() {
        System.out.println("「次の文の空欄を埋めなさい」");
    }

    public void displayMain() {
        super.displayMain();
        for (int i = 1; i <= this.blankCount; i++) {
            System.out.println(i + ". ______________");
        }
    }
}
