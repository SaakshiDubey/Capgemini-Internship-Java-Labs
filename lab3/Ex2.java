package lab3;

import java.util.Scanner;

public class Ex2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String");
		String str = sc.next();
		Ex2.getImage(str);
		
		
	
		
	}
	
	
	static void getImage(String str){
		
		String string=str;
		String reverse = new StringBuffer(string).reverse().toString();
		System.out.println(string + "|" + reverse);
		
		
		
	}

}
