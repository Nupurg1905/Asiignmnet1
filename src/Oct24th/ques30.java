package Oct24th;
import java.util.Scanner;
public class ques30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer (N): ");
        int N = scanner.nextInt();
        int sum = 0;
        int i = 1;
        scanner.close();

        while (i <= N) {
                sum = sum + i;
                i++;
            }

            System.out.println("The sum of natural numbers from 1 to " + N + " is: " + sum);
        }

        


	
}
