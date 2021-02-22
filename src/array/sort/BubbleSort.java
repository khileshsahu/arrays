package array.sort;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = { 5, 3, 1, 9, 8, 2, 4, 7 };// {5, 4, 3, 2, 1, 0};

		bubble_sort(arr, arr.length);
	}

	static void bubble_sort(int A[], int n) {
		int temp;
		System.out.println(Arrays.toString(A));
		for (int k = 0; k < n - 1; k++) {
			// (n-k-1) is for ignoring comparisons of elements which have already been
			// compared in earlier iterations

			for (int i = 0; i < n - k - 1; i++) {
				System.out.println("index " + i + " " + (i+1));
				System.out.println(A[i] + " " + A[i + 1]);
				if (A[i] > A[i + 1]) {
					// here swapping of positions is being done.
					temp = A[i];
					A[i] = A[i + 1];
					A[i + 1] = temp;
				}
				System.out.println(Arrays.toString(A));
			}
			System.out.println("------" + k);
		}
	}
}
