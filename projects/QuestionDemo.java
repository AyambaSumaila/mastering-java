package HowToProgramJava;

import java.util.Scanner;

public class QuestionDemo {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Question q = new Question();
        q.setText("Who was the inventor of Java?");
        q.setAnswer("James Gosling");

        q.display();
        System.out.println("Your answer: ");
        String response = userInput.nextLine();

        System.out.println(q.checkAnswer(response));

    }
}
