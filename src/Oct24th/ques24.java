package Oct24th;
import java.util.Scanner;
public class ques24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
        int counter = 0;
        for(int i= 1; i <=num; i++) {
        	if(num% i== 0) {
        		counter++;
        	}
        }
        if(counter ==2) {
        	System.out.println("Prime");
        }else {
        	System.out.println("Not Prime");
        }

        
        input.close();
    }


	}

