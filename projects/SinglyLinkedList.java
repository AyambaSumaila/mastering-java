package HowToProgramJava;

public class SinglyLinkedList {
    static class node{
        int data;
        node next;

        node(int value)
        {
            data=value;
            next=null;
        }


    }

    static  node head;

    static void printList()
    {
        node p=head;
        System.out.println("\n[");

        while(p!=null)
        {
            System.out.println(" " + p.data + " ");
            p=p.next;
        }
        System.out.println("]");
    }

    static void insertatbegin(int data)
    {
        node lk=new node(data);

        lk.next=head;
        head=lk;
    }

    public static void main(String[] args)
    {
        int k=0;
        insertatbegin(12);
        insertatbegin(90);
        insertatbegin(18);
        insertatbegin(38);
        insertatbegin(48);
        System.out.println("Linked List: ");
        printList();
    }
}
