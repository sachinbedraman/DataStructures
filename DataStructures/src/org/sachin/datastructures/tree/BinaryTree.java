package org.sachin.datastructures.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryTree {
	private Node root;

	public BinaryTree(int data) {
		root = new Node(data);
	}

	public BinaryTree(int[] dataArray) {
		root = new Node(dataArray[0]);

		for (int i = 1; i < dataArray.length; i++)
			addNode(dataArray[i]);
	}

	public void addNode(int data) {
		addNode(root, data);
	}

	private Node addNode(Node node, int data) {

		if (node == null) {
			return new Node(data);
		}

		if (data < node.getData()) {
			node.setLeft(addNode(node.getLeft(), data));
		} else {
			node.setRight(addNode(node.getRight(), data));
		}

		return node;
	}

	public int height() {
		return height(root);
	}

	private int height(Node node) {
		if (node == null) {
			return 0;
		}

		int lHeight = height(node.left);
		int rHeight = height(node.right);

		int heightValue = Math.max(lHeight, rHeight) + 1;

		return heightValue;
	}

	public void preOrder() {
		preOrder(root);
		System.out.println();
	}

	private void preOrder(Node node) {
		if (node == null)
			return;

		System.out.print(node.getData() + " ");

		preOrder(node.getLeft());

		preOrder(node.getRight());
	}

	public void inOrder() {
		inOrder(root);
		System.out.println();
	}

	void inOrder(Node node) {
		if (node == null)
			return;

		inOrder(node.left);
		System.out.print(node.data + " ");
		inOrder(node.right);
	}

	public void postOrder() {
		preOrder(root);
		System.out.println();
	}

	public void mirror() {
		mirror(root);
	}

	void mirror(Node node) {

		if (node == null)
			return;

		mirror(node.left);
		mirror(node.right);

		Node temp = node.left;
		node.left = node.right;
		node.right = temp;
	}

	void waveTraverse() {
		int height = height();
		waveTraverse(Arrays.asList(root), 0, 0);
	}

	void waveTraverse(List<Node> nodes, int currentLevel, int maxLevel) {

		if (nodes.isEmpty())
			return;

		List<Node> nextList = new ArrayList<>();
		for (Node node : nodes) {
			System.out.print(node.data + " ");

			if (node.getLeft() != null)
				nextList.add(node.getLeft());

			if (node.getRight() != null)
				nextList.add(node.getRight());
		}
		System.out.println();
		waveTraverse(nextList, 0, 0);
	}

	static class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
		}

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

		public Node getLeft() {
			return left;
		}

		public void setLeft(Node left) {
			this.left = left;
		}

		public Node getRight() {
			return right;
		}

		public void setRight(Node right) {
			this.right = right;
		}
	}

}
