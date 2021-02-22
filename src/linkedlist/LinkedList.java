package linkedlist;

public class LinkedList {
	Node head;  // head of list 
	  
    /* Node Class */
    class Node { 
        int data; 
        Node next; 
           
        // Constructor to create a new node 
        Node(int d) {data = d; next = null; } 
    }
    
    public void push(int newData) {
    	Node node = new Node(newData);
    	node.next = this.head;
    	this.head = node;
    }
    
    /* Given a key, deletes the first occurrence of key in linked list */
    void deleteNode(int key) 
    { 
        // Store head node 
        Node temp = head, prev = null; 
  
        // If head node itself holds the key to be deleted 
        if (temp != null && temp.data == key) 
        { 
            head = temp.next; // Changed head 
            return; 
        } 
  
        // Search for the key to be deleted, keep track of the 
        // previous node as we need to change temp.next 
        while (temp != null && temp.data != key) 
        { 
            prev = temp; 
            temp = temp.next; 
        }     
  
        // If key was not present in linked list 
        if (temp == null) return; 
  
        // Unlink the node from linked list 
        prev.next = temp.next; 
    }
    
    public boolean isExist(int data) {
    	Node node = head;
    	while(node != null) {
    		if(node.data == data) {
    			return true;
    		}
    	}
    	return false;
    }
    
    public void printList() 
    { 
        Node tnode = head; 
        while (tnode != null) 
        { 
            System.out.print(tnode.data+" "); 
            tnode = tnode.next; 
        } 
    }
}
