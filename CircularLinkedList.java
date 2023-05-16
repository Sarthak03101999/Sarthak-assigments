package com.CircularLinkedList;

public class CircularLinkedList {
	 class Node {
	        int data;
	        Node next;

	        Node(int data) {
	            this.data = data;
	        }
	    }

	    private Node head;

	    
	    void insert(int data) {
	        Node newNode = new Node(data);

	        if (head == null) {
	            head = newNode;
	            newNode.next = head;
	        } else if (data <= head.data) {
	            newNode.next = head;
	            Node temp = head;
	            while (temp.next != head) {
	                temp = temp.next;
	            }
	            temp.next = newNode;
	            head = newNode;
	        } else {
	            Node current = head;
	            while (current.next != head && current.next.data < data) {
	                current = current.next;
	            }
	            newNode.next = current.next;
	            current.next = newNode;
	        }
	    }

	    
	    void display() {
	        if (head == null) {
	            System.out.println("Circular linked list is empty.");
	            return;
	        }

	        Node current = head;
	        do {
	            System.out.print(current.data + " ");
	            current = current.next;
	        } while (current != head);
	        System.out.println();
	    }

	public static void main(String[] args) {
		 CircularLinkedList list = new CircularLinkedList();
	        list.insert(10);
	        list.insert(20);
	        list.insert(30);
	        list.insert(40);

	        System.out.println("Circular linked list after insertion:");
	        list.display();

	}

}
