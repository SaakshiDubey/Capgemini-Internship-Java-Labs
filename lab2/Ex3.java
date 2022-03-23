package lab2;

import java.util.*;

public class Ex3 {

	public static int[] getSorted(int[] arr) {
		int o = arr.length;
		int[] arr1 = new int[o];
		int k =0;
		for (int i = 0; i < arr.length; i++) {
			int rev = 0, b;
			while (arr[i] > 0) {
				b =arr[i] % 10;
				rev = b + (rev* 10);
				arr[i] = arr[i] / 10;
			}
			arr1[k] = rev;
			k+=1;
			
		}
		return arr1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size Of Array: ");

		int a = sc.nextInt();
		int[] arr = new int[a];
		int[] sorted = new int[a];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		sorted = Ex3.getSorted(arr);
		int temp;
		for (int ii = 0; ii < sorted.length; ii++) {
			for (int jj = ii + 1; jj < sorted.length; jj++) {
				if (sorted[ii] > sorted[jj]) {
					temp = sorted[ii];
					sorted[ii] = sorted[jj];
					sorted[jj] = temp;
				}
			}
		}
		for(int aa : sorted) {
			System.out.println(aa);
		}
	}
}
