package HowToProgramJava;

public class LinkedListSearchElement {

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

    static int searchList(int key)
    {
        Node temp=head;
        while(temp !=null)
        {
            if(temp.data == key)
            {
                return 1;
            }
            temp=temp.next;
        }
        return 0;
    }
    public  static void main(String[] args)
    {
        int k=0;
        insertatbegin(29);
        insertatbegin(49);
        insertatbegin(57);
        insertatbegin(81);
        insertatbegin(200);
        System.out.println("Linked List:");

        printList();
        int ele=44;

        System.out.println("\nElement to be search is: " + ele);
        k=searchList(ele);

        if(k==1)
            System.out.println("\nElement is found");
        else
            System.out.println("\nElement is not found in the List");

    }
}
