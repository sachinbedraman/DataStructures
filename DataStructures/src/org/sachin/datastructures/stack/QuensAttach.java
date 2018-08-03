package org.sachin.datastructures.stack;

import java.io.IOException;
import java.util.Scanner;

public class QuensAttach {

	// Complete the queensAttack function below.
	static int queensAttack(int n, int k, int r_q, int c_q, int[][] obstacles) {
		int count = 0;
		int[][] board = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j] = -1;
			}
		}

		for (int i = 0; i < obstacles.length; i++) {
			int[] position = obstacles[i];
			int row = position[0] - 1;
			int column = position[1] - 1;
			board[row][column] = 0;
		}

		board[r_q - 1][c_q - 1] = 1;
		print(board);

		measure(board, r_q - 1, c_q - 1, count);

		return count;
	}

	static void measure(int[][] board, int row, int col, int n) {

		// This has exceeded the limit, so return.
		if (row > n || col > n || row < 0 || col < 0) {
			return;
		}

		// Obstacle - return
		if (board[row][col] == 0) {
			return;
		}

		// Means queen can move in this direction.
		if (board[row][col] == -1) {
			board[row][col] = 1;
		}

		// This is position of the queen and is marked
		if (board[row][col] == 1) {
			// go right
			measure(board, row, col + 1, n);
			// go left
			measure(board, row, col - 1, n);
			// go up
			measure(board, row - 1, col, n);
			// go down
			measure(board, row + 1, col, n);
		}

	}

	static void print(int[][] arr) {
		for (int[] a : arr) {
			for (int b : a) {
				System.out.print(b + " ");
			}
			System.out.println();
		}
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		String[] nk = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nk[0]);

		int k = Integer.parseInt(nk[1]);

		String[] r_qC_q = scanner.nextLine().split(" ");

		int r_q = Integer.parseInt(r_qC_q[0]);

		int c_q = Integer.parseInt(r_qC_q[1]);

		int[][] obstacles = new int[k][2];

		for (int i = 0; i < k; i++) {
			String[] obstaclesRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int j = 0; j < 2; j++) {
				int obstaclesItem = Integer.parseInt(obstaclesRowItems[j]);
				obstacles[i][j] = obstaclesItem;
			}
		}

		int result = queensAttack(n, k, r_q, c_q, obstacles);

		System.out.println(result);

		// bufferedWriter.write(String.valueOf(result));
		// bufferedWriter.newLine();

		// bufferedWriter.close();

		scanner.close();
	}
}
