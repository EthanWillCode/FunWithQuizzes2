public class MultipleChoice extends Question {
    String potentialAnswers;

    public MultipleChoice(String question, boolean isCorrect, String potentialAnswers) {
        super(question, isCorrect);
        this.potentialAnswers = potentialAnswers;
    }


}