package HowToProgramJava;

import java.awt.*;

public class MoveTester {
    public static void main(String[] args)
    {
        Rectangle box=new Rectangle(5, 10, 20, 30);
        box.translate(15, 25);
        System.out.println("X: ");
        System.out.println(box.getX());
        System.out.println("Expected: 20");
        System.out.println("Y: ");
        System.out.println(box.getY());
        System.out.println("Expected: 35");

    }

}
