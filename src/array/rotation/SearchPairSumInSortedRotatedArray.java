package array.rotation;

public class SearchPairSumInSortedRotatedArray {

	public static void main(String[] args) {
		int[] arr = new int[] {11, 15, 6, 8, 9, 10};
		
		System.out.println("Found: " + findPairWithSum(arr, 16));
		System.out.println("Found: " + findPairWithSum(arr, 35));
		System.out.println("Found: " + findPairWithSum(arr, 45));
		System.out.println("Found: " + findPairWithSum(arr, 14));
	}

	private static boolean findPairWithSum(int[] arr, int x) {
		int n  = arr.length;
		int largestNumIndex = findLargestNumIndex(arr);
		int smallestNumIndex = (largestNumIndex + 1) % n;
		
		 while (smallestNumIndex  != largestNumIndex) 
	        { 
	             // If we find a pair with sum x, we 
	             // return true 
	             if (arr[smallestNumIndex ] + arr[largestNumIndex] == x) 
	                  return true; 
	       
	             // If current pair sum is less, move  
	             // to the higher sum 
	             if (arr[smallestNumIndex ] + arr[largestNumIndex] < x) 
	                  smallestNumIndex  = (smallestNumIndex  + 1) % n; 
	                    
	             else  // Move to the lower sum side 
	                  largestNumIndex = (n + largestNumIndex - 1) % n; 
	        }
		return false;
	}

	private static int findLargestNumIndex(int[] arr) {
		int i = 0;
		for(; i<arr.length; i++) {
			if(arr[i+1] < arr[i]) {
				break;
			}
		}
		return i;
	}

}
