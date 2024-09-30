package HowToProgramJava;

public class DeleteArrayElement {



    public static void main(String [] args)
    {

        int[] arr =new int[3];
        int size=arr.length;

        System.out.println("Array Before Deletion:");

        for(int i=0; i<size; i++)
        {
            arr[i]=1+3;

            System.out.println("Array[" + i + "] = " +arr[i]);

        }
        for(int i=1; i<size-1; i++)
        {
            arr[i]=arr[i+1];
            size=size - 1;
        }

        System.out.println("Array After Deletion: ");
        for(int i=0; i<size; i++)
        {
            System.out.println("Arr[" + i + "] = " + arr[i]);
        }
    }

}
