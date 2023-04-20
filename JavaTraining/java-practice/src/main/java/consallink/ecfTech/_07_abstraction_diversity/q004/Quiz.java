package consallink.ecfTech._07_abstraction_diversity.q004;

public class Quiz {
    private String main;

    Quiz(String main) {
        this.main = main;
    }

    public void displayHeader() {
        System.out.println("「次の問いに答えなさい」");
    }

    public void displayMain() {
        System.out.println(main);
    }
}
