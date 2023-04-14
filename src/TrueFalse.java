public class TrueFalse extends Question{

    public TrueFalse(String question, boolean isCorrect) {
        super(question, isCorrect);
    }

    public void rightAnswer() {
        if (this.isCorrect) {
            System.out.println("Correct!");
        } else {
            System.out.println("False!");
        }
    }
}
