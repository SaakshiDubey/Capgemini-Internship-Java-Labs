package lab1;
import java.util.Scanner;
public class Ex3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a==0)
			System.out.println("Enter Valid Number....");
		else {
			int count = 2, a1 ,b1 , c1;
			a1=1;
			b1=1;
			if(a==1 || a==2)
				System.out.println("1");
	
			else {
				while(true) {
				c1 =a1+b1;
				count+=1;
				a1=b1;
				b1=c1;
				if(count==a) {
					System.out.println(c1);
					break;
				}
				}
				
			}
			
			
		}
	sc.close();	
	}

}
