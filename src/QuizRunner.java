import java.util.Scanner;

public class QuizRunner {
    public static void main(String[] args) {

       int correct = 0;
       TrueFalse one = new TrueFalse("Is one hour for this studio nuts (Enter True or False)?",true);
        MultipleChoice q1 = new MultipleChoice("What is the formula to find the area of a sphere?", false,
                "A. Area equals 4 times the Radius times Pi Squared.\nB. Area equals 4/3 Pi times Radius Cubed.\nC. One word: Google\nD. Area equals Radius + Pi Cubed.");
       Checkbox three = new Checkbox("Select 3", true);

        Scanner input = new Scanner(System.in);
        System.out.println(one.question);
        boolean userString = input.nextBoolean();
        if (userString) {
            System.out.println("Correct\n");
            correct++;
        } else {
            System.out.println("Wrong\n");
        }
//

        Scanner input2 = new Scanner(System.in);
        System.out.println(q1.question);
        System.out.println(q1.potentialAnswers);
        String userAnswer = input2.next();
        System.out.println(userAnswer);
        if (userAnswer.equals("a") || userAnswer.equals("A")){
            System.out.println("Correct");
            correct++;
        } else {
            System.out.println("Wrong");
        }


        System.out.println("\nYou got " + correct + " correct!");


    }
}