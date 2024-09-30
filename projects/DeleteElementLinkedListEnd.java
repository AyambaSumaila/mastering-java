package HowToProgramJava;

public class DeleteElementLinkedListEnd {


    static class Node {

        int data;
        Node next;

        Node(int value) {
            data = value;
            next = null;
        }
    }

    static Node head;

    static void printList() {
        Node p = head;
        System.out.println("\n[");

        while (p != null) {
            System.out.println(" " + p.data + " ");
            p = p.next;
        }

        System.out.print("]");
    }
}