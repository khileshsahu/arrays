package array.rotation;

import java.util.Arrays;

public class NormalApproach {

	public static void main(String[] args) {
		int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7};
		int n = 7;
		int d = 2;
		
		System.out.println(Arrays.toString(rotate(arr, d, n)));
	}

	private static int[] rotate(int[] arr, int d, int n) {
		int[] rotateArr = new int[n];
		int[] tempArr = new int[d];
		
		for(int i=0; i<d; i++) {
			tempArr[i] = arr[i];
		}
		
		for(int k=0, j=d; j<n; j++, k++) {
			rotateArr[k] = arr[j];
		}
		
		for(int m=n-d, l=0; m<n; m++, l++) {
			rotateArr[m] = tempArr[l];
		}
		
		return rotateArr;
	}

}
