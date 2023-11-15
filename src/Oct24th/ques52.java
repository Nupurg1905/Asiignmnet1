package Oct24th;
import java.util.Arrays;
public class ques52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 2, 3, 4, 5};
		System.out.println("previous Array:" + Arrays.toString(array));
        int elementToInsert = 10;
        int positionToInsert = 2; 

      
        for (int i = array.length-1; i > positionToInsert; i--) {
            array[i] = array[i-1];
        }

        array[positionToInsert] = elementToInsert;

        System.out.println("New Array" + Arrays.toString(array));

	}

}
