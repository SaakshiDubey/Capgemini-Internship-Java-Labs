package lab2;
import java.util.Arrays;
import java.util.Scanner;
public class Ex1 {
	
	public static int getSecondSmallest(int[] arr,int size) {
		int temp;
		/*for(int i =0;i<size; i++) {
			for(int j =i+1; j<size;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}*/
		Arrays.sort(arr);
		return arr[1];
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter size of the array: ");
	int sizeOfArray = sc.nextInt();
	int[] arr= new int[sizeOfArray];
	for(int i =0; i<arr.length; i++) {
		arr[i]= sc.nextInt();
	}
	System.out.println(Ex1.getSecondSmallest(arr, sizeOfArray));
	sc.close();
	
}
}
