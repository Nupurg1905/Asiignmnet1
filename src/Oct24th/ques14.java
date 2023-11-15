package Oct24th;
import java.util.Scanner;
public class ques14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner eq = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String s1 = eq.nextLine();

        System.out.print("Enter the second string: ");
        String s2 = eq.nextLine();

        if (s1.equals(s2)) {
            System.out.println("The two strings are equal.");
        } else {
            System.out.println("The two strings are not equal.");

	}
        eq.close();

}
}
