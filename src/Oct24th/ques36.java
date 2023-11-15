package Oct24th;
import java.util.Scanner;
public class ques36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = kb.nextInt();

        int square = 0;
        int count = 0;

        while (count < number) {
            square += number; 
            count++;
        }

        System.out.println("The square of " + number + " is: " + square);

        kb.close();


	}

}
