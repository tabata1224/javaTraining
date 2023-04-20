package consallink.ecfTech._07_abstraction_diversity.q004;

public class MultipleChoiceQuiz extends Quiz {
    String main;
    String[] answers;

    MultipleChoiceQuiz(String main, String[] answers) {
        super(main);
        this.answers = answers;
    }

    public void displayHeader() {
        System.out.println("「次の問いについて、正しいものを４つの中から選びなさい」");
    }

    public void displayMain() {
        super.displayMain();
        for (int i = 1; i <= answers.length; i++) {
            System.out.println(i + ":" + answers[i - 1]);
        }
    }
}
