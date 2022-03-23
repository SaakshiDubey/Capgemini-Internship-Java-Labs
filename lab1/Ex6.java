package lab1;
import java.util.Scanner;
public class Ex6 {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a = sc.nextInt();
		
		System.out.println(Ex6.calculateDiffrence(a));
		sc.close();
	}
	
	static int calculateDiffrence(int n) {
		
		int sum = 0,sum1 =0, diff;
		
		for(int i = 1; i <= n; i++) {
			
			sum = sum +(i*i);
			sum1 = sum1 +i;
		}
		diff = (sum1 *sum1) - sum;
		return diff;
	}

}
