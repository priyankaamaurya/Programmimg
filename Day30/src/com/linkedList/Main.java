package com.linkedList;

// Node class
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// LinkedList class
class LinkedList1 {

    static Node head;

    public static void add(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node currentNode = head;

        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }

        currentNode.next = newNode;
    }

    public static void display() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node temp = head;

            while (temp != null) {
                System.out.print(temp.data + " -> "); // FIXED print
                temp = temp.next;
            }
            System.out.println("null");
        }
    }
}

// Main class (only public class)
public class Main {
    public static void main(String[] args) {

        LinkedList1 ll = new LinkedList1();

        ll.add(1);
        ll.add(2);

        ll.display();
    }
}



