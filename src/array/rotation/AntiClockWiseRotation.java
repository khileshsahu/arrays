package array.rotation;

public class AntiClockWiseRotation {

	public static void main(String[] args) {
		int[] arr = new int[] {11, 15, 6, 8, 9, 10};
		
		rotateAntiClockWiseAndPrintEachElement(arr, 2);
	}

	private static void rotateAntiClockWiseAndPrintEachElement(int[] arr, int totalRotations) {
			int index = arr.length - 1; 
			int count = 0;
			while(true) {
				System.out.println(arr[index]);			
				
				if(index == 0) {
					count++;
				}
				
				if(count == totalRotations) {
					break;
				}
				index = (arr.length + index - 1) % arr.length;
			}
	}

}
