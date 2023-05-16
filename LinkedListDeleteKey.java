package com.linkedlist;


public class LinkedListDeleteKey {
    static class Node {
        int data;
        Node next;
        
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

	public static void main(String[] args) {
		 Node head = new Node(10);
	        head.next = new Node(20);
	        head.next.next = new Node(30);
	        head.next.next.next = new Node(40);
	        head.next.next.next.next = new Node(50);
	        
	        int key = 30;
	        
	        System.out.println("Original linked list:");
	        printLinkedList(head);
	        
	        head = deleteKey(head, key);
	        
	        System.out.println("Linked list after deleting the first occurrence of " + key + ":");
	        printLinkedList(head);
	    }
	    
	    public static Node deleteKey(Node head, int key) {
	        if (head == null)
	            return null;
	        
	        if (head.data == key)
	            return head.next;
	        
	        Node prev = null;
	        Node current = head;
	        
	        while (current != null && current.data != key) {
	            prev = current;
	            current = current.next;
	        }
	        
	        if (current == null)
	            return head;
	        
	        prev.next = current.next;
	        return head;
	    }
	    
	    public static void printLinkedList(Node head) {
	        Node current = head;
	        
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	        
	        System.out.println();
	    }
	}
	
		



