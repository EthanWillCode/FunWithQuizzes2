public abstract class Question {

    static int questionNumber = 1;
    String question;

    int questionId;

    boolean isCorrect;

    public Question(String question, boolean isCorrect) {
        this.question = question;
        this.questionId = questionNumber++;
        this.isCorrect = isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }

    @Override
    public String toString() {
        return "Question #" + questionId + ": " + question;
    }

//    public abstract String isCorrect();
}
