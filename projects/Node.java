package HowToProgramJava;

class Node {
    public int data;
    public int key;
    public Node next;
    public Node prev;
    public Node(int data, int key)
    {
        this.data=data;
        this.key=key;
        this.next=null;
        this.prev=null;
    }
    public static class MainDoublyLinked {
        static Node head=null;
        static Node last=null;
        static Node current=null;

        public static boolean is_empty()
        {
            return head==null;
        }

        public static void print_list()
        {

            Node ptr=head;
            while(ptr !=null)
            {
                System.out.println("(" + ptr.key + ", " + ptr.data + ")");
                ptr=ptr.next;
            }
        }

        public static void insert_first(int key, int data)
        {
            Node link=new Node(data, key);
            if(is_empty())
            {
                last=link;
            }
            else{
                head.prev=link;
            }
            link.next=head;
            head=link;
        }

        public static void main(String[] args)
        {
            insert_first(1, 20);
            insert_first(2, 93);
            insert_first(3, 100);
            insert_first(4, 48);
            insert_first(5, 90);
            System.out.println("Doubly Linked List:");
            print_list();

        }

    }
}


