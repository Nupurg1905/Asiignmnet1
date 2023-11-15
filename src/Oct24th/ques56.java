package Oct24th;
public class ques56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] arr = {"Hello", "coffee", "Tiger", "Lion", "date", "coffee", "Tiger", "date"};
        
        
        for (int i = 0; i < arr.length; i++) {
        	for (int j = i+1; j < arr.length; j++) {
        		if((arr[i].equals(arr[j])) && (i !=j)) {
        			System.out.println("Duplicate values:" + arr[j]);
        		}
        	}
        }
            
	}
}
