package Oct24th;

public class ques57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array1 = {"apple", "banana", "cherry", "date"};
        String[] array2 = {"banana", "date", "grape", "kiwi"};

        for (String element1 : array1) {
            for (String element2 : array2) {
                if (element1.equals(element2)) {
                    System.out.println("Common element: " + element1);

	}

}
        }
	}
}
