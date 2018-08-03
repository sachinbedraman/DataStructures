package org.sachin.datastructures.tree;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter line : ");
		String nextLine = scanner.nextLine();
		System.out.print("LINE : " + nextLine + " LENGTH : " + nextLine.length());
	}
}
