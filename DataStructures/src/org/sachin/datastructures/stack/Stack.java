package org.sachin.datastructures.stack;

public class Stack {
	int size;
	int[] innerStack;
	int top;

	public Stack(int size) {
		this.size = size;
		innerStack = new int[size];
		top = -1;
	}

	public void push(int element) {
		if (isFull()) {
			System.out.println("Stack is full");
		} else {
			innerStack[++top] = element;
		}
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty !!");
		} else {
			return innerStack[top--];
		}
		return 0;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == size - 1;
	}
}
