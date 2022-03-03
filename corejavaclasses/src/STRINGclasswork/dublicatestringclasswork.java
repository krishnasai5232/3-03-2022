package STRINGclasswork;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class dublicatestringclasswork {
	 static void removeDuplicate(char str[], int n)
	    {
	       // Create a set using String characters
	    // excluding '\0'
	        HashSet<Character> s = new LinkedHashSet<>(n - 1);
	      // HashSet doesn't allow repetition of elements
	        for (char x : str)
	            s.add(x);
	 
	        // Print content of the set
	        for (char x : s)
	            System.out.print(x);
	    }
	  public static void main(String[] args)
	    {
	        char str[] = "geeksforgeeks".toCharArray();
	        int n = str.length;
	 
	        removeDuplicate(str, n);
	    }
}
