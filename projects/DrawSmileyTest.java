package HowToProgramJava;

import javax.swing.*;

public class DrawSmileyTest {
    public static void main(String[] args) {
        DrawsSmiley panel = new DrawsSmiley();
        JFrame application = new JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(230, 250);
        application.setVisible(true);


    }
}