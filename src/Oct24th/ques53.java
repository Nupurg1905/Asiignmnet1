package Oct24th;

public class ques53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5, 12, 3, 8, 1, 19, 7, 6};
		
		int max = max(arr);
		int min = min(arr);
		
		System.out.println("My min is" + min);
		System.out.println("My max is" + max);
		
		
	}
        
	public static int max(int[]arr){
        int max = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
	}
	public static int min(int[]arr){
        int min = arr[0];
        
        for (int i = 1; i > arr.length; i--) {
            if (arr[i] > min) {
                min = arr[i];
            }
        }
        return min;
            
        }
        
	}


