package HowToProgramJava;

public class LinearSearch {
    static void linearSearch(int arr[], int size, int key)
    {
        int count=0;
       for(int i=0; i<size; i++)
        {
            if(arr[i] ==key)
            {
                System.out.println("Element found at position: "+ (i+1));
                count=count + 1;
            }
        }
        if(count == 0)
        {
            System.out.println("Element is not present in the array");

        }
    }
    //Main function of the program
    public static void main(String args[])
    {
        int i, size, key;
        size=5;
        int arr[]={203, 1992, 384, -30, 49};
        key=-30;
        linearSearch(arr, size, key);
        key=20;
        linearSearch(arr, size, key);
    }
}
