package Oct24th;
import java.util.Arrays;
public class ques50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 2, 3, 4, 5};
		System.out.println("original Array :" + Arrays.toString(array));
        
		int Remove = 3;//give position of array which you want to remove

        for(int i = Remove; i < array.length-1; i++) {
        	array[i] = array[i+1];
                
            }
        System.out.println("Array after removing " + Remove + ": " + Arrays.toString(array));

        }

        

}