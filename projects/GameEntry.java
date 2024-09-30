package HowToProgramJava;

public class GameEntry {


    private String name;
    private int score;

    public GameEntry(String n, int s)
    {
        name=n;
        score=s;

    }

    public String getName()
    {
        return name;
    }
    public int getScore()
    {
        return score;
    }
    public String toString()
    {
        return "(" + name + ", " + score + ")";
    }

    public class Scoreboard {
        private int numEntries = 0;
        private GameEntry[] board;

        public Scoreboard(int capacity)
        {
            board=new GameEntry[capacity];
        }
    }

    public void add(GameEntry e)
    {
        int newScore=e.getScore();
        //if(numEntries < board.length || newScore
    }
}
