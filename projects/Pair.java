package HowToProgramJava;

public class Pair <A, B>{
    A first;
    B second;
    public  Pair(A a, B b)
    {
        first=a;
        second=b;
    }

    public A getFirst()
    {
        return first;
    }
    public B getSecond()
    {
        return second;
    }


    public class Portfolio<T>
    {
        T[] data;
        public  Portfolio(int capacity)
        {
            //data=new T[capacity];
            //data=(T[]) new Object([capacity]);


        }
    }

    public class GenericDemo{

        public static <T> void reverse(T[] data)
        {
            int low=0, high=data.length - 1;

            while(low < high)
            {
                T temp=data[low];
                data[low++]=data[high];
                data[high--]=temp;
            }
        }
    }

}
