package Oct24th;
import java.util.*;
public class ques55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr = {1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 9, 1, 9};
        
        
        System.out.println("Previous Array:"+ Arrays.toString(arr));
        for (int i = 0; i < arr.length-1; i++) {
        	for (int j = i+1; j < arr.length; j++) {
        		if((arr[i] == arr [j]) && (i !=j)) {
        			System.out.println("repeated is  "+ arr [j]);
        		}
        	}
        }
            
	}

}
