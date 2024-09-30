package HowToProgramJava;

public class Question {

    private String text;
    private String answer;

    public  Question()
    {
        text="";
        answer="";

    }

    public void setText(String qText)
    {
        text=qText;
    }
    public void setAnswer(String correctRes)
    {
        answer=correctRes;
    }

    public boolean checkAnswer(String response)
    {
        return response.equals(answer);

    }
    public void display()
    {
        System.out.println(text);
    }

    }