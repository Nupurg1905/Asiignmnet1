package Oct24th;

public class ques54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        System.out.println("Original array:");
        printArray(arr);
        
        reverseArray(arr);
        
        System.out.println("\nReversed array:");
        printArray(arr);
    }
    
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            start++;
            end--;
        }
    }
    
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();


	}

}
