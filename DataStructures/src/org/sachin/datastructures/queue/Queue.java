package org.sachin.datastructures.queue;

public class Queue {

	int capacity;
	private int[] queue;

	private int size;
	int front;
	int rear;

	public Queue(int capacity) {
		this.capacity = capacity;
		this.queue = new int[capacity];
		this.size = 0;
		front = 0;
		rear = capacity - 1;

	}

	public boolean isEmpty() {
		return this.size == 0;
	}

	public boolean isFull() {
		return this.size == this.capacity;
	}

	public void enqueue(int item) {
		if (isFull()) {
			System.out.println("Queue is full");
			return;
		}

		this.rear = (this.rear + 1) % this.capacity;
		this.queue[this.rear] = item;
		this.size++;
	}

	public int dequeue() {

		if (isEmpty()) {
			System.out.println("Queue is empty");
			return Integer.MIN_VALUE;
		}

		int item = queue[front];

		this.front = (this.front + 1) % capacity;
		this.size--;
		return item;
	}

}
