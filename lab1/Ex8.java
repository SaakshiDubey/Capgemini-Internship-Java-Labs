package lab1;
import java.util.Scanner;
public class Ex8 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b;
		System.out.println(Ex8.checkNumber(a));
		/*if(b==1)
			System.out.println("Yes it is a power of 2");
		else
			System.out.println("Power is not 2");*/
		
		sc.close();
		
	}
	
	static boolean checkNumber(int n) {
		boolean i =true;
		while(n!=1) {
			if(n%2!=0)
				i = false;
			n=n/2;	
		}
		return i;
	}
}
