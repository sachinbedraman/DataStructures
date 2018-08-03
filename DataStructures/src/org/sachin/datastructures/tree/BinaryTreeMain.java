package org.sachin.datastructures.tree;

public class BinaryTreeMain {
	public static void main(String[] args) {
		// int[] data = { 10, 5, 6, 7, 8, 11, 10, 24 };
		int[] data = { 10, 5, 12, 11, 13, 4, 7 };

		BinaryTree tree = new BinaryTree(data);

		System.out.println("Tree Height : " + tree.height());

		// tree.preOrder();

		tree.inOrder();
		// tree.mirror();
		tree.inOrder();
		System.out.println("Wave traversal");
		tree.waveTraverse();

		// System.out.println(1 << 30);
	}
}
