package com.datastructures;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class LinkedList
{
	private static class Node
	{
		int data;
		Node next;
		
		public Node(int data)
		{
			this.data = data;
		}
	}
	
	public Node head;
	
	public void addFront(int data)
	{
		//create new node
		Node newNode = new Node(data);
		
		//if head is null means new node is the first node
		if(head==null)
		{
			head = newNode;
			return;
		}
		
		//else point new node's next to head
		//set new node's next to existing head
		newNode.next = head;
		
		//set new node as new head
		head=newNode;
	}
	
	public void addBack(int data) {
        Node newNode = new Node(data);

        // if head... set and return
        if (head == null) {
            head = newNode;
            return;
        }

        // Else starting at head...
        Node current = head;

        // Walk until to hit tail
        while (current.next != null) {
            current = current.next;
        }

        // Set current node to equal newNode
        current.next = newNode;
        System.out.println("addback done");
    }
	
	public void deleteValue(int data)
	{
		if(head == null)
		{
			return;
		}
		
		if(head.data == data)
		{
			head = head.next;
			return;
		}
		
		Node current = head;
		
		while(current.next != null)
		{
			if(current.next.data == data)
			{
				current.next = current.next.next;
				return;
			}
		}
		
		current = current.next;
	}
	
    public int getFirst() {
        return head.data;
    }
    
    public int size() {

        if (head == null) {
            return 0;
        }

        int count = 1;
        Node current = head;

        while (current.next != null) {
            current = current.next;
            count++;
        }

        return count;
    }
    
    public int getLast() {
        if (head == null) {
            throw new IllegalStateException("Empty list!");
        }

        Node current = head;

        // while we are not at the tail
        while (current.next != null) {
            current = current.next; // O(n)
        }

        // We are at the tail
        return current.data;
    }
	
	

   
	
	public static void main(String[] args)
	{
		LinkedList linkedList = new LinkedList();
		linkedList.addBack(1);
        linkedList.addBack(2);
        linkedList.addBack(3);
        
        linkedList.deleteValue(2);
        
        System.out.println("size is :: "+linkedList.size());
        
	}
}
