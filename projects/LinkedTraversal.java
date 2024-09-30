package HowToProgramJava;

public class LinkedTraversal {

    static class Node{
        int data;
        Node next;
        Node(int value) {
            data = value;
            next = null;
        }
    }
    static Node head;
    //Display List
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
public static void main(String[] args)
{
    int k=0;
    insertatbegin(59);
    insertatbegin(29);
    insertatbegin(30);
    insertatbegin(294);
    insertatbegin(39);
    insertatbegin(20);
    System.out.println("Linked List");
    printList();

}

}
