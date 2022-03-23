package lab2;
import java.util.*;
public class Ex2 {
	
	public static String[] sortStrings(String [] str) {
		String temp;
		
		for(int i =0; i<str.length; i++) {
			for(int j=i+1; j<str.length; j++) {
				if(str[i].compareTo(str[j])>0) {
					temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
		}
		return str;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Size Of The String Array: ");
		int a = sc.nextInt();
		String [] str = new String[a];
		String [] display = new String[a];
		
		for(int i =0; i<str.length; i++) {
			str[i]=sc.next();
		}
		
		display=Ex2.sortStrings(str);
		if(display.length%2!=0) {
			for(int j=0;j<(display.length/2)+1;j++) {
				System.out.println(display[j].toUpperCase());
			}
			for(int k=(display.length/2)+1; k<display.length; k++) {
				System.out.println(display[k].toLowerCase());
			}
		}
		else {
			for(int j=0;j<(display.length/2);j++) {
				System.out.println(display[j].toUpperCase());
			}
			for(int k=(display.length/2); k<display.length; k++) {
				System.out.println(display[k].toLowerCase());
			}
		}
		sc.close();
	}

}
