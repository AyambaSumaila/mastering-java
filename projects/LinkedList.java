package HowToProgramJava;

public class LinkedList {

    static class Node{
        int data;
        Node next;
        Node(int value)
        {
            data=value;
            next=null;
        }
    }

    static Node head;

    //Display the list

    static void printList()
    {
        Node p=head;
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
        Node lk=new Node(data);

        lk.next=head;

        head=lk;
    }

    static void deleteNode(int key)
    {
        Node temp=head;
        Node prev=null;
        if(temp !=null && temp.data ==key)
        {
         prev=temp;
         temp=temp.next;
        }

        if(temp == null)
            return;
    }


}
