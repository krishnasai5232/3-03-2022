package arrayclasswork;
import java.util.Arrays;

public class charclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] values = { 'a','d','f','s','d','a','e','f' };
        duplicate(values);
    }

    public static void duplicate(char[] values) {
        Arrays.sort(values);
        int previous = values[0] - 1;
        
        int dupCount = 0;

        for (int i = 0; i < values.length; ++i) {
            if (values[i] == previous) {
                ++dupCount;
            } else {
                previous = values[i];
            }
        }
        System.out.println("There were " + dupCount + " duplicates in the array.");
	}

}

