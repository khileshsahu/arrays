package array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Insertion {
	public static void main(String[] args) {
		int[] nums = new int[10];
		
		fillArray(nums);
		
		System.out.println(Arrays.toString(nums));
		
		insertAtIndex(nums, 6, 8);
		
		System.out.println(Arrays.toString(nums));
		
		insertAtStart(nums, 11);
		
		System.out.println(Arrays.toString(nums));
		
		deleteAtIndex(nums, 3);
		
		System.out.println(Arrays.toString(nums));
	}

	private static void deleteAtIndex(int[] nums, int index) {
		for(int i=index;i < nums.length-1; i++) {
			nums[i] = nums[i+1];
		}
		nums[nums.length - 1] = 0;
	}

	private static void insertAtIndex(int[] nums, int num, int index) {
		for(int i=nums.length-2; i>=index;i--) {
			nums[i+1] = nums[i];
		}
		nums[index] = num;
	}

	private static void fillArray(int[] nums) {
		IntStream.range(0, 6)
		.forEach(index -> nums[index] = index);
	}

	private static void insertAtStart(int[] nums, int num) {
		for(int i=nums.length-2;i>=0;i--) {
			nums[i+1] = nums[i];
		}
		nums[0] = num;
	}
}
