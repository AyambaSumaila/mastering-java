package HowToProgramJava;

public class BinarySearch {
    static void binary_search(int arr[], int low, int high, int key)
    {
        int mid=(low+high)/2;
        if(low <= high)
        {
            if(arr[mid] == key)
                System.out.println("Element found at index: " + mid);
            else if(key < arr[mid])
                binary_search(arr, low, mid-1, key);
            else if (arr[mid] < key)
                binary_search(arr, mid + 1, high, key);
            else  if(low > high)
                System.out.println("Unsuccessful Search");
        }
    }
    public static void main(String[] args)
    {
        int size, key, low, high;
        size=4;
        low=0;
        high=size -1;
       int arr[]={12, 39, 40, 48};
        key=39;
       binary_search(arr,  low, high, key);
        key=30;

       binary_search(arr, low, high, key);

    }
}
