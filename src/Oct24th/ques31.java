package Oct24th;
import java.util.Scanner;
public class ques31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int n = scanner.nextInt();
        int factorial = 1;
        int i = 1;
        scanner.close();

        while (i <= n) {
                factorial = factorial * i;
                i++;
            }

            System.out.println("The factorial of " + n + " is: " + factorial);
        }

        

	}


