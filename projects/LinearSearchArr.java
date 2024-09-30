package HowToProgramJava;

public class LinearSearchArr {


    public static void main(String[] args)
    {
        int  arr[]=new int[5];
        System.out.println("Array:");
        for(int i=0; i<5; i++)
        {
            arr[i]=i +3;
            System.out.println("Arr[" + i + "] = " + arr[i]);
        }

        for(int i=0; i<5; i++)
        {
            if(arr[i] == 6)
            {
                System.out.println("Element " + 6 + " is found at index " + i);
            }
        }
    }
}
