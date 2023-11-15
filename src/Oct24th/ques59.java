package Oct24th;
import java.util.Arrays;
public class ques59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 2, 3, 4, 4, 5};
		System.out.println("Previous Array:" + Arrays.toString(arr));

		int current = arr[0];
		boolean found = false;
		
		for(int i=0; i<arr.length; i++) {
			if (current == arr[i] && !found) {
		        found = true;
		    } else if (current != arr[i]) {
		        System.out.print(" " + current);
		        current = arr[i];
		        found = false;
		    }
		}
		System.out.print(" " + current);
	}
}
