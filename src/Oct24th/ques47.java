package Oct24th;

public class ques47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] nums = { 5.6, 3.2, 8.7, 4.1, 2.9 };
		double sum = 0;
        for (double n : nums) {
            sum = sum + n;
        }

        double average = sum / (nums.length);

        System.out.println("the avg is: " + average);

	}
	

}
