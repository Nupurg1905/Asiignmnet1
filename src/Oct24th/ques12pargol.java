package Oct24th;
import java.util.Scanner;
public class ques12pargol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("please give me a character : ");
		char mychar = kb.next().charAt(0);
		
		char lowmychar = Character.toLowerCase(mychar);
		if(lowmychar == 'a'|| lowmychar == 'e'||
				lowmychar == 'i' || lowmychar == 'o' ||
				lowmychar == 'u') {
					System.out.print("it is vowel");
				}else {
					System.out.print("it is consonant");
				}
		kb.close();

	}

}
