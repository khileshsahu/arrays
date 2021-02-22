package array.rotation;

public class ClockWiseRotation {

	public static void main(String[] args) {
		int[] arr = new int[] {11, 15, 6, 8, 9, 10};
		
		rotateClockWiseAndPrintEachElement(arr, 2);
	}

	private static void rotateClockWiseAndPrintEachElement(int[] arr, int totalRotations) {
			int index = 0; 
			int count = 0;
			while(true) {
				System.out.println(arr[index]);			
				
				if(index+1 == arr.length) {
					count++;
				}
				
				if(count == totalRotations) {
					break;
				}
				index = (index+1) % arr.length;
			}
	}

}
