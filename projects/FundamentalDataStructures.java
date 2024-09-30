package HowToProgramJava;

public class FundamentalDataStructures {


    public void insertionSort(char[] data)
    {
        int size=data.length;

        for(int i=1; i<size; i++)
        {
            char cur=data[i];
            int j=i;
            while(j > 0 && data[j-1] > cur)
            {
                data[j]=data[j-1];
                j--;
            }
            data[j]=cur;
        }
    }

    public static void main(String[] args)
    {
        FundamentalDataStructures arr=new FundamentalDataStructures();

        //arr.insertionSort(['A', 'N', 'P', 'B']);
    }
}
