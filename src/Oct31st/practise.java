package Oct31st;
import java.util.Scanner;
public class practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner (System.in);
		System.out.print("Please enter the value of num1");
		double num1 = kb.nextDouble();
		
		System.out.print("Please enter the value of num2");
		double num2 = kb.nextDouble();
		
		System.out.print("Please give me operator");
		
		char op = kb.next().charAt(0);
		
		if(op == '+') {
			System.out.print(add(num1,num2));
			
		}else if (op =='-') {
			System.out.print(sub(num1,num2));
		}
		else if (op =='*') {
			System.out.print(mul(num1,num2));
		}
		else if (op =='/') {
			System.out.print(div(num1,num2));
		}				
		kb.close();
	}
	
		public static double add(double x,double y) {
			return x+y;}
			
		public static double sub(double x,double y) {
			return x-y;}
		public static double div(double x,double y) {
			return x/y;}
		public static double mul(double x,double y) {
			return x*y;}
}

