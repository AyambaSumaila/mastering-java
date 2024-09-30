
import java.util.Scanner;
//import java.Math;
public class Second {

    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = myScanner.nextLine();

        System.out.print("Enter your age: ");
        int age = myScanner.nextInt();

        System.out.print("Enter your gpa: ");
        double gpa = myScanner.nextDouble();

        System.out.print("Enter your major: ");
        String major = myScanner.nextLine();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
        System.out.println("Major: " + major);


        myScanner.close();

    }
}
