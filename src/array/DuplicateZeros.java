package array;

import java.util.Arrays;

public class DuplicateZeros {

	public static void main(String[] args) {
		int[] nums = { 1, 0, 2, 3, 0, 4, 5, 0 };
		
		System.out.println(Arrays.toString(nums));
		
		duplicateZeros(nums);
		
		System.out.println(Arrays.toString(nums));
	}

	private static void duplicateZeros(int[] arr) {
		int[] temp = new int[arr.length];
		
		for(int i=0, j=0;j<temp.length;j++, i++) {
			if(arr[i] !=0) {
				temp[j] = arr[i];
			}
			else {
				j++;
			}			
		}
		
		for(int i=0;i<temp.length;i++) {
			arr[i] = temp[i];
		}
		
	}

}
