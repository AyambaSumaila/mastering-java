package HowToProgramJava;

import javax.swing.*;
public class EmptyFrameViewer {
public static void main(String[] args)
{
    JFrame myFrame=new JFrame();
    myFrame.setSize(300, 400);
    myFrame.setTitle("This is an Empty Frame");
    myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    myFrame.setVisible(true);


}

}
