package org.sachin.datastructures.stack;

import java.io.IOException;

public class Hopping {
	static int jumpingOnClouds(int[] c) {

		int hop = 0;

		for (int i = 0; i < c.length; i++) {

			if (i + 1 == c.length) {
				i++;
				break;
			}

			if ((c[i] == 0 && c[i + 1] == 0) || (c[i] == 1 && c[i + 1] == 0)) {
				hop++;
			}

		}

		return --hop;
	}

	public static void main(String[] args) throws IOException {

		int result = jumpingOnClouds(new int[] { 0, 0, 1, 0, 0, 1, 0 });
		// int result = jumpingOnClouds(new int[] { 0, 0, 0, 0, 1, 0 });

		System.out.println(result);
	}
}
