package Oct24th;
public class ques48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 5, 10, 15, 20, 25 };

        int checkValue = 15;

        boolean isthere = false;

        for (int n : nums) {
            if (n == checkValue) {
                isthere = true;
                break; 
            }
        }

        if (isthere) {
            System.out.println("Yes it contains " + checkValue);
        } else {
            System.out.println("No it is not contain " + checkValue);

	}

	}
}
