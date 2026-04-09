package com.linkedList;

class Nodes {
	
    int data;
    Nodes next;

    Nodes(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MergeLinkedList {

    // Merge two sorted lists
    public static Nodes merge(Nodes head1, Nodes head2) {

        Nodes dummy = new Nodes(0);
        Nodes current = dummy;

        while (head1 != null && head2 != null) {
            if (head1.data < head2.data) {
                current.next = head1;
                head1 = head1.next;
            } else {
                current.next = head2;
                head2 = head2.next;
            }
            current = current.next;
        }

        if (head1 != null) current.next = head1;
        else current.next = head2;

        return dummy.next;
    }

    public static void printList(Nodes head) {
        System.out.print("Merged List: ");

        while (head != null) {
            System.out.print(head.data);

            if (head.next != null) { 
                System.out.print(" → ");
            }

            head = head.next;
        }
    }

    public static void main(String[] args) {

        Nodes head1 = new Nodes(1);
        head1.next = new Nodes(3);
        head1.next.next = new Nodes(5);

        Nodes head2 = new Nodes(2);
        head2.next = new Nodes(4);
        head2.next.next = new Nodes(6);

        Nodes merged = merge(head1, head2);

        printList(merged);
    }
}