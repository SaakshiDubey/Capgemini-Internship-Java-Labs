package lab1;
import java.util.*;
public class Ex2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Choice\n 1.RED\n 2.YELLOW\n 3.GREEN\n");
		int a = sc.nextInt();
		
		switch(a) {
		
		case 1:{
			System.out.println("Please Stop!!");
			break;
		}
		case 2:{
			System.out.println("Wait For Some Time!!");
			break;
		}
		case 3:{
			System.out.println("Ready To Go!!");
			break;
		}
		default:
			System.out.println("Please Enter Valid Choice.....");
		}
	}
}
