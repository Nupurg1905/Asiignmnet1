package Oct24th;

public class ques65 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] array = {0, 3, 0, 1, 0, 5, 9, 0};

	        int nonZeroIndex = 0;

	        for (int i = 0; i < array.length; i++) {
	            if (array[i] != 0) {
	                array[nonZeroIndex] = array[i];
	                nonZeroIndex++;
	            }
	        }

	        while (nonZeroIndex < array.length) {
	            array[nonZeroIndex] = 0;
	            nonZeroIndex++;
	        }

	        for (int num : array) {
	            System.out.print(num + " ");
	       

	}
	}
}


