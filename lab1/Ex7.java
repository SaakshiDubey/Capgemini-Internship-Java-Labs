package lab1;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		//int a1 = IncreasingNum.checkNumber(a);
		/*if(a1==0)
			System.out.println("Increasing Number");
		else
			System.out.println("Not Increasing Number");*/
		System.out.println(Ex7.checkNumber(a));
		sc.close();
		
	}
	
	static boolean checkNumber(int n) {
		boolean i = true;
		while(n>0) {
			int a1=n%10;
			n=n/10;
			int a2 = n%10;
			
			if(a2>a1) {
				i = false;
				break;
			}
		}
		return i;
		
	}
}
