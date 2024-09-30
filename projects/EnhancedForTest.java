package HowToProgramJava;

public class EnhancedForTest {

    public static void main(String[] args)
    {
        int[] arr={10, 293, 383, 183};

        int total=0;
        for(int  i : arr)
            total +=i;
        System.out.printf("Total of arrays elements: %d%n", total);
    }
}
