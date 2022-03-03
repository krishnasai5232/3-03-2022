package arrayclasswork;
import java.util.Arrays;
public class duplicateclasswork {

	public static void main(String[] args) {
	        int[] values = {4,2,4,2,3,2,3,4,5,7,5 };
	        duplicate(values);
	    }

	    public static void duplicate(int numbers[]) {
	        Arrays.sort(numbers);
	        int previous = numbers[0] - 1;
	        
	        int dupCount = 0;

	        for (int i = 0; i < numbers.length; ++i) {
	            if (numbers[i] == previous) {
	                ++dupCount;
	            } else {
	                previous = numbers[i];
	            }
	        }
	        System.out.println("There were " + dupCount + " duplicates in the array.");
			
	}

}


