package HowToProgramJava;

import javax.swing.*;
import java.awt.*;

public class DrawsSmiley  extends JPanel{
    public void painComponent(Graphics g)
    {
        super.paintComponent(g);
        //Draw face the face
        g.setColor(Color.YELLOW);
        g.fillOval(10, 10,200, 200);

        //Draw the eyes
        g.setColor(Color.BLACK);
        g.fillOval(55, 65, 30, 30);
        g.fillOval(135, 65, 30, 30);
        //Draw the mouth
        g.fillOval(50, 110, 120, 60);
        //Draw "touch up" the mouth into a smile
        g.setColor(Color.YELLOW);
        g.fillRect(50, 110, 120, 30);
        g.fillRect(50, 120, 120, 40);

    }

    }

