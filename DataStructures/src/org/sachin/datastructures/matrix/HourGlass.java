package org.sachin.datastructures.matrix;

import java.io.IOException;
import java.util.Scanner;

/**
 * Calculate the maximum sum of all the hour glasses.
 * 
 * https://www.hackerrank.com/challenges/2d-array/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
 * 
 * @author Sachin
 *
 */
public class HourGlass {
	// Complete the hourglassSum function below.
	static int hourglassSum(int[][] arr) {
		int sum = Integer.MIN_VALUE;

		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				int tempSum = getIndividualHourGlassSum(arr, row, col);

				if (tempSum > sum) {
					sum = tempSum;
				}

			}
		}

		return sum;
	}

	static int getIndividualHourGlassSum(int[][] arr, int row, int col) {
		int sum = Integer.MIN_VALUE;

		if (row + 3 > arr[row].length || col + 3 > arr.length) {
			// THis is not a hour glass. Exceed it.
		} else {
			sum = arr[row][col] + arr[row][col + 1] + arr[row][col + 2];
			sum += arr[row + 1][col + 1];
			sum += arr[row + 2][col] + arr[row + 2][col + 1] + arr[row + 2][col + 2];
		}

		return sum;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		int[][] arr = new int[6][6];

		for (int i = 0; i < 6; i++) {
			String[] arrRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int j = 0; j < 6; j++) {
				int arrItem = Integer.parseInt(arrRowItems[j]);
				arr[i][j] = arrItem;
			}
		}

		int result = hourglassSum(arr);
		System.out.println(result);
		scanner.close();
	}
}
