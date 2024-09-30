package HowToProgramJava;

public class LinkedListComplete {
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
    }
static void insertionAtBegin()
{
    Node lk=new Node(12);
    Node linkedList=head;
    while(linkedList.next !=null)
        linkedList=linkedList.next;
    linkedList.next=lk;

}
static void insertionAfterNode(Node list, int data)
{
    Node lk=new Node(data);
    lk.next=list.next;
    list.next=lk;

}
static void deletionAtBegin()
{
    head=head.next;

}
static void deletionAtEnd()
{
    Node linkedList=head;
    while(linkedList.next.next !=null)
    {
        linkedList=linkedList.next;
    }
    linkedList.next=null;

}
static void deleteNode(int key)
{
   Node temp=head;
   Node prev=null;
   if(temp !=null && temp.data ==key)
   {
       head=temp.next;
       return;
   }
   while(temp !=null && temp.data !=key)
   {
       prev=temp;
       temp=temp.next;
   }
   if(temp ==null) return;
   prev.next=temp.next;
}
static int searchList(int key)
{
    Node temp=head;
    while(temp !=null)
    {
        if(temp.data == key)
        {
            temp=temp.next;
            return 1;
        }
    }
    return 0;
}

public static void main(String[] args)
{
    int k=0;
    insertionAtBegin();
    insertionAtBegin();


}
}