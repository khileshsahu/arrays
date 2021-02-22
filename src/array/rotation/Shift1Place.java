package array.rotation;

import java.util.Arrays;

public class Shift1Place {
	public static void main(String[] args) {
		int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7};
		int n = 7;
		int d = 2;
		
		System.out.println(Arrays.toString(rotate(arr, d, n)));
	}

	private static int[] rotate(int[] arr, int d, int n) {
		for(int j=0; j<d; j++) {
			int temp = arr[0];
			for(int i=1; i<n; i++) {
				arr[i-1] = arr[i];
			}
			arr[n-1] = temp;
		}
		
		return arr;
	}
}
