package array;

import java.util.Arrays;

public class MergeSortedArray {

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		int m = 3;

		int[] nums2 = { 2, 5, 6 };
		int n = 3;
		
		System.out.println(Arrays.toString(nums1));
		
		mergeArray(nums1, nums2, m, n);
		
		System.out.println(Arrays.toString(nums1));
	}

	private static void mergeArray(int[] nums1, int[] nums2, int m, int n) {
		for(int i=0, j=0; i<nums1.length;) {
			int num1 = nums1[i];
			int num2 = nums2[j];
			
			if(i >= m) {
				nums1[i] = nums2[j];
				j++;
				i++;
			}			
			else if(nums1[i] <= nums2[j]) {
				i++;
			}
			else {
				insertAtIndex(nums1, nums2[j], i);
				j++;
				i++;
				m++;
			}
		}
	}
	
	private static void insertAtIndex(int[] nums, int num, int index) {
		for(int i=nums.length-2; i>=index;i--) {
			nums[i+1] = nums[i];
		}
		nums[index] = num;
	}

}
