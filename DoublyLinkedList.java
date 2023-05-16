package com.DoublyLinkedList;

public class DoublyLinkedList {
	class Node {
        int data;
        Node previous;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node head;

    // Function to traverse the doubly linked list in the forward direction
    void traverseForward() {
        if (head == null) {
            System.out.println("Doubly linked list is empty.");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Function to traverse the doubly linked list in the backward direction
    void traverseBackward() {
        if (head == null) {
            System.out.println("Doubly linked list is empty.");
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.previous;
        }
        System.out.println();
    }

    // Function to insert a new node at the end of the doubly linked list
    void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.previous = current;
        }
    }
	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.println("Forward traversal of the doubly linked list:");
        list.traverseForward();

        System.out.println("Backward traversal of the doubly linked list:");
        list.traverseBackward();

	}

}
