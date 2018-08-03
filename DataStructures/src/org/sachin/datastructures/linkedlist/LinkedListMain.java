package org.sachin.datastructures.linkedlist;

public class LinkedListMain {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5 };

		LinkedList lList = new LinkedList();

		lList.add(arr);

		lList.print();

		lList.reverse();
		lList.print();

		lList.add(0);
		lList.print();

		lList.reverse();
		lList.print();

		lList.reverse1();
		lList.print();
	}
}
