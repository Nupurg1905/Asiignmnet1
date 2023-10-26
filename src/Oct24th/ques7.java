package Oct24th;
import java.util.Scanner;
public class ques7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner (System.in);
		System.out.print("please enter the number: ");
		int num = kb.nextInt();
		if(num==1 || num==2 || num==3) {
			System.out.print("your num is prime");
		}else {
			for (int i =2; i <=num/2; i++) {
				if (num % i ==0) {
					System.out.print("your num in Not prime");
				}else {
					System.out.print("your num is prime");
					return;
				}

			}
			
		}
			

	}

}
