package org.sachin.datastructures.linkedlist;

public class LinkedList {
	Node head;

	Node end;

	public void add(int... dataList) {
		for (int i : dataList) {
			add(i);
		}
	}

	public void add(int data) {
		if (head == null) {
			head = new Node(data);
			end = head;
		} else {
			end.setNext(new Node(data));
			end = end.getNext();
		}
	}

	public void print() {
		Node current = head;

		do {
			System.out.print(current.getData() + " ");
		} while ((current = current.getNext()) != null);

		System.out.println();
	}

	void reverse() {
		end = head;

		Node current = head;
		Node previous = null;
		Node next = null;

		while (current != null) {
			next = current.getNext();
			current.setNext(previous);
			previous = current;
			current = next;
		}

		head = previous;
	}

	void reverse1() {
		Node current = head;
		Node previous = null;
		Node next = null;

		while (current != null) {
			next = current.getNext();
			current.setNext(previous);
			previous = current;
			current = next;
		}

	}

}
