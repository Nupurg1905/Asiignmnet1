package Oct24th;

public class ques49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 5, 10, 15, 20, 25 };

        int checkValue = 15;

        int index = -1; 

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == checkValue) {
                index = i;
                break; 
            }
        }

        if (index != -1) {
            System.out.println("The index of " + checkValue + " is: " + index);
        } else {
            System.out.println(checkValue + " was not found in the array.");


	}
	}
}
