package array.rotation;

import java.util.Arrays;

public class Juggling {
	public static void main(String[] args) {
		int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7};
		int n = 7;
		int d = 2;
		
		System.out.println(Arrays.toString(rotate(arr, d, n)));
	}

	private static int[] rotate(int[] arr, int d, int n) {
		int i, j, k, temp; 
        int g_c_d = gcd(d, n); 
        for (i = 0; i < g_c_d; i++) { 
            /* move i-th values of blocks */
            temp = arr[i]; 
            j = i; 
            while (true) { 
                k = j + d; 
                if (k >= n) 
                    k = k - n; 
                if (k == i) 
                    break; 
                arr[j] = arr[k]; 
                j = k; 
            } 
            arr[j] = temp; 
        }
        return arr;
	}

	private static int gcd(int a, int b) {
		if (b == 0) 
            return a; 
        else
            return gcd(b, a % b); 
	}
}
