package lab1;
import java.util.Scanner;
public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		Ex4.primeTillN(a);
		sc.close();
	}
	
	static void primeTillN(int n) {
		int ii = 0;
		for(int i = 2; i<=n; i++) {
			for(int j = 1;  j<=i+1; j++) {
				if(i % j == 0) {
					ii++;
				}
			}
			if(ii==2)
				System.out.println(i);
			ii = 0;
		}
	}
}
