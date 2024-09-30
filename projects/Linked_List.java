package HowToProgramJava;

public class Linked_List {

    static Node head;

    static class Node{
        int data;
        Node next;
        Node(int value)
        {
            data=value;
            next=null;
        }
    }

    //Display the List
    static void printList(Node node)
    {
        System.out.println("\n[");
        while(node !=null)
        {
            System.out.println(" "  + node.data + " ");
            node =node.next;
        }

        System.out.println("]");
    }

    static Node reverseList(Node head)
    {
        Node prev=null;
        Node cur=head;
        Node temp=null;
        while(cur !=null)
        {
            temp=cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;

        }
        head=prev;
        return head;
    }

    public static void main(String[] args)
    {
        Linked_List list=new Linked_List();
        list.head=new Node(19);
        list.head.next=new Node(167);
        list.head.next.next=new Node(99);
        list.head.next.next.next=new Node(39);

        System.out.println("Linked LIst: ");

        list.printList(head);
        head=list.reverseList(head);
        System.out.println("\n Reversed Linked List");

        list.printList(head);

    }
}

