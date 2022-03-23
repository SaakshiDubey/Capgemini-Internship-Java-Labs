package lab1;
import java.util.Scanner;
public class Ex1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(Ex1.calculateCubesSum(a));
		sc.close();
	}
	
	static int calculateCubesSum(int n) {
		int sum =0,b;
		while(n>0) {
			b=n%10;
			sum+=(b*b*b);
			n/=10;
		}
		return sum;
	}

}
