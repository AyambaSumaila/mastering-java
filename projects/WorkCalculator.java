import java.util.Scanner;

public class WorkCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the applied force (F) in newtons:");
        double force = scanner.nextDouble();

        System.out.println("Enter the distance traveled(d) by the object in newtons:");
        double distance = scanner.nextDouble();

        double  work = force * distance;

        System.out.println("Work done by the force on the object: " + work + "joules");
        scanner.close();

    }

}

