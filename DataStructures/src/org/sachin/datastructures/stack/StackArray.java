package org.sachin.datastructures.stack;

public class StackArray {

	private static int STACK_SIZE = 5;

	private int[] stack = new int[STACK_SIZE];
	private int pointer = -1;

	private boolean isFull() {
		return pointer == (STACK_SIZE - 1);
	}

	private boolean isEmpty() {
		return pointer < 0;
	}

	public void print() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
		} else {
			for (int i : stack) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

	}

	public void push(int element) {
		if (isFull()) {
			System.out.println("Stack is full");
		} else {
			stack[++pointer] = element;
			print();
		}
	}

	public int pop() {
		return stack[pointer--];
	}

	public static void main(String[] args) {
		StackArray lStackArray = new StackArray();
		lStackArray.push(10);
		lStackArray.push(20);
		lStackArray.push(30);
		lStackArray.push(40);
		lStackArray.push(50);
		lStackArray.push(60);
	}
}
